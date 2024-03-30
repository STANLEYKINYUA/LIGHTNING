package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW;

import ModernDocking.DockingRegion;
import ModernDocking.app.Docking;
import ModernDocking.app.RootDockingPanel;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.OrdersPositionsWindow.ORDERS_and_POSITIONS_WINDOW;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW.MENUS.CONNECTIONS_MENU.Connections_Menu;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW.MENUS.FILE_MENU.File_Menu_Entry;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW.MENUS.REPORTS.Reports_Menu;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW.MENUS.TRADING_TOOLS_MENU.Trading_Tools_Menu;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW.MENUS.Trading_Window_MenuBar;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.TRADING_MainWINDOW.TOOLBAR.Trading_Window_ToolBar;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.Market_Scanner_Window;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.WatchList.WatchList_Window;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import javax.swing.*;
import java.awt.*;

//TODO  JAVADOC Every Function in this Class

/** This Window is the default window that hosts Charts and Trading Menus and Windows */
public class MAIN_TRADING_WINDOW extends JFrame
{

    public MAIN_TRADING_WINDOW()
    {
        //Initialize the JFrame and show all Features.
        init_Trading_Window();
    }


    /** Initializes Main Trading Window that is used to Display Other Windows */
    void init_Trading_Window()
    {
        //Create a try Catch block to catch any exception.
        try
        {
            //1. Set Window Size and spawn Location.
            this.setBounds(200,200,800,800);

            //2.    Set Window Close Action.
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            //3.    This Window is Resizable.
            this.setResizable(true);

            //5.    Set Default Font for the Frame as Roboto
            this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));

            //TODO  Change Icon for this Window to Lightning and keep Frame Name.
            this.setTitle("LIGHTNING WORKSTATION.");

            //SetLayout to MigLayout




            //TODO Finish creating theMenu System.

            //Create MenuBar and Add Different Components
            Trading_Window_MenuBar TradingWindowMenuBar = new Trading_Window_MenuBar();

            //---------------------------------------------------------------------------
            // Create Menus by calling their respective classes
            File_Menu_Entry     File_Menu          = new File_Menu_Entry();
            Connections_Menu    ConnectionsMENU    = new Connections_Menu();
            Reports_Menu        ReportsMenu        = new Reports_Menu();
            Trading_Tools_Menu  TradingToolsMenu    = new Trading_Tools_Menu();


            // Add the Menus to the MenuBar.
            TradingWindowMenuBar.add(File_Menu);
            TradingWindowMenuBar.add(ConnectionsMENU);
            TradingWindowMenuBar.add(TradingToolsMenu);
            TradingWindowMenuBar.add(ReportsMenu);

            //TODO  Create Menu Items in respective classes
            //TODO  Add Menu Items to Menu Bars
            //TODO  Add FlatLaf Specific Features
            //TODO   Add FLATLAF underline.


            // Display the Menu Bar on the Form
            this.setJMenuBar(TradingWindowMenuBar);

            //-------------------------------------------------------------------------------------------------------
            //ToolBar that is used to Display Icons
            Trading_Window_ToolBar ToolBar = new Trading_Window_ToolBar();



            // Create a Content Pane to display the ToolBar.
            Container ContentPane = this.getContentPane();

            //Add toolbar to the Contentpane Docked North.
            ContentPane.add(ToolBar , BorderLayout.NORTH);





            //Initialize Docking on this JFrame
            Docking.initialize(this);

            //Create a Root Dock Pane where Chartscan be Docked
            RootDockingPanel Trading_Window_DOCK_Panel = new RootDockingPanel(this);
            this.add(Trading_Window_DOCK_Panel,BorderLayout.CENTER);

