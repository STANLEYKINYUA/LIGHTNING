package a_PROTOTYPING.FONT_TEST;

import a_PROTOTYPING.ModernDocking_prototype.Hello;
import aa_USER_INTERFACE_COMPONENTS.a_THEMES.FlatMacDark_LAF;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Font_Test
{





    public static void main(String[] args)
    {
        //Set Flat Laf Theme
        //FlatMacDark_LAF.registerCustomDefaultsSource("aa_USER_INTERFACE_COMPONENTS.a_THEMES");
       // FlatMacDark_LAF.setup();







        SwingUtilities.invokeLater(()-> new FONT_DISPLAY().setVisible(true));

        System.out.println("BUILD SUCCESSFUL");
    }
}
