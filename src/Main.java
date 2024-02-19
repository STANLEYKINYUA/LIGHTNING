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


import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Hello World to prove that the program works.
        System.out.println("HELLO WORLD!!");

        //Start the Swing Application with  a try catch block.
        try
        {
            //try setting the Default look and Feel to use FlatLaf MACOS Light.
            UIManager.setLookAndFeel(new FlatMacLightLaf());

            //Load the SplashScreen. - Create the EventQueue to Load the Splash Screen Form
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run()
                {
                    // Load Splash Screen with GlassMorphism Effect and Wait 5 - 7 seconds

                    // Load Login Form in the Background.

                    // Close Splash Screen.

                }
            });
        }
        catch(Exception EX)
        {
            //print out the exception.
            System.out.println("Failed to Load SplashScreen with Exception" + EX);
        }


    }
}