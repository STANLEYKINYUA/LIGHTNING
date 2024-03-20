package aa_USER_INTERFACE_COMPONENTS.a_THEMES;

import com.formdev.flatlaf.FlatLightLaf;

public class FlatLight_Laf extends FlatLightLaf
{
    public static boolean setup()
    {

        return setup(new FlatLight_Laf());
    }

    @Override
    public String getName()
    {
        return "MyFlatLight_Laf";
    }
}
