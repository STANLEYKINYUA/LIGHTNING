package UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.WatchList;


import javax.swing.*;


public class WatchList_Window extends JInternalFrame
{

    //Add the WatchList Tab Pane ::  FX , CRYPTO, INDICES, ENERGIES,METALS, COMMODITIES
    WatchList_TabPANE WatchList_Pane = new WatchList_TabPANE();

    //Add a WatchList Manager
    WatchList_Manager WatchList_Manager = new WatchList_Manager();


    public WatchList_Window() {
        //Set Title
        this.setTitle("WATCHLIST");

        //Set the Properties
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setIconifiable(true);


        JLabel Text = new JLabel("WATCHLIST Window");
        this.add(Text);


        this.add(WatchList_Pane);
        WatchList_Pane.setVisible(true);





    }



    //Alert MDI Window Manager that you are closing so that it can set Parametres and resave layout.




}
