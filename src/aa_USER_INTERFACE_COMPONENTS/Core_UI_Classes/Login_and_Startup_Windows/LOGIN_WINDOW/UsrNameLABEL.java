package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Login_and_Startup_Windows.LOGIN_WINDOW;

import javax.swing.*;

/** The UserName Label for the Login Window */
public class UsrNameLABEL extends JLabel
{
    /**Default Constructor for Username Label */
    public UsrNameLABEL(String Text)
    {
        String Usrname = Text;

        //Set the Text to UserName
        this.setText(Text);
    }
}
