package aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW;

import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.CHART_AREA_DESKTOP_PANE;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS_TOOLBARS.CONNECTIONS_MENU.Connections_Menu;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.MENUS_TOOLBARS.FILE_MENU.File_Menu_Entry;
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
            //Load Window and Set Parametres.

            //1. Set Window Size and spawn Location.
            this.setBounds(200,200,800,800);

            //2.    Set Window Close Action.
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            //3.    This Window is Resizable.
            this.setResizable(true);

            //4.    Set the BackGround Color to Black.

            //5.    Set Default Font for the Frame as Roboto
            this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));

            //TODO  Change Icon for this Window to Lightning and keep Frame Name.
            this.setTitle("LIGHTNING WORKSTATION.");



            //TODO  Create a Menu System.
            JMenuBar Trading_Window_MenuBar = new JMenuBar();

                    //Create MenuBar and Add Different Components

                //---------------------------------------------------------------------------
                // Creating Menus by calling their respective classes

                File_Menu_Entry File_Menu = new File_Menu_Entry();
                Connections_Menu ConnectionsMENU = new Connections_Menu();

                //---------------------------------------------------------------------------


                JMenu Trading_Tools_Menu    =   new JMenu("TRADING TOOLS");



                    // Add the Menus to the MenuBar.
                Trading_Window_MenuBar.add(File_Menu);

                Trading_Window_MenuBar.add(ConnectionsMENU);
                Trading_Window_MenuBar.add(Trading_Tools_Menu);


                    //TODO  Create Menu Items
                    //TODO  Add Menu Items to Menu Bars
                    //TODO  Add FlatLaf Specific Features
                        //TODO   Add FLATLAF underline.
                        //TODO   Add Flatlaf Color on Mouse Hover.


                    //TODO  Display the Menu Bar
                    this.setJMenuBar(Trading_Window_MenuBar);

            //-------------------------------------------------------------------------------------------------------
            //TODO  Create a ToolBar

            JToolBar ToolBar = new JToolBar();

                ToolBar.setRollover(true);


                //Change BackGround Color of Toolbar so it stands out.
                //ToolBar.setBackground(Color.GRAY);

                //Create Buttons to add to ToolBar.

                JButton New_Window_ToolBar_Button = new JButton();
                New_Window_ToolBar_Button.setText("New Window");
                // Special FlatLaf Customization Features
                New_Window_ToolBar_Button.putClientProperty("Button.arc",100);

                JButton NODES_Button = new JButton();
                NODES_Button.setText("NODES");

                JButton ANALYSIS_BUTTON = new JButton();
                ANALYSIS_BUTTON.setText("ANALYSIS");

                //Add this buttons to the toolbar.
                ToolBar.add(New_Window_ToolBar_Button);
                ToolBar.addSeparator();
                ToolBar.add(NODES_Button);
                ToolBar.addSeparator();
                ToolBar.add(ANALYSIS_BUTTON);


                //TODO  Create Different Toolbar Icons and Commands separated by Seperators
                //TODO  Display Different Toolbar Items
                //TODO  Add FlatLaf specific features to the toolbar

                // Create a Content Pane.
                Container ContentPane = this.getContentPane();

                //Add toolbar to the Contentpane Docked North.
                ContentPane.add(ToolBar , BorderLayout.NORTH);




            //TODO  Create A JDESKTOP Pane to Host MDI Windows - No layout elements
            JDesktopPane Chart_Area_Desktop_Pane = new CHART_AREA_DESKTOP_PANE();

            //Add Jdesktop Pane to this Form and make it Visible.
            this.add(Chart_Area_Desktop_Pane,BorderLayout.CENTER);
            Chart_Area_Desktop_Pane.setVisible(true);






        }
        catch(Exception Trading_Window_Exception)
        {
            //Print the StackTrace for this Exception.
            Trading_Window_Exception.printStackTrace();
        }


    }

    //----------------------------------------------------------------------------------------------
    // THis functions are used to display non MDI Windows
    void Spawn_Operational_Windows_that_dont_Lose_Focus(String Window_Type)
    {
        String Spawn_Window = Window_Type;

        /*
        >   These Windows never lose Focus and only way to return focus to main Window is to close them.
        >   These Windows must be spawned in a new Swing Worker thread to avoid program hanging.

            these windows are :
                1.  Settings Window
                2.  Create Order Window
                3.  EXIT ALERT Window - JDialog

        * */
    }

    void Display_SETTINGS_Window_that_does_not_lose_Focus_till_Closed(){}
    void Display_NODES_Window_that_does_not_lose_Focus_till_Closed(){}

    //----------------------------------------------------------------------------------------------


    // ----------------------------------------------------------------------------------------------
    //This Collection of Functions is used to spawn MDI Windows
    void Spawn_MDI_Chart_Window(String Chart_Type , String Market_Symbol , String Chart_Period )
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

