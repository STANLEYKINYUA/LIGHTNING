package aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows;

import ModernDocking.Dockable;
import ModernDocking.DockableStyle;
import ModernDocking.app.Docking;

import javax.swing.*;

public class Market_Scanner_Window extends JPanel implements Dockable
{
    private final String text;

    public Market_Scanner_Window(String text)
    {

        this.text = text;


        //Register as a Dockable
        Docking.registerDockable(this);

        //Set size
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
