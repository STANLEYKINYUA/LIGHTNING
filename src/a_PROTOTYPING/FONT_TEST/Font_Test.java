package a_PROTOTYPING.FONT_TEST;

import UI.a_THEMES.FlatMacDark_LAF;

import javax.swing.*;

public class Font_Test
{





    public static void main(String[] args)
    {
        //Set Flat Laf Theme
        FlatMacDark_LAF.registerCustomDefaultsSource("UI.a_THEMES");
        FlatMacDark_LAF.setup();







        SwingUtilities.invokeLater(()-> new FONT_DISPLAY().setVisible(true));

        System.out.println("BUILD SUCCESSFUL");
    }
}
