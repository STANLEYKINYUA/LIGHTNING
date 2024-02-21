/*
    PROGRAM     :  LIGHTNING TRADER WORKSTATION.
*   AUTHOR      :   STANLEY ANDREW KINYUA
*   LICENSE     :   None
*   COPYRIGHT   :   2024.

*   CLASS   -   SPLASH_SCREEN_WINDOW

    USE     -   Draws a splash Screen that will be used during App Startup.
*/

package aa_UI_Login_and_Startup_Windows;

import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Splash_Screen_Window extends JFrame
{
    //This is a blank Window with Some Transparency and some Text.


    public Splash_Screen_Window()
    {
        //Set the Specifications of this Form in this Class Constructor

        //The splash Screen is always on top
        this.setAlwaysOnTop(true);

        // The window is not expandable
        this.setResizable(false);

        // SetLayout
        this.setLayout(new MigLayout());

        //Set Close action to exit
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Set the size and the placement of the window.
        this.setBounds(200,200,300,200);

        //Create a Label and add it's parametres
        JLabel SplashScreen_Label = new JLabel("LIGHTNING TRADER WORKSTATION");
        SplashScreen_Label.setBounds(50,50,100,30);

        //add the Label to the Form
        this.add(SplashScreen_Label);





    }




}
