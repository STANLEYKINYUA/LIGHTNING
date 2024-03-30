package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Login_and_Startup_Windows.LOGIN_WINDOW;

import javax.swing.*;

/** TextBox where Password is Entered*/
public class PasswordTxtBox extends JPasswordField
{
    /** Default Constructor for Password text box */
    public PasswordTxtBox()
    {
        //Set tooltip text to
        this.setToolTipText("ENTER PASSWORD");

        //Set it to Echo * when password is entered.
        this.setEchoChar('*');

        //try to use a FLATLAF key to Display Password Reveal Icon
       // UIManager.put("PasswordField.showRevealButton",true);
       // UIManager.put("PasswordField.showCapsLock",false);


    }
}
