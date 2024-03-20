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


import aa_11_DEV_TERMINAL.CMD_Terminal;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Login_and_Startup.Login_Window;
import aa_USER_INTERFACE_COMPONENTS.aa_UI_Login_and_Startup.Splash_Screen_Window;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.jetbrains_mono.FlatJetBrainsMonoFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import quickfix.Log;

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
        init_Application();



    }

    //Dark Theme Initialization
    static void init_Application()
    {
        //Start the Swing Application with  a try catch block.
        try
        {
            //Fetch the Theme.
            String Current_Theme = Theme;


            //Here we Install the FlatLaf Theme Depending on the Selected Theme in Config File.

                    //Carbon_Theme
            if(Current_Theme == "CARBON")
            {}


            //Load the SplashScreen. - Create the EventQueue to Load the Splash Screen Form
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    //Load Direct to the Login Screen.
                    JFrame Login_Screen = new Login_Window();
                    Login_Screen.setVisible(true);

                    //Load Terminal for Test.
                    JFrame Terminal = new CMD_Terminal();
                    Terminal.setVisible(true);







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


    //Create a Function to Set theme.
    static void Set_Theme(String Theme_to_Set)
    {
        //Create a block to catch exceptions.
        try
        {
            //set the theme variable.
            String Theme = Theme_to_Set;

            //Select Appropriate Theme and Set it.
                    //CARBON LAF
                    //D
        }
        catch(Exception Theme_Install_Failed_Exception)
        {
            //TODO  Write to Log File.
            //TODO  Proper exception Handling with a window and more logging
            Theme_Install_Failed_Exception.printStackTrace();
        }
    }









}