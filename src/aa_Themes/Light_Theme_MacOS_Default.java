/*
 *   AUTHOR      :   STANLEY ANDREW KINYUA
 *   CLASS       -   Light_Theme_MacOS_Default
 *   purpose :
 *               * Default Light theme that Describes how features look like.
 */
package aa_Themes;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Light_Theme_MacOS_Default extends FlatMacLightLaf
{
    //Default Light Theme for my Application.
    public static boolean setup()
    {
        return setup(new Light_Theme_MacOS_Default());
    }

    @Override
    public String getName()
    {
        return "Light_Theme_MacOS_Default";
    }
}
