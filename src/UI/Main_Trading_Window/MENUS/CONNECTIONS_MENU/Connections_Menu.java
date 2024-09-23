package UI.Main_Trading_Window.MENUS.CONNECTIONS_MENU;

import javax.swing.*;

/** MenuBar Item - Spawns Connections Menu */
public class Connections_Menu extends JMenu
{

    /** Default Constructor for Connections Menu Class */
    public Connections_Menu()
    {
        this.setText("CONNECTIONS");

        //Add
        JMenuItem ConnectionsViewer_MenuItem = new JMenuItem();
        ConnectionsViewer_MenuItem.setText("View Connections");
        this.add(ConnectionsViewer_MenuItem);

        JMenuItem Manage_Connections_MenuItem = new JMenuItem();
        Manage_Connections_MenuItem.setText("Manage Connections");
        this.add(Manage_Connections_MenuItem);

    }
}
