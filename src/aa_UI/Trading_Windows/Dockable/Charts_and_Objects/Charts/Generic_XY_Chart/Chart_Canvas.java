package aa_UI.Trading_Windows.Dockable.Charts_and_Objects.Charts.Generic_XY_Chart;

import javax.swing.*;
import java.awt.*;

/**Chart Surface where the Chart actually lies */
public class Chart_Canvas extends JPanel
{
    public int Width;
    public int Height;


    public int X_axis_Start;
    public int X_axis_Stop;
    public int X_axis_Offset = 20;  //Offset in Pixels

    public int Y_axis_Start;
    public int Y_axis_Stop;
    public int Y_axis_Offset = 20;  //Offset in Pixels

    /**Constructor for Class */


    public Chart_Canvas()
    {
        //Initialize Graphics

        //Set Background Colour to white  TODO LATER change to based on Theme
        this.setBackground(Color.white);

        //Set the parametres for this drawing canvas
        this.setBounds(10,20,200,800);

        //Fetch Different Cordinates


        // Plot X Axis

        // Plot Y AXIS

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //set the background to white
        this.setBackground(Color.WHITE);

        //Draw the X Axis

       g.drawLine(10,10,200,200);

    }





}
