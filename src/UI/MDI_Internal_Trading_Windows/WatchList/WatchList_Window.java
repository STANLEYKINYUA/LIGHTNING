package UI.MDI_Internal_Trading_Windows.WatchList;

import javax.swing.*;


public class WatchList_Window extends JInternalFrame
{

    public WatchList_Window()
    {
        //Set Title
        this.setTitle("WATCHLIST");

        //Set the Properties
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setIconifiable(true);

        JLabel Text = new JLabel("WATCHLIST Window");
        this.add(Text);

        //Add the WatchList Tab Pane



    }



    //Alert MDI Window Manager that you are closing so that it can set Parametres and resave layout.




}
