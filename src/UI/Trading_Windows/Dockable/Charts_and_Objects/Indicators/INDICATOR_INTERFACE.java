package UI.Trading_Windows.Dockable.Charts_and_Objects.IndicatorManager;

/**Interface for all Indicators that they must implement*/
public interface INDICATOR_INTERFACE
{
    /**Sets the Default Variables used during program execution */
    int Default_Price_Queue_Size    =1000000;
    int PriceArray_StartIndex       =0;
    int PriceArray_LastIndex        =999999;
    int PriceArray_MiddlePoint      =499999;
    int PriceArray_LatestData_Index =500000;
    int PriceArray_OldestData_Index =0;

    /**Price Array that holds data for Computation of Indicators*/
    Double[] PriceArray             = new Double[1000000];
    Double[] IndicatorValues_Array  = new Double[1000000];


    /**Functions that deal with Computation of Indicator Values */
    void Update_Prices_Array();
    void Fetch_Prices(int Start_Index , int End_Index);
    void Calculate_Indicator();
    void Store_Indicator_Values(int Bar_Index , Double Indicator_Value);


    /**Functions that are used to Display the Indicator */
    void Plot_Indicator();
    void Remove_Indicator();
    void Show_First_Plottable_Point();
    void Hide_Indicator();


    /**Functions that set Indicator Styling */
    void Change_IndicatorColour();
    void Change_IndicatorLineStyle();
    void Change_IndicatorLineThickness();





}
