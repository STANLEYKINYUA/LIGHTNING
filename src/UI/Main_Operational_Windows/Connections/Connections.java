package UI.Main_Operational_Windows.Connections;

import javax.swing.*;

/** MenuBar Item - Spawns Connections Menu */
public class Connections extends JFrame
{

    /** Default Constructor for Connections Menu Class */
    public Connections()
    {
        //Set Location and Parametres
        this.setVisible(true);
        this.setLocation(200,300);
        this.setSize(400,500);

        this.setTitle("CONNECTIONS");

        //Always above other Windows
        this.setAlwaysOnTop(true);


    }
}
