package UI.SETTINGS_Window;

import javax.swing.*;

public class Preferences_window extends JFrame {

    public Preferences_window()
    {
        //Set Parametres
        this.setVisible(true);
        this.setTitle("PREFERENCES");
        this.setLocation(100,100);
        this.setSize(400,600);

        //Set Focus and State
        this.setAlwaysOnTop(true);
        this.setFocusable(true);
    }
}
