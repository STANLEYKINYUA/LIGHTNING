package aa_UI.Login_and_Startup_Windows.LOGIN_WINDOW;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import javax.swing.*;
import java.awt.*;

/** The Label located in the Login Form that Displays the Login Text*/
public class LoginLABEL extends JLabel
{
    /**Default Constructor for Login Label*/
    public LoginLABEL()
    {
        //Set the Text of the Login Label
        this.setText("LOGIN");

        //Set the Font Size
        this.setFont(new Font(FlatRobotoFont.FAMILY , Font.PLAIN ,36));

        //Set the Absolute Location on the Screen.
        this.setBounds(20,10,200,200);

    }
}
