package aa_UI.Trading_Windows.Dockable.Charts_and_Objects.Charts.Generic_XY_Chart;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**Class that all XY Trading Charts inherit From */
public class _Generic_XY_Chart extends JPanel
{
    private int Chart_Area_Width= 0;


    public _Generic_XY_Chart()
    {
        //Set the Layout of the Chart
        this.setLayout(new MigLayout());

        //Initialize the Chart Area
        Initialize_ChartArea();

        //Plot the X Axis





        //Plot the Y Axis


    }

    private void Initialize_ChartArea()
    {
        //Create a Chart Canvas where the Chart will be plotted.
        JPanel Chart_Canvas = new JPanel();
            //Set the Layout
        Chart_Canvas.setLayout(new MigLayout());
            //Set Background Colour to white  TODO LATER change to based on Theme
        Chart_Canvas.setBackground(Color.white);



            //Add Chart Canvas to the Chart and it should occuppy 85% of the width and 75% of the Height
        this.add(Chart_Canvas,"w 85% , h 75%");

        int Width = Chart_Canvas.getWidth();
        int Height = Chart_Canvas.getHeight();

        String Height_String = Integer.toString(Height);
        String Width_String = Integer.toString(Width);

        System.out.println("The Height and Width of Chart Canvas is : " + Height_String + Width_String );

    }

    private void Plot_X_Axis()
    {

    }


}
