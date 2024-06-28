package UI_Backend.WORKSPACE_and_TEMPLATE;

import UI.Trading_Windows.Dockable.Calendar.Calendar_Window;
import UI.Trading_Windows.Dockable.Market_ScannerWindow.Market_Scanner_Window;
import UI.Trading_Windows.Dockable.WatchList.WatchList_Window;

/**Workspace Class is a class used to Store all the Data for a Certain Workspace */
public class WorkSpace
{
    public WorkSpace()
    {

    }

    /**Create Docking Panels that I will Use to Display Info */

    //Other Windows
    Calendar_Window         Calendar        = new Calendar_Window("CALENDAR");
    Market_Scanner_Window   MarketScanner   = new Market_Scanner_Window("MARKET_SCANNER");
    WatchList_Window        WatchList       = new WatchList_Window("WATCH_LIST");


    //Chart Windows




}
