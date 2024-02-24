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
package aa_UI_Login_and_Startup_Windows;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Login_Window extends JFrame
{

    //Create Constructor for this class.
    public Login_Window()
    {
        //this window is not always on top.
        this.setAlwaysOnTop(false);

        //This Window is not expandable.
        this.setResizable(false);

        //Create an Opacity for glassmorphism.

        //set Layout to MigLayout.
        this.setLayout(new MigLayout());

        //Set the Close Action to Exit the Program.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Set the Placement as well as the size of the Window
        this.setBounds(400,250,250,800);

        //Set the Default Label for this Form as ROBOTO
        this.setFont(new Font(FlatRobotoFont.FAMILY , Font.PLAIN , 12));

        // START LAYING OUT FORM ELEMENTS

            // LOGIN LABEL for LOGIN FORM.
        JLabel Login_Label = new JLabel("LOGIN");
        this.add(Login_Label,"span");


            // USERNAME Label with Validation
        JLabel Usr_Name_Label = new JLabel("USER NAME");
        this.add(Usr_Name_Label);

            // TextField for Username with Default Text
        JTextPane User_Name_Text_Pane = new JTextPane();



            //  Login Password Label
            //  Password Field with Login


            //  Forgot Password HyperLink   -   Redirect to Account Recovery Dialog


    }

}
