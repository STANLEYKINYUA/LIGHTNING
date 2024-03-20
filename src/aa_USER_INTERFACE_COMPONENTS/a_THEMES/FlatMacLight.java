package aa_USER_INTERFACE_COMPONENTS.a_THEMES;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class FlatMacLight extends FlatMacLightLaf
{
    public static boolean setup()
    {

        return setup(new FlatMacLight());
    }

    @Override
    public String getName()
    {
        return "MyFlatMacLight_Laf";
    }
}
