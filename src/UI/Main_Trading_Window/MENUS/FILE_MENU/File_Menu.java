package UI.Main_Trading_Window.MENUS.FILE_MENU;

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
        Accounts_Menu_Item Accounts_Menu_Item = new Accounts_Menu_Item();
        this.add(Accounts_Menu_Item);

            //Preferences Menu
        Preferences_MenuItem  Preferences_Menu = new Preferences_MenuItem();
        this.add(Preferences_Menu);

    }

}
