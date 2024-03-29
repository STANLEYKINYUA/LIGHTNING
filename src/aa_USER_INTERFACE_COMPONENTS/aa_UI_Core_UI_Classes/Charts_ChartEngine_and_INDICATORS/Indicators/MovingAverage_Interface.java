package aa_USER_INTERFACE_COMPONENTS.aa_UI_Core_UI_Classes.Charts_ChartEngine_and_INDICATORS.Indicators;

/** Describes Functions that must be implemented by MA  */
public interface MovingAverage_Interface
{

    void Fetch_Prices_Forward(int Number_of_Bars);
    void Fetch_Prices_Backward(int Number_of_Bars);


    //----------------------------------------------------------------------------------
    //Functions to Compute Moving Average
    /** Compute Moving Average from the First Bar moving Towards the Last Bar*/
    void Compute_Forward();
    /** Compute Moving Average from the Last Bar moving Backwards*/
    void Compute_Backward();
    //----------------------------------------------------------------------------------

}
