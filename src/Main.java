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


import aa_USER_INTERFACE_COMPONENTS.a_THEMES.*;
import aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Login_and_Startup_Windows.Splash_Screen_Window;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.jetbrains_mono.FlatJetBrainsMonoFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;




public class Main {
    public static void main(String[] args)
    {
        //Hello World to prove that the program works.
        System.out.println("BUILD SUCCESS!!");


        //TODO Read Config File and determine whether to perform first load actions. load Dark/ Light Mode
            //TODO  Extract Fonts to Special Folder
            //TODO  Write Config Files
            //TODO  Create LogFiles and initialize Loggers
            //TODO  Read UserAccount Files and prepare Password Hashes

        //Install FlatLaf Font Packs
        Install_Flat_Laf_Fonts();

        //Install my Custom Fonts




        //Load and Start
        init_Application();



    }

    /** Dark Theme Initialization */
    static void init_Application()
    {
        //Start the Swing Application with  a try catch block.
        try
        {
            //Create Variables.
            String Theme_to_Install="";

            //Read Config File and Fetch Theme.

            //Here we Install the FlatLaf Theme Depending on the Selected Theme in Config File.
            Set_Theme(Theme_to_Install);



            //Load the SplashScreen. - Create the EventQueue to Load the Splash Screen Form
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    //Need a Splash Screen so we can decide whether to create Login Form/ Registration For,
                    JFrame Splash_Screen = new Splash_Screen_Window();
                    Splash_Screen.setVisible(true);

                    //Load Terminal for Test.
                    //JFrame Terminal = new CMD_Terminal();
                    //Terminal.setVisible(true);







                }
            });
        }
        catch(Exception EX)
        {
            //print out the exception.
            EX.printStackTrace();

            //TODO  Draw an Alert Window using my Exceptions and Notifications that shows the full exception Message.


        }

    }


    /** Create a Function to Set theme. */
    static void Set_Theme(String Theme_to_Set)
    {
        //Create a block to catch exceptions.
        try
        {
            //set the theme variable.
            String Theme = Theme_to_Set;

            //Select Appropriate Theme and Set it.
                    //CARBON LAF
            if(Theme == "Carbon")
            {
                //Set Carbon as the Look and Feel.
               FlatCarbonIJTheme.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
                Carbon_Laf.setup();
            }
                    //DarkPurple LAF
            if(Theme == "DarkPurple_LAF")
            {
                //Set DarkPurple_LAF as the Look and Feel.
                FlatDarkPurpleIJTheme.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
                DarkPurple_Laf.setup();
            }
                    //FlatDark LAF
            if(Theme == "FlatDark_LAF")
            {
                //Set FlatDark_LAF as the Look and Feel.
                FlatDarkLaf.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
                FlatDark_Laf.setup();
            }
                    //FlatLight LAF
            if(Theme == "FlatLight_LAF")
            {
                //Set FlatLight_LAF as the Look and Feel.
                FlatLightLaf.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
                FlatLight_Laf.setup();
            }
                    //FlatMacDark_LAF LAF
            if(Theme == "FlatMacDark_LAF")
            {
                //Set Flat MacDark_LAF as the Look and Feel.
                FlatMacDarkLaf.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
                FlatMacDark_LAF.setup();

            }
                    //FlatMacLight_LAF LAF
            if(Theme == "FlatMacLight_LAF")
            {
                //Set FlatMacLight_LAF as the Look and Feel.
                FlatMacLightLaf.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
                FlatMacLight_LAF.setup();
            }


            //TODO      Remove this and use Config File
            //  Using FLATMACDark so that I can continue development
            FlatMacDarkLaf.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
            FlatMacDark_LAF.setup();



        }
        catch(Exception Theme_Install_Failed_Exception)
        {
            //TODO  Write to Log File.
            //TODO  Proper exception Handling with a window and more logging
            Theme_Install_Failed_Exception.printStackTrace();
        }
    }

    /** This installs Fonts Associated with FlatLaf */
    static void Install_Flat_Laf_Fonts()
    {
        try
        {
            //Install FlatLaf Fonts
            FlatRobotoMonoFont.install();
            FlatRobotoFont.install();
            FlatInterFont.install();
            FlatJetBrainsMonoFont.install();

        }
        catch(Exception FlatLafFonts_Install_Fail)
        {
            FlatLafFonts_Install_Fail.printStackTrace();
        }
    }

    /** Create a Function that When called Loads a Variety of Fonts into the System */
    static void Install_New_Custom_Fonts()
    {
        try
        {
            //Load Fonts


        }
        catch(Exception LOAD_FONTS_EXCEPTION)
        {
            //simple print out exception.
            LOAD_FONTS_EXCEPTION.printStackTrace();

            //TODO  Draw an Alert Window using my Exceptions and Notifications that shows the full exception Message.
        }
    }









}