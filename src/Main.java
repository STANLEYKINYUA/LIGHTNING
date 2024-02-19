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

            //Load the SplashScreen.
        }
        catch(Exception EX)
        {
            //print out the exception.
            System.out.println("Failed to Load SplashScreen with Exception" + EX);
        }


    }
}