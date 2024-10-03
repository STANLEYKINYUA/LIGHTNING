package UI.Main_Trading_Window.MENUS;

import javax.swing.*;

//TODO  Write Better JAVADoc for all Classes.

/** This is the Menu for Trading Tools */
public class Trading_Tools_Menu extends JMenu
{
    public Trading_Tools_Menu()
    {
        /* This Displays the text show on the MenuBar */
        this.setText("TRADING TOOLS");

        //CALCULATOR
        JMenuItem Trading_Calculator = new JMenuItem("CALCULATOR");
        this.add(Trading_Calculator);

        //CALENDAR
        JMenuItem Calendar_menuITEM = new JMenuItem("CALENDAR");
        this.add(Calendar_menuITEM);

        //HEATMAP
        JMenuItem HeatMap_menuITEM = new JMenuItem("HEAT MAP");
        this.add(HeatMap_menuITEM);

        //Market Scanner
        JMenuItem MarketScanner_menuITEM = new JMenuItem("MARKET SCANNER");
        this.add(MarketScanner_menuITEM);

        //Market Depth Tools
        JMenu MarketDepth_menuITEM = new JMenu("MARKET DEPTH");
        this.add(MarketDepth_menuITEM);

        JMenuItem Aggregated_MarketDepth_menuITEM = new JMenuItem("Aggregated Market Depth");
        JMenuItem Depth_by_Venue_menuITEM = new JMenuItem("Depth by Venue");

        MarketDepth_menuITEM.add(Aggregated_MarketDepth_menuITEM);
        MarketDepth_menuITEM.add(Depth_by_Venue_menuITEM);


        //TODO Add Aggregated Depth Window
        //TODO  Add Depth by Venue

        //Spread Tools
        JMenu Spread_menu = new JMenu("SPREAD");
        this.add(Spread_menu);

        JMenuItem Average_Spread_menuITEM = new JMenuItem("Average Spread");
        JMenuItem Spread_by_Venue = new JMenuItem("Spread by Venue");

        Spread_menu.add(Average_Spread_menuITEM);
        Spread_menu.add(Spread_by_Venue);

    }

}
