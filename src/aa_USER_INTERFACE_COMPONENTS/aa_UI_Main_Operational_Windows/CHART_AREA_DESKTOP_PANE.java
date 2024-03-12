package aa_USER_INTERFACE_COMPONENTS.aa_UI_Main_Operational_Windows;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class CHART_AREA_DESKTOP_PANE extends JDesktopPane
{
    int Trading_Window_X_Size;
    int Trading_Window_Y_Size;
    public CHART_AREA_DESKTOP_PANE()
    {
        //Initialize the Desktop Pane
        init_Chart_Area_Desktop_Pane();

    }


    void init_Chart_Area_Desktop_Pane()
    {

        try
        {

            //Set a Desktop Manager
            DesktopManager Chart_Area_DesktopManager = new DefaultDesktopManager();
            this.setDesktopManager(Chart_Area_DesktopManager);

            //TODO  Set Desktop Pane Dimensions.


            //Set Layout to Mig Layout.
            this.setLayout(new MigLayout());

            //Set Back Colour to grey for identification.
            this.setBackground(Color.GRAY);







        }
        catch(Exception Chart_Area_Desktop_Pane_Exception)
        {
            //TODO  Add better Logging Facilities with Logging Engine.
            Chart_Area_Desktop_Pane_Exception.printStackTrace();
        }
    }


}
