package UI_Backend.SETTINGS.PREFERENCES_Window;

import UI_Backend.SETTINGS.PREFERENCES_Window.Preferences_Tabs.Appearances_Tab;
import UI_Backend.SETTINGS.PREFERENCES_Window.Preferences_Tabs.Performance_Tab;
import UI_Backend.SETTINGS.PREFERENCES_Window.Preferences_Tabs.Security_Tab;

import javax.swing.*;

public class Preferences_Tabbed_Pane extends JTabbedPane
{
    Preferences_Tabbed_Pane()
    {
        //Add Tabs
        Appearances_Tab Appearances_Tab = new Appearances_Tab();
        Performance_Tab Performance_Tab = new Performance_Tab();
        Security_Tab Security_Tab   = new Security_Tab();


        //Add to Tabbed Pane
        this.addTab("APPEARANCES",Appearances_Tab);
        this.addTab("PERFORMANCE",Performance_Tab);
        this.addTab("SECURITY", Security_Tab);


    }
}
