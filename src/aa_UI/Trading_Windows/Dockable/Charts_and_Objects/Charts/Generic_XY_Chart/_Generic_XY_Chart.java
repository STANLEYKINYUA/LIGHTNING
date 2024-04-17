package aa_UI.Trading_Windows.Dockable.Charts_and_Objects.Charts.Generic_XY_Chart;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**Class that all XY Trading Charts inherit From */
public class _Generic_XY_Chart extends JPanel
{
    private int Chart_Area_Width= 0;


    public _Generic_XY_Chart()
    {
        //Set the Layout of the Chart to absolute Positioning
        this.setLayout(new MigLayout());


        //Initialize the Chart Area
        Chart_Canvas  Chart_Canvas = new Chart_Canvas();

        //Add Chart Canvas to the Chart , it should occupy 85% of the width and 75% of the Height
        this.add(Chart_Canvas,"x 10,y 10, w 95% , h 95%");

        var width   = Chart_Canvas.getBounds().getWidth();
        var height  = Chart_Canvas.getBounds().getHeight();
        var h = Chart_Canvas.getWidth();

        System.out.println(width);
        System.out.println(height);










    }




}
