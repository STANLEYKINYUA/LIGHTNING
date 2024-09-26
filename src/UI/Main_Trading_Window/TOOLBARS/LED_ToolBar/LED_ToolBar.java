package UI.Main_Trading_Window.TOOLBARS.LED_ToolBar;

import javax.swing.*;

public class LED_ToolBar extends JToolBar
{
    private int Speed;

    //Constructor
    public LED_ToolBar()
    {
        //border of the toolbar will only be
        this.setRollover(true);

        //Add the LED Panel that allows words to be animated Side Scrolling
        LED_Panel LedPanel = new LED_Panel();


    }
}
