package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.Charts.IndicatorManager;

/**Interface for all Indicators that they must implement*/
public interface INDICATOR_INTERFACE
{
    /**Sets the Default Variables used during program execution */
    int Default_Price_Queue_Size = 1000000;
    int PriceArray_StartIndex = 0;
    int PriceArray_LastIndex  = 999999;
    int PriceArray_MiddlePoint = 499999;
    int PriceArray_LatestData_Index=500000;
    int PriceArray_OldestData_Index=0;

    /**Price Array that holds data for Computation of Indicators*/
    Double[] PriceArray = new Double[1000000];


    /**Functions that deal with Computation of Prices */
    void Update_Prices_Array();
    void Fetch_Prices(int Start_Index , int End_Index);
    void Calculate_Indicator();

    /**Functions that are used to Display the Indicator */
    void Plot_Indicator();
    void Change_IndicatorColour();
    void Change_IndicatorLineStyle();
    void Change_IndicatorLineThickness();





}
