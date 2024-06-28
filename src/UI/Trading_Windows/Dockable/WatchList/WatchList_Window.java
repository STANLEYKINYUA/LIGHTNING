package UI.Trading_Windows.Dockable.WatchList;

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


        this.text = text;

        //Register as a Dockable
        Docking.registerDockable(this);





    }

    @Override
    public String getPersistentID() {
        return text;
    }

    @Override
    public String getTabText() {
        return text;
    }

    //Create Tabs
        //Create Favourites Tab
        //Create Fx Tab
        //Create

        //Create Button that Adds Tabs
}
