package aa_UI.Trading_Windows.Dockable.Charts_ChartEngine_and_INDICATORS.Charts;

public interface GENERIC_CHART
{

    //Functions to Open and Close Chart
    void Close_Chart();

    // Functions that allow Pan and Zoom Features.
    void Pan();     //  A function to Pan Charts_and_Objects.
    void Zoom();    //  A function to Zoom


    // Functions to Set Color and Themes
    void Set_Dark_Theme();
    void Set_Light_Theme();

    //Functions that Spawn Windows that take Settings and Affect the Chart.
    void Spawn_Order_Window(String Symbol);
    void Spawn_Indicator_Settings_Window();
    void Spawn_Color_Picker_Window();

    void Set_Chart_Background_Color();

    //
}
