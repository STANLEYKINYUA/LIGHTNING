package UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;
import UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.HistoricalPositionsTAB.HistoricalPositionsTab_Pane;
import UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.JournalTAB.JournalsTab_Pane;
import UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.OrdersTab.OrdersTab_Pane;
import UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.PositionsTab.PositionsTab_Pane;
import UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.WorkingOrdersTab.WorkingOrdersTab_Pane;

import javax.swing.*;

/** Contains the Containers that hold Details on Orders,Positions,Historical Positions etc */
public class ORDERS_and_POSITIONS_WINDOW extends JTabbedPane
{
    //TODO  Create a Tabbed Pane that can show open poxns , working orders ,


    /**Default Constructor  */
    public ORDERS_and_POSITIONS_WINDOW(String text)
    {
        //Create the Tabs for the Tabbed Pane
        CreatePositionsTAB();
        CreateOrdersTAB();
        CreateWorkingOrdersTAB();
        CreateHistoricalPositionsTAB();
        CreateJournalTAB();



        //Set the Size
        this.setSize(50,100);




    }



    /** Creates Tab that Holds Positions Data Table */
    public void CreatePositionsTAB()
    {
        /* Create Positions Tab and Adds it*/
        this.addTab("POSITIONS",new PositionsTab_Pane());
    }

    public void CreateOrdersTAB()
    {
        /*Creats the Orders Tab and adds it to this */
        this.addTab("ORDERS",new OrdersTab_Pane());
    }

    public void CreateWorkingOrdersTAB()
    {
        /*Creates Working Orders Tab and Adds it to this */
        this.addTab("WORKING ORDERS",new WorkingOrdersTab_Pane());
    }

    public void CreateHistoricalPositionsTAB()
    {
        /*Creates Historical Orders Tab and Adds it to this */
        this.addTab("HISTORICAL POSITIONS" , new HistoricalPositionsTab_Pane());
    }

    public void CreateJournalTAB()
    {
        /*Creates Journal Tab and Adds it to this */
        this.addTab("JOURNAL",new JournalsTab_Pane());

    }

}
