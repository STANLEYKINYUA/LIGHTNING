package UI.Main_Trading_Window.z_MDI_Internal_Trading_Windows.WatchList;



import UI.Main_Trading_Window.z_MDI_Internal_Trading_Windows.WatchList.Tabs.Markets_Tab;
import UI.Main_Trading_Window.z_MDI_Internal_Trading_Windows.WatchList.Tabs.MyWatchList_Tab;

import javax.swing.*;

public class WatchList_TabPANE extends JTabbedPane
{
    public WatchList_TabPANE()
    {
        //Add Tabbed Panes
        MyWatchList_Tab MyWatchList_Tab = new MyWatchList_Tab();
        MyWatchList_Tab.add(new JLabel("My WatchLists"));

        Markets_Tab Markets_Tab = new Markets_Tab();
        Markets_Tab.add(new JLabel("Markets"));

        this.addTab("My Watch List",MyWatchList_Tab);
        this.addTab("Markets",Markets_Tab);


    }
}
