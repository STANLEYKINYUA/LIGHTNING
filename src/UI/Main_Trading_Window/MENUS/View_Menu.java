package UI.Main_Trading_Window.MENUS;

import javax.swing.*;

public class View_Menu extends JMenu
{

    public View_Menu()
    {
        this.setText("VIEW");

        //Add Menu Items for View Menu

            //Windows Menu
        JMenu Windows_menuITEM = new JMenu("WINDOWS");
        this.add(Windows_menuITEM);

        JMenuItem Connections_menuITEM = new JMenuItem("CONNECTIONS");
        Windows_menuITEM.add(Connections_menuITEM);

            //Todo Add Window Selection
            //Todo Add Themes Window
            //Todo Add


    }
}
