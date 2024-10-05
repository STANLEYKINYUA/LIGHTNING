package UI.Charts_and_Indicatorz.Chart;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Chart_Mdi_Window extends JInternalFrame
{

    public Chart_Mdi_Window(String Title)
    {
        //Set all the Facilities of a Jinternal Frame
        this.setTitle(Title);
        this.setResizable(true);
        this.setClosable(true);
        this.setMaximizable(true);
        this.setIconifiable(true);

        //Set the Layout to Null
        this.setLayout(null);


        this.setBackground(Color.black);
        //Add the Chart to the Chart Window
        Generic_XY_Chart Chart = new Generic_XY_Chart();
        this.getContentPane().add(Chart);

        Chart.setBounds(0,0,500,500);
        Chart.setBackground(Color.black);
        Chart.setVisible(true);


    }


    //Chart Creation Functions
}
