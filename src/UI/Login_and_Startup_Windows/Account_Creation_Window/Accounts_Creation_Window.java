package UI.Login_and_Startup_Windows.Account_Creation_Window;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import net.miginfocom.swing.MigLayout;


import javax.swing.*;
import java.awt.*;

public class Accounts_Creation_Window extends JFrame
{
    public Accounts_Creation_Window()
    {

        //1. Set Window Size and spawn Location.
        this.setBounds(200,200,500,700);
        this.setAlwaysOnTop(true);

        //2.    Set Window Close Action.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //3.    This Window is Resizable.
        this.setResizable(false);

        //4.    Set MigLayout as the Window Layout
        this.setLayout(new MigLayout());

        //5.    Set Default Font for the Frame as Roboto
        this.setFont(new Font(FlatRobotoFont.FAMILY ,Font.PLAIN ,12));

        //TODO  Change Icon for this Window to Lightning and keep Frame Name.
        this.setTitle("REGISTRATION WINDOW.");



        //TODO  Add a Large - CREATE ACC LABEL AT THE TOP OF THE WINDOW
        JLabel AccountCreation_Label = new JLabel("CREATE ACCOUNT ");
        AccountCreation_Label.setVisible(true);
        this.add(AccountCreation_Label,"span");

        //TODO Add Create Acc Form Panel



        // TODO  Create a JFileChooser and Select Location to Save System Files  - Files saved under UserName
        //TODO Create button to return to the Login Window
        //Todo Create an Exit Button
        JButton Exit_Button = new JButton("EXIT");
        Exit_Button.addActionListener(e -> Exit_Application() );
        this.add(Exit_Button,"span");



    }


    public void Exit_Application()
    {
        //Exit the Application
        System.exit(0);

    }


}
