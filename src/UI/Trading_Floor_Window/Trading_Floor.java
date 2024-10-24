package UI.Trading_Floor_Window;

import TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST.Capital_dot_COM.CAPITAL_dotCOM_RestWebSocket_Engine;
import UI.Charts_and_Indicatorz.Chart.Chart_Mdi_Window;
import UI.Charts_and_Indicatorz.Chart.Generic_XY_Chart_Panel;
import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Calendar.Calendar_Window;
import UI.Charts_and_Indicatorz.Chart_Types.CandleStick_Chart;
import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Market_ScannerWindow.Market_Scanner_Window;
import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.ORDERS_POSITIONS_WINDOW;
import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Orders_and_PositionsWindow.ORDERS_and_POSITIONS_JTabbedPane;
import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.WatchList.WatchList_Manager;
import UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.WatchList.WatchList_Window;
import UI.Trading_Floor_Window.DeskTop_Pane.MainWindow_DeskTop_Pane;
import UI.Trading_Floor_Window.MENUS.File_Menu;
import UI.Trading_Floor_Window.MENUS.Reports_Menu;
import UI.Trading_Floor_Window.MENUS.Trading_Tools_Menu;
import UI.Trading_Floor_Window.MENUS.Trading_Window_MenuBar;
import UI.Trading_Floor_Window.MENUS.View_Menu;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

//TODO  JAVADOC Every Function in this Class

/** This Window is the default window that hosts Charts_and_Indicatorz and Trading Menus and Windows */
public class Trading_Floor extends JFrame
{

    /*  DATA TYPES  */

    // MDI Windows
    private boolean is_Calendar_Open        = false;
    private boolean is_NewsWindow_Open      = false;
    private boolean is_EquityBalances_Open  = false;
    private boolean is_MarketScanner_Open   = false;
    private boolean is_OrdersPositions_Open = false;
    private boolean is_WatchList_Open       = false;


    //Venue Classes
    //CAPITAL_dotCOM_RestWebSocket_Engine Capital_Dot_Com = new CAPITAL_dotCOM_RestWebSocket_Engine();





    //Create MenuBar and Add Different Components
    Trading_Window_MenuBar TradingWindowMenuBar = new Trading_Window_MenuBar();
    //---------------------------------------------------------------------------

    // Create Menus by calling their respective classes
    File_Menu           File_Menu          = new File_Menu();
    View_Menu           View_Menu          = new View_Menu();
    Reports_Menu        ReportsMenu        = new Reports_Menu();
    Trading_Tools_Menu  TradingToolsMenu    = new Trading_Tools_Menu();


    //Create a Desktop Pane where MDI windows can be Docked.
    MainWindow_DeskTop_Pane DesktopPane = new MainWindow_DeskTop_Pane();


    //Map of Functions that will be called


    //Order Management and Positions
    ORDERS_and_POSITIONS_JTabbedPane Positions_Window = new ORDERS_and_POSITIONS_JTabbedPane();


    //Positions Management Window
    ORDERS_and_POSITIONS_JTabbedPane Orders_Positiions_TAB_PANE = new ORDERS_and_POSITIONS_JTabbedPane();
    ORDERS_POSITIONS_WINDOW Orders_Positions_MDI_Window = new ORDERS_POSITIONS_WINDOW();

    //WatchList Window + Watchlist Manager
    WatchList_Window  WatchList_MDI = new WatchList_Window();
    WatchList_Manager WatchlistManager = new WatchList_Manager();




    public Trading_Floor() throws IOException, URISyntaxException, InterruptedException, ExecutionException, TimeoutException
    {

        //Initialize the Trading Floor
        Trading_Floor_Init();

        //Always Open the WatchList and Chart Window
        Init_WatchList();

        //Always Open an Order Management Screen
        Init_Order_Management_System();

        //todo Read Workspace Manager and ReOpen last Tabs on the Workspace
        Spawn_Chart_Window(DesktopPane,"CHART_WINDOW",50,50,600,400);

    }


