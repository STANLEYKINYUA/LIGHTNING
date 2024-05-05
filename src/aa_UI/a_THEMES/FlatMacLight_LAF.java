package aa_UI.a_THEMES;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class FlatMacLight_LAF extends FlatMacLightLaf
{
    public static boolean setup()
    {

        return setup(new FlatMacLight_LAF());
    }

    @Override
    public String getName()
    {
        return "MyFlatMacLight_Laf";
    }
}
