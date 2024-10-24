package GENERAL_SYSTEMS.THEMES;

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
