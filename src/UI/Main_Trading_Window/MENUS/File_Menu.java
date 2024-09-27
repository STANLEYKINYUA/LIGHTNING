package UI.Main_Trading_Window.MENUS;

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
        this.add(Accounts_Menu_Item);

            //Preferences Menu
        JMenuItem  Preferences_Menu = new JMenuItem("PREFERENCES");
        this.add(Preferences_Menu);

            //Log off
        JMenuItem LoggOff_Menu = new JMenuItem("SWITCH USER");
        this.add(LoggOff_Menu);

        //Exit
        JMenuItem Exit_menuItem = new JMenuItem("EXIT");
        this.add(Exit_menuItem);

    }

}