    //-----------------------------------------------------------------------------------------
    //Initialize the Trading Floor Parameters & Create Sub Systems
    void Trading_Floor_Init()
    {
        //TODO Spawn a Config File Manager based on the Profile and read and Write only to that Profile

        //Set the Title of the Desktop Pane
        this.setTitle(" LIGHTNING ");

        // Default Font for the Frame as Roboto
        this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));


        //TODO  Change Icon for this Window to Lightning and keep Frame Name.
        this.setTitle("LIGHTNING WORKSTATION.");

        //Initialize the Menu System
        Init_Menu_System();

        //Add a Desktop Pane where MDI windows can be docked
        this.add(DesktopPane, BorderLayout.CENTER);

    }

    void Init_Menu_System()
    {
        // Add the Menus to the MenuBar.
        TradingWindowMenuBar.add(File_Menu);
        TradingWindowMenuBar.add(View_Menu);
        TradingWindowMenuBar.add(TradingToolsMenu);
        TradingWindowMenuBar.add(ReportsMenu);

        // Display the Menu Bar on the Form
        this.setJMenuBar(TradingWindowMenuBar);

    }

    //-----------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------
    /** Initialize the SubSystem for the Watchlist */
    void Init_WatchList()
    {
        //Create a WatchList
        WatchList_MDI.setBounds(25,25,200,800);
        DesktopPane.add(WatchList_MDI);
        WatchList_MDI.setVisible(true);

    }

    /** Initialize the Sub System for the Order Management System*/
    void Init_Order_Management_System()
    {

        Orders_Positions_MDI_Window.setBounds(25,600,800,300);
        Orders_Positions_MDI_Window.add(Orders_Positiions_TAB_PANE);

        DesktopPane.add(Orders_Positions_MDI_Window);
        Orders_Positions_MDI_Window.setVisible(true);


    }
    //-----------------------------------------------------------------------------------------








    //-----------------------------------------
    /**Functions that create our trading Venues */
    void Activate_CapitalDC() throws IOException, URISyntaxException, ExecutionException, InterruptedException, TimeoutException {
        CAPITAL_dotCOM_RestWebSocket_Engine CapitalDC = new CAPITAL_dotCOM_RestWebSocket_Engine();

    }


    //---------------------------------------------------------------------------------------------
    /** Function that allows MDI windows to be created */

    void Spawn_MDI_Window( JDesktopPane DesktopPane , String Title,int x,int y, int W,int H)
    {
        JInternalFrame Internal_TestFrame = new JInternalFrame(Title,true,true,true,true);
        Internal_TestFrame.setBounds(x,y,W,H);

        JLabel Text = new JLabel(Title);
        Internal_TestFrame.add(Text);

        DesktopPane.add(Internal_TestFrame);
        Internal_TestFrame.setVisible(true);

    }

    //Spawn Chart MDI Window -
    void Spawn_Chart_Window(JDesktopPane DesktopPane , String Title , int x , int y , int W, int H)
    {
        Chart_Mdi_Window Chart_MDI_Window = new Chart_Mdi_Window(Title);
        Chart_MDI_Window.setBounds(x,y,W,H);


        Generic_XY_Chart_Panel Chart = new Generic_XY_Chart_Panel();
        Chart.setBounds(0,0,500,500);
        Chart.setBackground(Color.black);
        Chart.setVisible(true);

        //Create Component Listener that allows us to grow and shrink our Chart Panel
        Chart_MDI_Window.addComponentListener(new ComponentAdapter() {
            /**
             * Invoked when the component's size changes.
             *
             * @param e
             */
            @Override
            public void componentResized(ComponentEvent e)
            {
                super.componentResized(e);
                Chart.setSize(Chart_MDI_Window.getContentPane().getSize());
            }
        });

        //  Set the Initial Size of the Chart to Occuppy the whole Window
        Chart.setSize(Chart_MDI_Window.getContentPane().getSize());

        //Create a Toolbar for the Chart Window





        Chart_MDI_Window.getContentPane().add(Chart);
        DesktopPane.add(Chart_MDI_Window);
        Chart_MDI_Window.setVisible(true);


    }

    void Spawn_Orders_Positions_Window()
    {}

    //Spawn Calendar MDI Window
    //Spawn DOM  MDI Window
    //Spawn Equity Balances MDI Window
    //Spawn Market Scanner MDI Window
    //Spawn Order Entry/Management JFrame Window - Takes Focus from Application
    //Spawn Portfolio MDI Window


    //Spawn Watchlist MDI Window
    void Spawn_WatchList_Window(JDesktopPane DesktopPane,int x,int y, int W,int H) {
        String Title = "WATCHLIST";

        WatchList_Window  WatchList = new WatchList_Window();
        WatchList.setBounds(x,y,W,H);

        DesktopPane.add(WatchList);
        WatchList.setVisible(true);

    }
    //Spawn News  MDI Window

    /** Spawn Settings JFrame  Window that takes Focus from the Application*/
    void Spawn_Settings_Window()
    {}

    /** Spawn Exit Alert Dialog that Takes Focus from the Window*/
    void Spawn_Exit_Alert_Dialog(){}
    //----------------------------------------------------------------------------------------------



    //----------------------------------------------------------------------------------------------
    /** These Functions create Dockable Windows */

                // WATCHLIST ,Trade Information ,TRADING.PORTFOLIO Management Windows



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



    void Spawn_Crypto_Information_Window()
    {
        //TODO  All Crypto Information is held in this tabbed pane
    }
    void Spawn_News_Window()
    {}


    //----------------------------------------------------------------------------------------------












}

