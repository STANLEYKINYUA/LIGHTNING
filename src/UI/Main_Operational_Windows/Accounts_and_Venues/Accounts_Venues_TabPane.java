package UI.Main_Operational_Windows.Accounts_and_Venues;

import UI.Main_Operational_Windows.Accounts_and_Venues.Accounts_Venues_Tabs.Accounts_Tab;
import UI.Main_Operational_Windows.Accounts_and_Venues.Accounts_Venues_Tabs.Venues_Tab;

import javax.swing.*;

public class Accounts_Venues_TabPane extends JTabbedPane
{
    Accounts_Venues_TabPane()
    {
        //Add Tabbed Panes for this
        Accounts_Tab AccountsTAB = new Accounts_Tab();
        Venues_Tab VenuesTAB = new Venues_Tab();

        this.addTab("VENUES",VenuesTAB);
        this.addTab("ACCOUNTS", AccountsTAB);

    }
}
