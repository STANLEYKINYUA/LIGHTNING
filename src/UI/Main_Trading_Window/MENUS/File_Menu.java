package UI.Main_Trading_Window.MENUS;

import UI.Main_Operational_Windows.Accounts_and_Venues.Accounts_Venues_Window;
import UI_Backend.SETTINGS.PREFERENCES_Window.Preferences_window;

import javax.swing.*;

public class File_Menu extends JMenu
{

    /** Default Constructor for the File Menu - Entry */
    public File_Menu()
    {
        //set the text.
        this.setText("FILE");

        //Add MenuItems and make them Visible.

            //Accounts Menu
        JMenuItem Accounts_Menu_Item = new JMenuItem("ACCOUNTS & VENUES ");
        Accounts_Menu_Item.addActionListener( e -> new Accounts_Venues_Window() );
        this.add(Accounts_Menu_Item);


            //Preferences Menu
        JMenuItem  Preferences_Menu = new JMenuItem("PREFERENCES");
        Preferences_Menu.addActionListener( e-> new Preferences_window());
        this.add(Preferences_Menu);

            //Log off
        JMenuItem LoggOff_Menu = new JMenuItem("SWITCH USER");
        this.add(LoggOff_Menu);

        //Exit
        JMenuItem Exit_menuItem = new JMenuItem("EXIT");
        Exit_menuItem.addActionListener( e-> System.exit(1));
        this.add(Exit_menuItem);

    }

    void Log_Off()
    {

    }

}
