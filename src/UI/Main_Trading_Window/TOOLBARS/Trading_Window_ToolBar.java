package UI.Main_Trading_Window.TOOLBARS;



import javax.swing.*;
import java.awt.*;

/** This is the toolbar of the Trading Window*/
public class Trading_Window_ToolBar extends JToolBar
{
    /**Default Constructor for the Trading ToolBar class */
    public Trading_Window_ToolBar()
    {
        this.setRollover(true);

        //Create Buttons to add to ToolBar.

        //New Chart Icon
        JButton NewChart_Button = new JButton();
        ImageIcon NewChart_Icon = new ImageIcon("11-ICONS/Combo Chart.png");

                //Resize the Icon to Fit
                Image IconImage = NewChart_Icon.getImage();
                Image Transformed_ChartICON = IconImage.getScaledInstance(20,20, Image.SCALE_SMOOTH);
                ImageIcon ResizedIcon = new ImageIcon(Transformed_ChartICON);

        NewChart_Button.setIcon(ResizedIcon);
        NewChart_Button.setToolTipText("Open Chart");
        this.add(NewChart_Button);

        //Calendar Icon








    }
}
