package aa_USER_INTERFACE_COMPONENTS.aa_UI_Main_Operational_Windows;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MAIN_TRADING_WINDOW extends JFrame
{

    public MAIN_TRADING_WINDOW()
    {
        //Initialize the
        init_Trading_Window();



        //TODO  Set Layout to MigLayout.
        //TODO  Create a Menu System.
        //TODO  Create a ToolBar

        //TODO  Create A JDESKTOP Pane to Host MDI Windows


    }



    void init_Trading_Window()
    {
        //Create a try Catch block to catch any exception.
        try
        {
            //Load Window and Set Parametres.

            //1. Set Window Size and spawn Location.
            this.setBounds(200,200,1000,1000);

            //2.    Set Window Close Action.
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            //3.    This Window is Resizable.
            this.setResizable(true);

            //4.    Set MigLayout as the Window Layout
            this.setLayout(new MigLayout());

            //5.    Set Default Font for the Frame as Roboto
            this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));

        }
        catch(Exception Trading_Window_Exception)
        {
            //Print the StackTrace for this Exception.
            Trading_Window_Exception.printStackTrace();
        }


    }

    //Function to create MDI Windows
    void MDI_Window_Creator()
    {

    }

    //Function to Destroy MDI windows
    void MDI_Window_Destroyer()
    {

    }
    
}

