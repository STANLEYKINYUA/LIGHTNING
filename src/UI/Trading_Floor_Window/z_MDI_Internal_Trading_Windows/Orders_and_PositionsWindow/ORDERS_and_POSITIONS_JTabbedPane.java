package UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Orders_and_PositionsWindow;

import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.PositionsTab.PositionsTab_Pane;

import javax.swing.*;

/** Contains the Containers that hold Details on Orders,Positions,Historical Positions etc */
public class ORDERS_and_POSITIONS_JTabbedPane extends JTabbedPane
{

    PositionsTab_Pane Positions = new PositionsTab_Pane();
    PositionsTab_Pane Orders = new PositionsTab_Pane();
    PositionsTab_Pane Working_Orders_Tab = new PositionsTab_Pane();
    PositionsTab_Pane Historical_Positions = new PositionsTab_Pane();
    PositionsTab_Pane Journal =  new PositionsTab_Pane();



    /**Default Constructor  */
    public ORDERS_and_POSITIONS_JTabbedPane()
    {
        //Create the Tabs for the Tabbed Pane
        this.addTab("POSITIONS",Positions);
        this.addTab("ORDERS",Orders);
        this.addTab("WORKING ORDERS",Working_Orders_Tab);
        this.addTab("HISTORICAL POSITIONS" ,Historical_Positions );
        this.addTab("JOURNAL",Journal);



        //Set the Size
        this.setSize(50,100);




    }





}
