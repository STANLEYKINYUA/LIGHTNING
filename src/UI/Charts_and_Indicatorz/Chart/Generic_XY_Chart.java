package UI.Charts_and_Indicatorz.Chart;

import UI.Charts_and_Indicatorz.Chart_Elements.CandleSticks;
import com.mysql.cj.x.protobuf.MysqlxCursor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generic_XY_Chart extends JPanel implements MouseWheelListener, MouseMotionListener
{

    //Create a List to hold the Data Bars /
    private List<CandleSticks> CandleSticks_LIST;

    private double Scale = 1.0;

    private int translateX = 0;
    private int translateY = 0;

    private int prevMousePoxn_X;
    private int prevMousePoxn_Y;


    //The Constructor
    public Generic_XY_Chart()
    {
        CandleSticks_LIST = new ArrayList<>();
        addMouseWheelListener(this);
        addMouseMotionListener(this);

        Timer   Data_Update_Timer = new Timer (1000, e-> Update_Data());

        Data_Update_Timer.start();

    }


    private void Update_Data()
    {
        //Generate Random Data
        Random rand = new Random();

        int OpenPrice = rand.nextInt(100,105);
        int ClosePrice = rand.nextInt(100,105);
        int HighPrice = Math.max(OpenPrice,ClosePrice) + rand.nextInt(50);
        int LowPrice = Math.min(OpenPrice,ClosePrice) - rand.nextInt(50);

        //Add it to the List of Candles
        CandleSticks_LIST.add( new CandleSticks(OpenPrice,ClosePrice,HighPrice,LowPrice));

        //
        if(CandleSticks_LIST.size() > 50 )
        {
            CandleSticks_LIST.removeFirst();
        }

        repaint();


    }


    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(Scale,Scale);

        g2.translate(translateX , translateY);

        int width = getWidth();
        int height = getHeight();
        int CandleWidth = width/(CandleSticks_LIST.size() + 1);

        //Draw the XY Axis with Grid Markers
        //Draw the Internal Grid Lines

        //Drawing the Candles.
        for (int i = 0; i < CandleSticks_LIST.size(); i++)
        {
            CandleSticks candle = CandleSticks_LIST.get(i);

            int x = (i + 1)* CandleWidth;
            int yOpen = height - candle.Open_Price;
            int yClose = height - candle.Close_Price;
            int yHigh = height - candle.High_Price;
            int yLow = height - candle.Low_Price;

            //Draw the Outer Grid for the Y and X axis
            //Draw the Internal Grid Lines

            //Draw the High - Low Line
            g2.drawLine(x + CandleWidth/2 , yHigh, x + CandleWidth/2 , yLow);

            //Draw the Candle Body
            Rectangle2D.Double   candle_Body = new Rectangle2D.Double(x, Math.min(yOpen,yClose),CandleWidth, Math.abs(yOpen-yClose));

            if(candle.Close_Price > candle.Open_Price)
            {
                g2.setColor(Color.green);
            }
            else
            {
                g2.setColor(Color.red);
            }
            g2.fill(candle_Body);
            g2.setColor(Color.black);
            g2.draw(candle_Body);



        }






    }













    @Override
    public void mouseDragged(MouseEvent e)
    {
        int dx = e.getX() - prevMousePoxn_X;
        int dy = e.getY() - prevMousePoxn_Y;

        translateX += dx;
        translateY += dy;

        prevMousePoxn_X = e.getX();
        prevMousePoxn_Y = e.getY();

        //Create a Max Drag Area that does not hide any candles

        repaint();

    }


    @Override
    public void mouseMoved(MouseEvent e)
    {
        prevMousePoxn_Y = e.getX();
        prevMousePoxn_Y = e.getY();

    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {

        //Zoom Function
        if(e.getPreciseWheelRotation() < 0 )
        {
            Scale *= 1.1;
        }
        else
        {
            Scale /=1.1;
        }

        //Filter movements to prevent moving out of Zoom Range

        repaint();

    }
}
