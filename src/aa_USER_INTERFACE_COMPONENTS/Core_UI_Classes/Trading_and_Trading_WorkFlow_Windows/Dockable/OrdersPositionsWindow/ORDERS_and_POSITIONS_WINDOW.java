package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.OrdersPositionsWindow;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.OrdersPositionsWindow.PositionsTab.PositionsTab_Pane;

import javax.swing.*;

/** Contains the Containers that hold Details on Orders,Positions,Historical Positions etc */
public class ORDERS_and_POSITIONS_WINDOW extends JTabbedPane implements Dockable
{
    //TODO  Create a Tabbed Pane that can show open poxns , working orders ,
    private final String text;

    /**Default Constructor  */
    public ORDERS_and_POSITIONS_WINDOW(String text)
    {
        //Create the Tabs for the Tabbed Pane
        CreatePositionsTAB();

        //Set Window as Dockable and set Text
        this.text = text;
        Docking.registerDockable(this);


        //Set the Size
        this.setSize(50,100);






    }

    /**
     * @return
     */
    @Override
    public String getPersistentID() {
        return text;
    }

    /**
     * @return
     */
    @Override
    public String getTabText() {
        return text;
    }

    /** Creates Tab that Holds Positions Data Table */
    public void CreatePositionsTAB()
    {
        //Create Positions Tab
        this.addTab("POSITIONS",new PositionsTab_Pane());
    }

    public void CreateOrdersTAB()
    {}

    public void CreateWorkingOrdersTAB()
    {}

    public void CreateHistoricalPositionsTAB()
    {}

    public void CreatePositionsJournalTAB()
    {}

}
