package aa_USER_INTERFACE_COMPONENTS.a_THEMES;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

// Inherits the Carbon_Laf Theme
public class Carbon_Laf extends FlatCarbonIJTheme
{
    public static boolean setup()
    {
        return setup(new Carbon_Laf());
    }

    @Override
    public String getName()
    {
        return "MyCarbon_Laf";
    }

}
