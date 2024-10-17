package UI.Login_and_Startup_Windows.Account_Creation_Window;

import UI.Login_and_Startup_Windows.LOGIN_WINDOW.Login_Window;
import UI.Main_Trading_Window.MAIN_TRADING_WINDOW;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.jidesoft.swing.ButtonStyle;
import com.jidesoft.swing.JideButton;
import net.miginfocom.swing.MigLayout;


import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.*;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class Accounts_Creation_Window extends JFrame
{
    boolean Username_Valid = false;
    boolean Password_Valid = false;
    boolean Password_matches_ReenterPassword = false;
    boolean Password_strong_Enough = false;




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
            //Set the Icon for the Back Button

        this.add(Back_Button,"span");


        //TODO  Add a Large - CREATE ACC LABEL AT THE TOP OF THE WINDOW
        JLabel CreateAcc_Label = new JLabel("CREATE ACCOUNT ");
        CreateAcc_Label.setVisible(true);
        CreateAcc_Label.setFont(new Font(FlatRobotoFont.FAMILY_SEMIBOLD,Font.BOLD,36));
        this.add(CreateAcc_Label,"span,center");


        //TODO Add Create Acc Form Panel


        //Firstname
        JLabel FirstName_Label = new JLabel("FIRST NAME");
        this.add(FirstName_Label,"span");

        JTextField FirstName_txtBox = new JTextField();
        this.add(FirstName_txtBox,"span, width 50%");


        //Middle Name
        JLabel MiddleName_Label = new JLabel("MIDDLE NAME");
        this.add(MiddleName_Label,"span");

        JTextField MiddleName_txtBox = new JTextField();
        this.add(MiddleName_txtBox,"span, width 50%");

        //Last Name
        JLabel LastName_Label = new JLabel("LAST NAME");
        this.add(LastName_Label,"span");

        JTextField LastName_txtBox = new JTextField();
        this.add(LastName_txtBox,"span, width 50%");



        //UserName
        JLabel UserName_Label = new JLabel("USER NAME");
        this.add(UserName_Label,"span");

        JTextField UserName_txtBox = new JTextField();
        this.add(UserName_txtBox,"span, width 50%");

        //Email + Email Validation
        JLabel Email_Label = new JLabel("EMAIL");
        this.add(Email_Label,"span");

        JTextField Email_txtBox = new JTextField();
        Email_txtBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e)
            {

            }

            @Override
            public void focusLost(FocusEvent e)
            {
                //Check if Email is used or not

                //If email used :: Set backColour to red

            }
        });
        this.add(Email_txtBox,"span, width 50%");

        //Password  + Password Strength Validation ( 6 char + 1 UC+1LC + 1number+ 1symbol)
        JLabel Password_Label = new JLabel("ENTER PASSWORD");
        this.add(Password_Label,"span");

        JPasswordField Password_TxtBx = new JPasswordField();
        this.add(Password_TxtBx,"span, width 50%");

         //Re enter Password
        JLabel ReEnter_Password_Label = new JLabel("RE-ENTER PASSWORD");
        this.add(ReEnter_Password_Label,"span");

        JPasswordField ReEnter_Pasword_TxtBx = new JPasswordField();
        this.add(ReEnter_Pasword_TxtBx,"span, width 50%");



        //Create Acc Button
        JButton CreateAccount_Button = new JButton("CREATE ACCOUNT");

            //Set button properties so that it can be referred to by property file
            CreateAccount_Button.putClientProperty("JButton.buttonType","CreateAccButton");


        this.add(CreateAccount_Button,"span, w 200px , h 50px, center ");
        //CreateAccount_Button.addActionListener( e -> Create_Account();

        //Create an Exit Button
        JButton Exit_Button = new JButton("EXIT");
        Exit_Button.addActionListener(e -> Exit_Application() );
            //Set button properties so it can be referred to by prop file
            Exit_Button.putClientProperty("JButton.buttonType","Exit_Button");

        this.add(Exit_Button,"span, w 100px , h 50px, center");



    }


    public void Create_Account(String UsrName , String Passwrd) throws IOException, URISyntaxException, InterruptedException, ExecutionException, TimeoutException {
        //Fetch data from the Text boxes
        //Validate that the data is correct
        //validate that a Similar username does not exist


        //Check that all conditions have been met

        //Display Pop up and Email Verification Link





        //Close this Window
        this.dispose();

        //Open main trading Window
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

    //Securely Hash the Password
    private void Encrypt_and_Hash_Password()
    {}


    //Password Strength Check
    private void Check_Password_has_more_than_6bits(){}
    private void Check_Password_matches_Reenter_Password(){}
    private void Test_Password_Strength()
    {
        //Must have a
    }

    //Data Validation
    private void Check_if_Email_Used(){}
    private void Check_if_UserName_Used(){}



    private void Validate_Email_Correct(){}


}
