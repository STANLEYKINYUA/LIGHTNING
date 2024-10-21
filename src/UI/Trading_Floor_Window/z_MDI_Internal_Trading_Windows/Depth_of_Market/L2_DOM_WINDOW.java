package UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Depth_of_Market;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;

import javax.swing.*;

public class L2_DOM_WINDOW extends JPanel implements Dockable
{
    //TODO  Write Proper Documentation for every line in this
    private final String text;

    /**L2 Dom Window is spawned by it's respective Chart - Max of 10 Doms at Once  */
    public L2_DOM_WINDOW(String text)
    {
        this.text = text;

        //Register as a Dockable
        Docking.registerDockable(this);

        //Set size`
        this.setSize(100,100);

    }

    @Override
    public String getPersistentID() {
        return text;
    }

    @Override
    public String getTabText() {
        return text;
    }
}
