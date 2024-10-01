package UI.MDI_Internal_Trading_Windows.Accounts_and_Venues;

import javax.swing.*;

public class Accounts_Venues_Window extends JFrame {

    public Accounts_Venues_Window()
    {
        this.setVisible(true);
        this.setSize(100,100);
        this.setLocation(25,25);

        //give this Window Focus
        this.setFocusable(true);
        this.setAutoRequestFocus(true);
        this.setFocusableWindowState(true);
        this.setAlwaysOnTop(true);


    }
}
