package UI.Charts_and_Indicatorz.Chart_Types.Generic_XY_Chart;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**Chart Surface where the Chart actually lies */
public class Chart_Canvas extends JPanel
{
    public int Width;
    public int Height;



    //Offsets from the End of the Canvas
    public int X_axis_Offsets = 20;  //Offset in Pixels from the Ends of the Screen
    public int Y_axis_Offsets = 20;  //Offset in Pixels from the Ends of the Screen


    //Variables used in Canvas Area Calculation.
    private int Usable_X_Axis_Width;
    private int Usable_Y_Axis_Height;

    //Final Variables for the X and Y Axis
            //X Axis    X axis= (X_x1,X_y1)-(X_x2,X_y2)  ||  Y axis = (Y_x1 , Y_y1) -(Y_x2,Y_y2)

        //All the Coordinates for the X Axis
    private int X_x1_start;
    private int X_x2_stop;
    private int X_y1_start;
    private int X_y2_stop;

        //All Coordinates for the Y axis
    private int Y_x1_start;
    private int Y_x2_stop;
    private int Y_y1_start;
    private int Y_y2_stop;

    /**Constructor for Class */


    public Chart_Canvas()
    {
        //Initialize Graphics

        //Set Background Colour to white  TODO LATER change to based on Theme
        this.setBackground(Color.white);

        //Set the Layout
        this.setLayout(new MigLayout());

        //Set the parametres for this drawing canvas
        this.setBounds(10,20,500,500);



    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //Fetch Graphics Object.
        Graphics2D g2= (Graphics2D) g;

        //Set Rendering Hints
        RenderingHints rh = new RenderingHints
                (
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON


                );

        //set the background to white
        this.setBackground(Color.WHITE);

        //Fetch Width of the Canvas
        int Width = this.getWidth();
        int Height = this.getHeight();


        //Create Line for X axis and then Draw the X Axis
            //Subtract the offsets from the Size of the Panel
            Usable_X_Axis_Width = Width-(X_axis_Offsets * 2);
            Usable_Y_Axis_Height = Height-(Y_axis_Offsets *2);

            //Determine the Start and Stop of the X Axis

            //Determine the Start and Stop of the Y Axis
                    //Cordinates for Y axis Line
            Y_x1_start = X_axis_Offsets;
            Y_y1_start = Height - Y_axis_Offsets;

            Y_x2_stop = X_axis_Offsets;
            Y_y2_stop = Y_axis_Offsets;

                    //Cordinates for the X axis Line
            X_x1_start = X_axis_Offsets;
            X_y1_start = Height - Y_axis_Offsets;

            X_x2_stop = Width - X_axis_Offsets;
            X_y2_stop = Height - Y_axis_Offsets;

            //Convert to Doubles in order to Plot
                    //Plot the X axis
            Line2D X_Axis = new Line2D.Double
                    (
                    Double.valueOf(X_x1_start),
                    Double.valueOf(X_y1_start),
                    Double.valueOf(X_x2_stop),
                    Double.valueOf(X_y2_stop)
                    );
            //Set the Colour before plotting the Line
            g2.setColor(Color.BLUE);
            g2.draw(X_Axis);

                    //Plot the Y axis
            Line2D Y_Axis = new Line2D.Double
                    (
                    Double.valueOf(Y_x1_start),
                    Double.valueOf(Y_y1_start),
                    Double.valueOf(Y_x2_stop),
                    Double.valueOf(Y_y2_stop)
                    );
            //Set the Colour before plotting the Line
            g2.setColor(Color.RED);
            g2.draw(Y_Axis);


            //-------------------------------------------------------------
            // Subdivide the Line into Grids based on the max Zoom Level.
            int Number_of_Points =20;






        //==========================================================



    }







}
