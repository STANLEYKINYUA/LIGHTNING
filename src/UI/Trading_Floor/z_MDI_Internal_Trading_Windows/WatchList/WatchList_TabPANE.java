package UI.Trading_Floor.z_MDI_Internal_Trading_Windows.WatchList;



import UI.Trading_Floor.z_MDI_Internal_Trading_Windows.WatchList.Tabs.Markets_Tab;
import UI.Trading_Floor.z_MDI_Internal_Trading_Windows.WatchList.Tabs.MyWatchList_Tab;

import javax.swing.*;

public class WatchList_TabPANE extends JTabbedPane
{
    //Add Tabbed Panes
    Markets_Tab Markets_Tab = new Markets_Tab();
    MyWatchList_Tab MyWatchList_Tab = new MyWatchList_Tab();


    public WatchList_TabPANE()
    {
        Markets_Tab.add(new JLabel("Markets"));
        MyWatchList_Tab.add(new JLabel("My WatchLists"));

        this.addTab("Markets",Markets_Tab);
        this.addTab("My Watch List",MyWatchList_Tab);

        //Create a DataGrid and Add to each of these tables



    }
}
