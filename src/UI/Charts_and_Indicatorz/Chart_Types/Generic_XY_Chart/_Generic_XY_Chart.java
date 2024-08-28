package UI.Charts_and_Indicatorz.Chart_Types.Generic_XY_Chart;

import javax.swing.*;

/**Class that all XY Trading Chart_Types inherit From */
public class _Generic_XY_Chart extends JPanel
{
    private int Chart_Area_Width= 0;


    public _Generic_XY_Chart()
    {
        //Set the Layout of the Chart to absolute Positioning
        //this.setLayout(new MigLayout());
         this.setLayout(null);

        //Initialize the Chart Area
        Chart_Canvas  Chart_Canvas = new Chart_Canvas();

        //Add Chart Canvas to the Chart , it should occupy 85% of the width and 75% of the Height
        //this.add(Chart_Canvas,"x 10,y 10, w 95% , h 95%");
        this.add(Chart_Canvas);

        


        //Add the Chart Canvas via absolute layout

        //Chart_Canvas.setBounds(20,0,100,500);
        //Chart_Canvas.setSize(100,500);
        //this.add(Chart_Canvas);












    }




}
