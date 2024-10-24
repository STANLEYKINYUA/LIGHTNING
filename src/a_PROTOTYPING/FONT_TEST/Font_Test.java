package a_PROTOTYPING.FONT_TEST;

import GENERAL_SYSTEMS.THEMES.FlatMacDark_LAF;

import javax.swing.*;

public class Font_Test
{





    public static void main(String[] args)
    {
        //Set Flat Laf Theme
        FlatMacDark_LAF.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
        FlatMacDark_LAF.setup();







        SwingUtilities.invokeLater(()-> new FONT_DISPLAY().setVisible(true));

        System.out.println("BUILD SUCCESSFUL");
    }
}
