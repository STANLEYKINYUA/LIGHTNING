package UI.Main_Trading_Window;

import ModernDocking.DockingRegion;
import ModernDocking.app.Docking;
import ModernDocking.app.RootDockingPanel;
import UI.MDI_Internal_Trading_Windows.Calendar.Calendar_Window;
import UI.Charts_and_Indicatorz.Charts.CandleStick_Chart;
import UI.MDI_Internal_Trading_Windows.Market_ScannerWindow.Market_Scanner_Window;
import UI.MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.ORDERS_and_POSITIONS_WINDOW;
import UI.MDI_Internal_Trading_Windows.WatchList.WatchList_Window;
import UI.Main_Trading_Window.DeskTop_Pane.MainWindow_DeskTop_Pane;
import UI.Main_Trading_Window.MENUS.CONNECTIONS_MENU.Connections_Menu;
import UI.Main_Trading_Window.MENUS.FILE_MENU.File_Menu_Entry;
import UI.Main_Trading_Window.MENUS.REPORTS.Reports_Menu;
import UI.Main_Trading_Window.MENUS.TRADING_TOOLS_MENU.Trading_Tools_Menu;
import UI.Main_Trading_Window.MENUS.Trading_Window_MenuBar;
import UI.Main_Trading_Window.STATUS_BAR.Trading_Window_StatusBar;
import UI.Main_Trading_Window.TOOLBAR.Trading_Window_ToolBar;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import javax.swing.*;
import java.awt.*;

//TODO  JAVADOC Every Function in this Class

/** This Window is the default window that hosts Charts_and_Indicatorz and Trading Menus and Windows */
public class MAIN_TRADING_WINDOW extends JFrame
{

    /*  DATA TYPES  */

    // MDI Windows
    private boolean is_Calendar_Open        = false;
    private boolean is_NewsWindow_Open      = false;
    private boolean is_EquityBalances_Open  = false;
    private boolean is_MarketScanner_Open   = false;
    private boolean is_OrdersPositions_Open = false;

    //






    public MAIN_TRADING_WINDOW()
    {
        //Initialize the JFrame and show all Features.
        init_Trading_Window();


        //Create a Desktop Pane where MDI windows can be Docked.
        MainWindow_DeskTop_Pane DesktopPane = new MainWindow_DeskTop_Pane();
        this.add(DesktopPane, BorderLayout.CENTER);


        //Create and Add the MDI Window
        Create_MDI_Window(DesktopPane,"MDI Window 1");
        Create_MDI_Window(DesktopPane,"MDI Window 2");




    }



    /** Initializes Main Trading Window that is used to Display Other Windows */
    void init_Trading_Window()
    {
        //Create a try Catch block to catch any exception.
        try
        {
            //1. Set Window Size and spawn Location.
            this.setBounds(200,200,800,800);

            //Set the Title of the Desktop Pane
            this.setTitle(" LIGHTNING ");



            //5.    Set Default Font for the Frame as Roboto
            this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));

            //TODO  Change Icon for this Window to Lightning and keep Frame Name.
            this.setTitle("LIGHTNING WORKSTATION.");






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
            //ToolBar & StatusBar that is used to Display Icons
            Trading_Window_ToolBar ToolBar = new Trading_Window_ToolBar();
            Trading_Window_StatusBar StatusBar = new Trading_Window_StatusBar();


            // Create a Content Pane to display the ToolBar & StatusBar.
            Container ContentPane = this.getContentPane();

            //Add toolbar to the Contentpane Docked North.
            ContentPane.add(ToolBar , BorderLayout.NORTH);
            ContentPane.add(StatusBar,BorderLayout.SOUTH);



            //TODO Spawn WatchList , Scanner , Positions for now but remove later
            Spawn_WatchList();
            Spawn_Market_Scanner();
            Spawn_Position_and_Order_Management_Window();
            Spawn_Calendar_Window();
            Spawn_CandleStick_Chart();


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
    /** Function that allows MDI windows to be created */
    void Create_MDI_Window( JDesktopPane DesktopPane , String Title)
    {
        JInternalFrame Internal_TestFrame = new JInternalFrame(Title,true,true,true,true);
        Internal_TestFrame.setBounds(50,50,300,200);

        JTextArea Text = new JTextArea(Title);
        Internal_TestFrame.add(Text);

        DesktopPane.add(Internal_TestFrame);
        Internal_TestFrame.setVisible(true);

    }

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

                // WATCHLIST ,Trade Information ,TRADING.PORTFOLIO Management Windows
    public void Spawn_WatchList()
    {
        //TODO  Spawn WatchList always Docked to the West but can be Floated.

            //Spawn the WatchList and Dock
            WatchList_Window WatchList = new WatchList_Window("WatchList");



    }

    void Spawn_Position_and_Order_Management_Window()
    {
            //Create a new Orders and Positions Window
            ORDERS_and_POSITIONS_WINDOW OrdersPositionsWindow = new ORDERS_and_POSITIONS_WINDOW("ORDERS & POSITIONS");


    }
    void Spawn_Market_Scanner()
    {

            //Spawn the MarketScanner and Dock
            Market_Scanner_Window MarketScannerWindow = new Market_Scanner_Window("MARKET SCANNER");



    }
    //Informational
    void Spawn_Calendar_Window()
    {
        //Spawn the Calendar Window and Dock to the East
        Calendar_Window Calendar_Window = new Calendar_Window("CALENDAR");

    }
    void Spawn_L2_Dom_Window()
    {


    }
    void Spawn_Trades_Ticker_Window()
    {}

                //Charts_and_Indicatorz
    void Spawn_CandleStick_Chart()
    {
        //TODO  Write Code that Spawns a Candle Stick Chart and Fetches Data to Plot.

        //spawn the Candle Stick Chart and Dock to the Centre
        CandleStick_Chart CandleStick = new CandleStick_Chart("CANDLESTICK_CHART");


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


    void Spawn_Crypto_Information_Window()
    {
        //TODO  All Crypto Information is held in this tabbed pane
    }
    void Spawn_News_Window()
    {}


    //----------------------------------------------------------------------------------------------












}

