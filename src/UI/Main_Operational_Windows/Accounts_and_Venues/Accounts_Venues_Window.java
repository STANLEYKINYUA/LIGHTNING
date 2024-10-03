package UI.Main_Operational_Windows.Accounts_and_Venues;

import javax.swing.*;

public class Accounts_Venues_Window extends JFrame {

    public Accounts_Venues_Window()
    {
        this.setVisible(true);
        this.setSize(400,600);
        this.setLocation(125,25);
        this.setTitle("ACCOUNTS & VENUES");


        //give this Window Focus
        this.setFocusable(true);
        this.setAutoRequestFocus(true);
        this.setFocusableWindowState(true);
        this.setAlwaysOnTop(true);

        Accounts_Venues_TabPane AccVenues_TabPane = new Accounts_Venues_TabPane();
        this.add(AccVenues_TabPane);




    }


}
