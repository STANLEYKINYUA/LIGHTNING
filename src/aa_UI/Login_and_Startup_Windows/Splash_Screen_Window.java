/*
    PROGRAM     :  LIGHTNING TRADER WORKSTATION.
*   AUTHOR      :   STANLEY ANDREW KINYUA
*   LICENSE     :   None
*   COPYRIGHT   :   2024.

*   CLASS   -   SPLASH_SCREEN_WINDOW

    USE     -   Draws a splash Screen that will be used during App Startup.
*/

package aa_UI.Login_and_Startup_Windows;


import aa_UI.Login_and_Startup_Windows.LOGIN_WINDOW.Login_Window;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Splash_Screen_Window extends javax.swing.JFrame
{
    double Version_Number = 0.01;   //  Version Number of the Program.


    public Splash_Screen_Window()
    {
        

        //Lower the Opacity.



        //The splash Screen is always on top
        this.setAlwaysOnTop(true);

        // The window is not expandable
        this.setResizable(false);

        // SetLayout
        this.setLayout(new MigLayout());


        //Set Close action to exit
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Set the size and the placement of the window.
        this.setBounds(200,250,600,300);

        //This Window does not have a title bar

        //Create a Label and add its parameters
        JLabel SplashScreen_Label = new JLabel("LIGHTNING TRADER WORKSTATION");
        SplashScreen_Label.setBounds(0,50,400,30);

        //Set the Font for the Label as well as the Size
        SplashScreen_Label.setFont(new Font(FlatRobotoFont.FAMILY , Font.PLAIN ,24));




        //add the Label to the Form
        this.add(SplashScreen_Label,"span,center");

        //Create a Button that loads the
        JButton ENTER_APPLICATION_BUTTON = new JButton();
        ENTER_APPLICATION_BUTTON.setText("ENTER");
        ENTER_APPLICATION_BUTTON.setBounds(200,100,100,60);


        //Add the button to the Form
        this.add(ENTER_APPLICATION_BUTTON);


        //Event Listener for Splash Screen that redirects to Login Form.
        ENTER_APPLICATION_BUTTON.addActionListener(e -> {SHOW_LOGIN_FORM();});

        //Version Number Label.
        JLabel Version_Number_Label = new JLabel();
        var Version = Double.toString(Version_Number);
        Version_Number_Label.setText("Version" +" "+ Version);
        this.add(Version_Number_Label);
        Version_Number_Label.setBounds(500,230,100,20);

        //TODO  Read Config File and Determine whether it is First Load / Other load
        //TODO  Read OS and Set Config File Locations Appropriately as well as the File
        //TODO  Decide Whether to redirect towards Login Form or towards



    }


    // This Function is used to dispose of this Form.
    void SPLASH_SCREEN_FORM_HIDE()
    {
            // Dispose of this Form.
            this.dispose();

    }

    //
    void SHOW_REGISTRATION_WINDOW()
    {
        // Display Registration Form.



    }

    void SHOW_LOGIN_FORM()
    {
        //Display the Login Form.
        JFrame Login_Form = new Login_Window();
        Login_Form.setVisible(true);

        // hide Current Form.
        SPLASH_SCREEN_FORM_HIDE();


    }








}
