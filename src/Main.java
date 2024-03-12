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


import aa_USER_INTERFACE_COMPONENTS.aa_UI_Login_and_Startup.Splash_Screen_Window;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.jetbrains_mono.FlatJetBrainsMonoFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.*;



public class Main {
    public static void main(String[] args)
    {
        //Hello World to prove that the program works.
        System.out.println("BUILD SUCCESS!!");

        // Try to set Graphics properties

        //Install Font Packs
        FlatRobotoMonoFont.install();
        FlatRobotoFont.install();
        FlatInterFont.install();
        FlatJetBrainsMonoFont.install();

        // Read Config File and determine whether to perform first load actions. load Dark/ Light Mode

        //Load and Start
        init_dark_theme();

        //Start and Display the Terminal Window.
        init_TERMINAL();

    }

    //Dark Theme Initialization
    static void init_dark_theme()
    {
        //Start the Swing Application with  a try catch block.
        try
        {

            //Set the Themes File. - Set Dark Theme
            FlatMacDarkLaf.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.aa_Themes.Dark_Theme_MacOS_Default");

            //UIManager.setLookAndFeel(new FlatMacDarkLaf());
            FlatMacDarkLaf.setup();

            //Load the SplashScreen. - Create the EventQueue to Load the Splash Screen Form
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    //Load Direct to the Splash Screen.
                    JFrame Splash_Screen = new Splash_Screen_Window();
                    Splash_Screen.setVisible(true);

                    // Timer CountDown


                    // Close Splash Screen.

                }
            });
        }
        catch(Exception EX)
        {
            //print out the exception.
            EX.printStackTrace();

            //Draw an Alert Window that shows the full exception Message.


        }

    }



    // Light Theme Initialization
    static void init_light_theme(){}


    // Initialize the Terminal
    static void init_TERMINAL()
    {
        //Display the Terminal.

    }



}