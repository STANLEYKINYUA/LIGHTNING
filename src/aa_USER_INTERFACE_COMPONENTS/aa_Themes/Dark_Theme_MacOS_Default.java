/*
*   AUTHOR      :   STANLEY ANDREW KINYUA
*   CLASS       -   Dark_Theme_MacOS_Default
*   purpose :
*               * Default Dark theme that Describes how features look like.
*/
package aa_USER_INTERFACE_COMPONENTS.aa_Themes;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Dark_Theme_MacOS_Default extends FlatMacDarkLaf
{
    //This is the Default Dark theme for my Application.
    public static boolean setup()
    {
        return setup(new Dark_Theme_MacOS_Default());
    }

    @Override
    public String getName()
    {
        return "Dark_Theme_MacOS_Default";
    }

}
