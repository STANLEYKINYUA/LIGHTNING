package UI.Trading_Floor_Window.MENUS;

import javax.swing.*;
import UI.Main_Operational_Windows.Connections.Connections;

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

            Connections_menuITEM.addActionListener( e-> Spawn_Connections_Window() );

            //Todo Add Window Selection
            //Todo Add Themes Window
            //Todo Add


    }

    public void Spawn_Connections_Window()
    {
        Connections Connections_Window = new Connections();
    }
}
