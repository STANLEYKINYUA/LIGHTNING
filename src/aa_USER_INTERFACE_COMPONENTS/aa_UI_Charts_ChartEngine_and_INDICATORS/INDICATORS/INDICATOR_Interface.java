package aa_USER_INTERFACE_COMPONENTS.aa_UI_Charts_ChartEngine_and_INDICATORS.INDICATORS;

public interface INDICATOR_Interface
{
    //Computational Functions & Data Management.
    void Compute_Indicator_Values();
    void Update_Indicator_Values();

    //Plotting & Display Functions.
    void Plot_Indicator();
    void Clear_Indicator();
    void Show_First_Plottable_Point(); // The Point from which first plot can be made

    void Indicator_Hide();
    void Indicator_MakeVisible();


    //Styling and theming Functions
    void Set_Line_Style();      // dotted,straight,gaplines
    void Set_Line_Thickness();
    void Set_Line_Colour();
}
