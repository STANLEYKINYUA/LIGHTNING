package aa_USER_INTERFACE_COMPONENTS.aa_UI_Main_Operational_Windows;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MAIN_TRADING_WINDOW extends JFrame
{

    public MAIN_TRADING_WINDOW()
    {
        //Initialize the JFrame and show all Features.
        init_Trading_Window();






    }



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

            //4.    Set MigLayout as the Window Layout
            this.setLayout(new MigLayout());

            //5.    Set Default Font for the Frame as Roboto
            this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));

            //TODO  Change Icon for this Window to Lightning and keep Frame Name.
            this.setTitle("LIGHTNING WORKSTATION.");


            //TODO  Create a Menu System.
            JMenuBar Trading_Window_MenuBar = new JMenuBar();

                    //Create Menus.
                JMenu File_Menu         =   new JMenu("FILE");
                JMenu Edit_Menu         =   new JMenu("EDIT");
                JMenu Views_Menu        =   new JMenu("VIEWS");
                JMenu Connections_Menu  =   new JMenu("CONNECTIONS");
                JMenu Settings_Menu     =   new JMenu("SETTINGS");


                    // Add the Menus to the MenuBar.
                Trading_Window_MenuBar.add(File_Menu);
                Trading_Window_MenuBar.add(Edit_Menu);
                Trading_Window_MenuBar.add(Views_Menu);
                Trading_Window_MenuBar.add(Connections_Menu);
                Trading_Window_MenuBar.add(Settings_Menu);

                    //TODO  Create Menu Items
                    //TODO  Add Menu Items to Menu Bars
                    //TODO  Add FlatLaf Specific Features
                        //TODO   Add FLATLAF underline.
                        //TODO   Add Flatlaf Color on Mouse Hover.

                    //TODO  Display the Menu Bar
                    this.setJMenuBar(Trading_Window_MenuBar);

            //-------------------------------------------------------------------------------------------------------
            //TODO  Create a ToolBar
            JMenuBar Trading_Window_ToolBar = new JMenuBar();


            //TODO  Create A JDESKTOP Pane to Host MDI Windows




        }
        catch(Exception Trading_Window_Exception)
        {
            //Print the StackTrace for this Exception.
            Trading_Window_Exception.printStackTrace();
        }


    }

    //Function to create MDI Windows
    void MDI_Window_Creator()
    {

    }

    //Function to Destroy MDI windows
    void MDI_Window_Destroyer()
    {

    }
    
}

