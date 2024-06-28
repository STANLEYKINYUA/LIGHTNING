package UI.a_THEMES;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

//extends the Purple Intellij LAF
public class DarkPurple_Laf extends FlatDarkPurpleIJTheme
{
    public static boolean setup()
    {

        return setup(new DarkPurple_Laf());
    }

    @Override
    public String getName()
    {
        return "MyDarkPurple_Laf";
    }

}
