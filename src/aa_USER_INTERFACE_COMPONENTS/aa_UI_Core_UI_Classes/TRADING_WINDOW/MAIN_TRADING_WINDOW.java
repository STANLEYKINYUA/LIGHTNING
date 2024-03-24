package aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW;

import ModernDocking.app.Docking;
import ModernDocking.app.RootDockingPanel;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.CHART_AREA_DESKTOP_PANE;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS.CONNECTIONS_MENU.Connections_Menu;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS.FILE_MENU.File_Menu_Entry;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS.REPORTS.Reports_Menu;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS.TRADING_TOOLS_MENU.Trading_Tools_Menu;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS.Trading_Window_MenuBar;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.TOOLBAR.Trading_Window_ToolBar;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import javax.swing.*;
import java.awt.*;

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

            //Create a Root Dock Pane where Charts can be Docked
            RootDockingPanel Trading_Window_DOCK_Panel = new RootDockingPanel(this);
            this.add(Trading_Window_DOCK_Panel,BorderLayout.CENTER);


        }
        catch(Exception Trading_Window_Exception)
        {
            //Print the StackTrace for this Exception.
            Trading_Window_Exception.printStackTrace();
        }


    }


    //---------------------------------------------------------------------------------------------
    /**These Functions are used to Create Non Docking Windows that Appear Above the Main Trading Window and capture FOCUS*/
    void Spawn_Settings_Window()
    {}
    void Spawn_Exit_Alert_Dialog(){}
    //----------------------------------------------------------------------------------------------

    //----------------------------------------------------------------------------------------------
    /**These Windows create Non Docking Windows which do not capture Focus */
    void Spawn_Reports_Window(){}

    //----------------------------------------------------------------------------------------------
    // THis functions are used to display non MDI Windows
    void Spawn_Operational_Windows_that_dont_Lose_Focus(String Window_Type)
    {
        String Spawn_Window = Window_Type;

        /*
        >   These Windows never lose Focus and only way to return focus to main Window is to close them.
        >   These Windows must be spawned in a new Swing Worker thread to avoid program hanging.

            these windows are :

                2.  Create Order Window


        * */
    }

    void Display_SETTINGS_Window_that_does_not_lose_Focus_till_Closed(){}
    void Display_NODES_Window_that_does_not_lose_Focus_till_Closed(){}

    //----------------------------------------------------------------------------------------------


    // ----------------------------------------------------------------------------------------------
    //This Collection of Functions is used to spawn Chart Windows
    void Spawn_Chart_Window(String Chart_Type , String Market_Symbol , String Chart_Period )
    {
        String Chart_type_to_Spawn = Chart_Type;
        String Financial_Symbol  = Market_Symbol;
        String Period = Chart_Period;

        //TODO  Write the Code that allows us to spawn MDI Chart Windows
        // 1.  Determine the Chart Type to Spawn.
        // 2.   Chart Windows are spawned on a new Swing Worker Thread to avoid System Hanging.


    }


    //TODO  Create a Common Class/Interface that will allow the methods to Inherit a Generic Chart then Specify type.


    void Spawn_CandleStick_Chart(String Market_Symbol , String Chart_Period , String Start_Date)
    {
        //TODO  Write Code that Spawns a Candle Stick Chart and Fetches Data to Plot.
    }

    void Spawn_RangeBar_Chart(String Market_Symbol , int Range_Bar_Size, String Start_Date)
    {
        //TODO  Write Code that Spawns a Range Bar Chart and Fetches Data to Plot.
    }

    void Spawn_RenkoBar_Chart(String Market_Symbol , int Renko_Bar_Size, String Start_Date)
    {
        //TODO  Write Code that Spawns a Renko Bar Chart and Fetches Data to Plot.
    }

    void Spawn_Median_Renko_Chart(String Market_Symbol , int Renko_Size, String Start_Date)
    {
        //TODO  Write Code that Spawns a Median Renko Bar Chart and Fetches Data to Plot.
    }








}

