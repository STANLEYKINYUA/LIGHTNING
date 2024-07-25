package UI.Main_Trading_Window.TOOLBAR;



import javax.swing.*;
import java.awt.*;

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

        JButton NewChart_Button = new JButton("Icon here");
        //NewChart_Button.setIcon();
        this.add(NewChart_Button);








    }
}
