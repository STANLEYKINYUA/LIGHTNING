package UI.Login_and_Startup_Windows;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class REGISTRATION_WINDOW extends JFrame
{
    public REGISTRATION_WINDOW()
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


        //TODO Create a back button to return to the Login Window

        //TODO  Create a Registration form

            //TODO  Registration Label
            //todo  Email label + textBox  + Status Icon
            //TODO  Username label + textbox + status Icon
            //Todo  Password label + Password box + status Icon
            //TODO  Confirm password Label + Password box
            //TODO  Password Strength Indicator
            //TODO  Security Question   + Textbox
            //

            //TODO  Create Account button
                    //TODO  Create Necessary Folders + Config Files
            //TODO  Account Created Successfully PopUp Notification + Sound
            //TODO  Implement Entry validation when textbox loses Focus

        // TODO  Create a JFileChooser and Select Location to Save System Files  - Files saved under UserName


    }


    public void CreateFirstStart_ConfigFiles(){}

}
