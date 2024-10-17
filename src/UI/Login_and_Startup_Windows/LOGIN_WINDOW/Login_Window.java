/*
*   AUTHOR      :   STANLEY ANDREW KINYUA
*   COPYRIGHT   :   2024.
*
*    CLASS  -   LOGIN_WINDOW
*
*       USE ::
*               1.  Creates a Login Window to allow us to Login
*               2.  Redirects to Registration Window allowing us to register.
*
* */
package UI.Login_and_Startup_Windows.LOGIN_WINDOW;

import UI.Main_Trading_Window.MAIN_TRADING_WINDOW;
import UI.Login_and_Startup_Windows.Account_Creation_Window.Accounts_Creation_Window;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class Login_Window extends JFrame
{

    //Create Constructor for this class.
    public Login_Window()
    {
        //Initialize Window.
        init_Login_Window();




    }


    //Use Exception handling to Create and Load form safely.
    void init_Login_Window()
    {
        //Try - Catch block to catch any exceptions.
        try
        {
            //this window is not always on top.
            this.setAlwaysOnTop(false);

            //This Window is not expandable.
            this.setResizable(false);

            // Create a transparency effect

            //set Layout to MigLayout.
            this.setLayout(new MigLayout());


            //Set the Close Action to Exit the Program.
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            //Set the Placement as well as the size of the Window
            this.setBounds(400,250,400,500);

            //Set the Default Label for this Form as ROBOTO
            this.setFont(new Font(FlatRobotoFont.FAMILY , Font.PLAIN , 12));

            // START LAYING OUT FORM ELEMENTS

            // LOGIN LABEL for LOGIN FORM.
            LoginLABEL Login_Label = new LoginLABEL();
            this.add(Login_Label,"span,center,gapbottom 15");

            //----------------------------------------------------------------------------
            // USERNAME Label
            UsrNameLABEL Usr_Name_Label = new UsrNameLABEL("USER NAME");
            this.add(Usr_Name_Label,"align label");

            //UserName Text Box where UserName is Entered.
            UsrNameTxtBOX User_Name_Text_Box = new UsrNameTxtBOX();
            this.add(User_Name_Text_Box,"span, w 200px! ,h 30px!");


            //TODO  Mouse Listener that displays tooltip on Mouse enter Username Field

            //----------------------------------------------------------------------------

            // Password Field for User
            PasswordLABEL Password_Label = new PasswordLABEL();
            this.add(Password_Label,"align label");

            //  Password Text Field
            PasswordTxtBox User_Password = new PasswordTxtBox();
            this.add(User_Password,"span ,w 200px! , h 30px!");



            //TODO Create a Mouse Listener that opens tooltip on Hover.

            //----------------------------------------------------------------------------


            //Login Button
            JButton Login_Button = new JButton();
            Login_Button.setText("LOGIN");
            Login_Button.setFocusPainted(true);

            this.add(Login_Button,"span, w 200px , h 80px,center");

            //Event Listener for Login Button to Open Main Trading Window

            //TODO  Create an exception Handling block to deal with Opening of Main trading Window
            Login_Button.addActionListener(e ->
            {
                try {
                    Display_Main_Trading_Window();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                } catch (ExecutionException ex) {
                    throw new RuntimeException(ex);
                } catch (TimeoutException ex) {
                    throw new RuntimeException(ex);
                }
            });
            //----------------------------------------------------------------------------

            // HyperLink for Forgot Password
            Forgot_Password_Link Forgot_Password = new Forgot_Password_Link();
            this.add(Forgot_Password,"span,center");
            //----------------------------------------------------------------------------

            // Registration Button.
            JButton Create_Account_Button = new JButton();
            Create_Account_Button.setText("Create Account");
            Create_Account_Button.setFont(new Font(FlatRobotoFont.FAMILY , Font.PLAIN , 12));
            this.add(Create_Account_Button);

            // Event Listener to display Opening of registration window.
            Create_Account_Button.addActionListener(e -> {
                try {
                    Display_Registration_Window();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (FontFormatException ex) {
                    throw new RuntimeException(ex);
                }
            });



        }
        catch(Exception Login_Window_Exception)
        {
            //TODO  Utilize Logging engine to write the General Log and Exceptions Log.
            Login_Window_Exception.printStackTrace();

        }
    }

    //Display THE Main Trading Window
    void Display_Main_Trading_Window() throws IOException, URISyntaxException, InterruptedException, ExecutionException, TimeoutException {
       // Display the Main Trading Window
        MAIN_TRADING_WINDOW  MainTrading_Window = new MAIN_TRADING_WINDOW();

        MainTrading_Window.setSize(1400,800);
        MainTrading_Window.setLocation(20,20);
        MainTrading_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make it Visible
        MainTrading_Window.setVisible(true);



        //Hide the Login Window
        this.dispose();


    }

    //Display the Registration Window.
    void Display_Registration_Window() throws IOException, FontFormatException {
        //Display the Registration Form.
        JFrame Registration_Form = new Accounts_Creation_Window();
        Registration_Form.setVisible(true);


        //Hide the Login Window
        this.dispose();

    }


}
