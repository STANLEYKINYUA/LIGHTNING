package UI.Login_and_Startup_Windows.Account_Creation_Window;

import UI.Login_and_Startup_Windows.LOGIN_WINDOW.Login_Window;
import UI.Main_Trading_Window.MAIN_TRADING_WINDOW;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.jidesoft.swing.ButtonStyle;
import com.jidesoft.swing.JideButton;
import net.miginfocom.swing.MigLayout;


import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Accounts_Creation_Window extends JFrame
{
    public Accounts_Creation_Window()  {

        //1. Set Window Size and spawn Location.
        this.setBounds(200,200,500,600);
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


        //Create a back button
        JButton Back_Button = new JButton("Return to Login");
        Back_Button.addActionListener( e -> Return_to_Login());
        this.add(Back_Button,"span");


        //TODO  Add a Large - CREATE ACC LABEL AT THE TOP OF THE WINDOW
        JLabel CreateAcc_Label = new JLabel("CREATE ACCOUNT ");
        CreateAcc_Label.setVisible(true);

        this.add(CreateAcc_Label,"span");


        //TODO Add Create Acc Form Panel


        //Firstname
        JLabel FirstName_Label = new JLabel("FIRST NAME");
        this.add(FirstName_Label,"span");

        JTextField FirstName_txtBox = new JTextField();
        this.add(FirstName_txtBox,"span, width 50%");


        //Middle Name
        JLabel MiddleName_Label = new JLabel("MIDDLE NAME");
        this.add(MiddleName_Label);

        JTextField MiddleName_txtBox = new JTextField();
        this.add(MiddleName_txtBox,"span, width 50%");

        //Last Name
        JLabel LastName_Label = new JLabel("LAST NAME");
        this.add(LastName_Label);

        JTextField LastName_txtBox = new JTextField();
        this.add(LastName_txtBox,"span, width 50%");



        //UserName
        JLabel UserName_Label = new JLabel("USER NAME");
        this.add(UserName_Label);
        JTextField UserName_txtBox = new JTextField();
        this.add(UserName_txtBox,"span, width 50%");

        //Email + Email Validation
        JLabel Email_Label = new JLabel("EMAIL");
        this.add(Email_Label);
        JTextField Email_txtBox = new JTextField();
        this.add(Email_txtBox,"span, width 50%");

        //Password  + Password Strength Validation ( 6 char + 1 UC+1LC + 1number+ 1symbol)
        JLabel Password_Label = new JLabel("ENTER PASSWORD");
        this.add(Password_Label,"width 50%");

        JPasswordField Pasword_TxtBx = new JPasswordField();
        this.add(Pasword_TxtBx,"span, width 50%");

         //Re enter Password
        JLabel ReEnter_Password_Label = new JLabel("RE-ENTER PASSWORD");
        this.add(ReEnter_Password_Label,"width 50%");

        JPasswordField ReEnter_Pasword_TxtBx = new JPasswordField();
        this.add(ReEnter_Pasword_TxtBx,"span, width 50%");
        //Recovery Question1 Combo Box
        //Recovery Questio1 Answer

        //Recovery Question2 Combo Box
        //Recovery Question2 Answer




        //TODO Create a Create Account Button
        JButton CreateAccount_Button = new JButton("CREATE ACCOUNT");
        this.add(CreateAccount_Button,"span");
        CreateAccount_Button.addActionListener( e -> Create_Account());

        //Todo Create an Exit Button
        JButton Exit_Button = new JButton("EXIT");
        Exit_Button.addActionListener(e -> Exit_Application() );
        this.add(Exit_Button,"span");



    }


    public void Create_Account()
    {
        this.dispose();
        MAIN_TRADING_WINDOW TradingWindow = new MAIN_TRADING_WINDOW();
        TradingWindow.setVisible(true);
    }
    public void Return_to_Login()
    {
        Login_Window Login = new Login_Window();
        Login.setVisible(true);
        this.dispose();

    }

    public void Exit_Application()
    {
        //Exit the Application
        System.exit(0);

    }


}