            //TODO Spawn WatchList , Scanner , Positions for now but remove later
            Spawn_WatchList();
            Spawn_Market_Scanner();
            Spawn_Position_and_Order_Management_Window();


        }
        catch(Exception Trading_Window_Exception)
        {
            //TODO  Throw all Exceptions and Create an Alert Window to Display the Exception on the UI

            //Print the StackTrace for this Exception.
            Trading_Window_Exception.printStackTrace();

            //TODO  Log to Error File

        }


    }


    //---------------------------------------------------------------------------------------------
    /**These Functions are used to Create Non Docking Windows that Appear Above the Main Trading Window and capture FOCUS*/

    /** Settings Window that takes Focus from the Application*/
    void Spawn_Settings_Window()
    {}

    /** Exit Alert Dialog that Takes Focus from the Window*/
    void Spawn_Exit_Alert_Dialog(){}
    //----------------------------------------------------------------------------------------------



    //----------------------------------------------------------------------------------------------
    /**These Windows create Non Docking Windows which do not capture Focus */
    void Spawn_Reports_Window(){}

    //----------------------------------------------------------------------------------------------




    //----------------------------------------------------------------------------------------------
    /** These Functions create Dockable Windows */

                // WATCHLIST ,Trade Information ,PORTFOLIO Management Windows
    void Spawn_WatchList()
    {
        //TODO  Spawn WatchList always Docked to the West but can be Floated.

        try
        {
            //Spawn the WatchList and Dock
            WatchList_Window WatchList = new WatchList_Window("WatchList");

            //Dock into the created
            Docking.dock(WatchList,this,DockingRegion.WEST);


        }
        catch(Exception Failed_to_Spawn_WatchList_Window)
        {
            Failed_to_Spawn_WatchList_Window.printStackTrace();

            //TODO Handle this exception better by throwing an Exception and Displaying Window
        }
    };

    void Spawn_Position_and_Order_Management_Window()
    {
        try
        {
            //Create a new Orders and Positions Window
            ORDERS_and_POSITIONS_WINDOW OrdersPositionsWindow = new ORDERS_and_POSITIONS_WINDOW("ORDERS & POSITIONS");

            //Dock into the Global South of the Main Trading Window
            Docking.dock(OrdersPositionsWindow,this,DockingRegion.SOUTH);

        }
        catch(Exception Failed_toLoad_PositionsOrdersWindow)
        {
            //TODO Throw this Exceptions and Add to Exceptions List
            Failed_toLoad_PositionsOrdersWindow.printStackTrace();
        }

    }
    void Spawn_Market_Scanner()
    {
        try
        {
            //Spawn the MarketScanner and Dock
            Market_Scanner_Window MarketScannerWindow = new Market_Scanner_Window("MARKET SCANNER");

            //Dock into the created
            Docking.dock(MarketScannerWindow,this, DockingRegion.EAST);

        }
        catch(Exception Spawn_Market_Scanner_Exception)
        {
            Spawn_Market_Scanner_Exception.printStackTrace();
        }
    }
    void Spawn_L2_Dom_Window()
    {
        try
        {
            //Spawn L2 Dom Window and Dock it

        }
        catch(Exception Failed_to_Spawn_L2DOM_Window)
        {
            //TODO  Write Better Documentation for this
            Failed_to_Spawn_L2DOM_Window.printStackTrace();
        }

    }
    void Spawn_Trades_Ticker_Window()
    {}

                //Charts
    void Spawn_Dockable_CandleStick_Chart(String Market_Symbol , String Chart_Period , String Start_Date)
    {
        //TODO  Write Code that Spawns a Candle Stick Chart and Fetches Data to Plot.
    }
    void Spawn_Dockable_RangeBar_Chart(String Market_Symbol , String Chart_Period , String Start_Date)
    {
        //TODO  Write Code that Spawns a Range Bar Chart and Fetches Data to Plot.
    }
    void Spawn_Dockable_RenkoBar_Chart(String Market_Symbol , String Chart_Period , String Start_Date)
    {
        //TODO  Write Code that Spawns a Renko Bar Chart and Fetches Data to Plot.
    }
    void Spawn_Dockable_MedianRenkoBar_Chart(String Market_Symbol , String Chart_Period , String Start_Date)
    {
        //TODO  Write Code that Spawns a Median Renko Bar Chart and Fetches Data to Plot.
    }

            //Informational
    void Spawn_Calendar_Window()
    {}
    void Spawn_Crypto_Information_Window()
    {
        //TODO  All Crypto Information is held in this tabbed pane
    }
    void Spawn_News_Window()
    {}


    //----------------------------------------------------------------------------------------------












}

