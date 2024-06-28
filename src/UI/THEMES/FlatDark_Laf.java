package UI.THEMES;

import com.formdev.flatlaf.FlatDarkLaf;

//Inherits from Flat Dark Laf
public class FlatDark_Laf extends FlatDarkLaf
{
    public static boolean setup()
    {

        return setup(new FlatDark_Laf());
    }

    @Override
    public String getName()
    {
        return "MyFlatDark_Laf";
    }
}
