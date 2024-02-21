/*
*   PROGRAM     :  LIGHTNING TRADER WORKSTATION.
*
*   AUTHOR      :   STANLEY ANDREW KINYUA
*
*   PURPOSE     :   An advanced Trading Platform that integrates seamlessly with multiple Brokers and Execution Venues
*                   and allows for Trades, Orders and Positions to be managed from a singular point thus improving
*                   efficiency and allowing for new features such as Liquidity Sourcing + Leverage Management  and
*                   Improved reporting after Trading periods are over.
*
*   LICENSE     :   None
*
*   COPYRIGHT   :   2024.
*
*
*
*
* */


import aa_UI_Login_and_Startup_Windows.Splash_Screen_Window;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.jetbrains_mono.FlatJetBrainsMonoFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.*;


public class Main {
    public static void main(String[] args)
    {
        //Hello World to prove that the program works.
        System.out.println("BUILD SUCCESS!!");

        //Start the Swing Application with  a try catch block.
        try
        {
            //Install Font Packs
            FlatRobotoMonoFont.install();
            FlatRobotoFont.install();
            FlatInterFont.install();
            FlatJetBrainsMonoFont.install();

            //Set the Themes File. - Set Dark Theme
            FlatMacDarkLaf.registerCustomDefaultsSource("aa_Themes.Dark_Theme_MacOS_Default");

            //try setting the Default look and Feel to use FlatLaf MACOS Light.
            //UIManager.setLookAndFeel(new FlatMacDarkLaf());
            FlatMacDarkLaf.setup();


            //Load the SplashScreen. - Create the EventQueue to Load the Splash Screen Form
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    // Load Splash Screen with GlassMorphism Effect and Wait 5 - 7 seconds
                    JFrame Splash_Screen = new Splash_Screen_Window();
                    Splash_Screen.setVisible(true);

                    // Load Login Form in the Background.

                    // Close Splash Screen.

                }
            });
        }
        catch(Exception EX)
        {
            //print out the exception.
            EX.printStackTrace();
        }


    }
}