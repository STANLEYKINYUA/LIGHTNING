package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.WatchList;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;

import javax.swing.*;

/** This Class Describes a Window that keeps Track of all Tradeable Symbols. */
public class WatchList_Window extends JTabbedPane implements Dockable
{
    //TODO  Write Proper Documentation for every line in this
    private final String text;

    /** Default Constructor that for WatchList*/
    public WatchList_Window(String text)
    {
        //TODO  Wrap this in a try catch block

        this.text = text;

        //Register as a Dockable
        Docking.registerDockable(this);

       //Set size`
        this.setSize(50,100);

        //Set Max Size



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
