package aa_UI.Trading_Windows.Dockable.Calendar;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;
import aa_UI.Trading_Windows.Dockable.Calendar.TABS.*;

import javax.swing.*;

/** This Describes a Market Calendar Window */
public class Events_Calendar_Window extends JTabbedPane implements Dockable
{
    //TODO  Write Proper Documentation for every line in this
    private final String text;

    /** The Constructor for Events Calendar*/
    public Events_Calendar_Window(String text)
    {
        this.text = text;
        //Register as a Dockable
        Docking.registerDockable(this);

        //Create Tabs for the Calendar Window
        Create_Today_EventsTab();
        Create_Tomorrow_Events_Tab();
        Create_ThisWeek_Events_Tab();
        Create_ThisMonth_Events_Tab();
        Create_ThisYear_Events_Tab();



    }



    @Override
    public String getPersistentID() {
        return text;
    }


    @Override
    public String getTabText() {
        return text;
    }

    /**Creates Tabs for the Different Events */
    public void Create_Today_EventsTab()
    {
        // Create the Today events tab and add it to this window
        this.addTab("TODAY", new Calendar_Today_Tab());
    }
    public void Create_Tomorrow_Events_Tab()
    {
        //Create the Tomorrow events tab and add it to this window
        this.addTab("TOMORROW", new Calendar_Tomorrow_Tab());
    }
    public void Create_ThisWeek_Events_Tab()
    {
        //Create This Week  events tab and add it to this window
        this.addTab("THIS WEEK", new Calendar_ThisWeek_Tab());

    }

    public void Create_ThisMonth_Events_Tab()
    {
        //Create This Month  events tab and add it to this window
        this.addTab("THIS MONTH", new Calendar_ThisMonth_Tab());
    }

    public void Create_ThisYear_Events_Tab()
    {
        //Create This Year events tab and add it to this window
        this.addTab("THIS YEAR", new Calendar_ThisYear_Tab());

    }


}
