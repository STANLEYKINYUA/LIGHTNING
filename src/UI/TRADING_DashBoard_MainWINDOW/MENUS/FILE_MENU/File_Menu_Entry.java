package UI.TRADING_DashBoard_MainWINDOW.MENUS.FILE_MENU;

import javax.swing.*;

public class File_Menu_Entry extends JMenu
{

    /** Default Constructor for the File Menu - Entry */
    public File_Menu_Entry()
    {
        //set the text.
        this.setText("FILE");



        //Add MenuItems and make them Visible.

            //Accounts Menu
        Accounts_Menu Accounts_Menu = new Accounts_Menu();
        this.add(Accounts_Menu);

            //Preferences Menu
        Preferences_MenuItem  Preferences_Menu = new Preferences_MenuItem();
        this.add(Preferences_Menu);

    }

}
