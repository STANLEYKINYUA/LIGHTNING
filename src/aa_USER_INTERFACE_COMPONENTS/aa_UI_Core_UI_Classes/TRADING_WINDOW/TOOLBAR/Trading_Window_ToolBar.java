package aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.TRADING_WINDOW.TOOLBAR;

import javax.swing.*;

/** This is the toolbar of the Trading Window*/
public class Trading_Window_ToolBar extends JToolBar
{
    /**Default Constructor for the Trading ToolBar class */
    public Trading_Window_ToolBar()
    {
        this.setRollover(true);


        //Change BackGround Color of Toolbar so it stands out.
        //ToolBar.setBackground(Color.GRAY);

        //Create Buttons to add to ToolBar.

        JButton New_Window_ToolBar_Button = new JButton();
        New_Window_ToolBar_Button.setText("New Window");
        // Special FlatLaf Customization Features
        New_Window_ToolBar_Button.putClientProperty("Button.arc",100);

        JButton NODES_Button = new JButton();
        NODES_Button.setText("NODES");

        JButton ANALYSIS_BUTTON = new JButton();
        ANALYSIS_BUTTON.setText("ANALYSIS");

        //TODO  Create Different Toolbar Icons and Commands separated by Seperators
        //TODO  Display Different Toolbar Items
        //TODO  Add FlatLaf specific features to the toolbar

        //Add this buttons to the toolbar.
        this.add(New_Window_ToolBar_Button);
        this.addSeparator();
        this.add(NODES_Button);
        this.addSeparator();
        this.add(ANALYSIS_BUTTON);

    }
}
