package aa_USER_INTERFACE_COMPONENTS.a_THEMES;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class FlatMacDark extends FlatMacDarkLaf
{
    public static boolean setup()
    {
        return setup(new FlatMacDarkLaf());
    }

    @Override
    public String getName()
    {
        return "MyFlatMacDark_Laf";
    }
}
