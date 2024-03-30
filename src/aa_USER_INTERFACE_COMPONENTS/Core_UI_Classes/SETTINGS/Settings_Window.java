package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.SETTINGS;

import javax.swing.*;

/** A window that is used to edit and modify Settings for various Platform Functionality. */
public class Settings_Window extends JFrame
{

    /** Default Constructor for the Settings Window*/
    public Settings_Window()
    {
        //Sets the Window Size and Spawn Location
        this.setBounds(200,300,300,500);

        //Set the title of the Window to
        this.setTitle("SETTINGS");

        //TODO  When Settings Altered : Change Config File + Call Specific Objects to reload/Update and read new Config File.

    }


}
