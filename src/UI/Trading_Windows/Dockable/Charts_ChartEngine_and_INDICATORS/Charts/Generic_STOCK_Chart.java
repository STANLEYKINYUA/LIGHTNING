package UI.Trading_Windows.Dockable.Charts_ChartEngine_and_INDICATORS.Charts;

/** This Interface stores Functions related to all Stock Charts_and_Objects : CandleStick , Renko , Range , Tick etc */
public interface Generic_STOCK_Chart
{

    /** Set the Scale for the X,Y Axis. */
    void Set_X_Axis_Scale();
    void Set_Y_Axis_Scale();

    /** Sets the Color of the X,Y Axis Component Colors */
    void Set_X_Axis_Components_Color();
    void Set_Y_Axis_Components_Color();


    //Drawing Functions.
    void Paint_on_Chart_Creation();
    void Plot_Symbol_Event_on_Chart();
    void Set_Chart_Events_Marker_Color();

    void Set_Chart_Events_Time_Marker_Plot();
    void Chart_Items_Set_Color();   //  Color of renkos/candles/etc


    //Plotting & Display Functions.
    void Plot_Chart_Border();
    void Set_Chart_Border_Color();

    void Chart_Grid_Plot();
    void Set_Chart_Grid_Color();
    void Set_Chart_Grid_Style();
    void Chart_Grid_Hide();



    void Open_Position_Marker_Plot();
    void Set_Open_Position_Marker_Color();
    void Open_Position_Marker_Hide();

    void Stop_Loss_Marker_Plot();
    void Set_Stop_Loss_Marker_Color();
    void Stop_Loss_Marker_Hide();





    // Chart Separators.
    void Chart_Day_Separator_Plot();
    void Set_Day_Separator_Color();

    void Chart_Week_Separator_Plot();
    void Set_Week_Separator_Color();

    void Chart_2Week_Separator_Plot();
    void Set_2Week_Separator_Color();

    void Chart_Month_Separator_Plot();
    void Set_Month_Separator_Color();

    void Chart_2Month_Separator_Plot();
    void Set_2Month_Separator_Color();

    void Chart_3Month_Separator_Plot();
    void Set_3Month_Separator_Color();

    void Chart_4Month_Separator_Plot();
    void Set_4Month_Separator_Color();

    void Chart_6Month_Separator_Plot();
    void Set_6Month_Separator_Color();

    void Chart_Year_Separator_Plot();
    void Set_Year_Separator_Color();

    void Chart_2Year_Separator_Plot();
    void Set_2Year_Separator_Color();



    //Alert Settings.
    void Display_Alert_on_Chart();
    void Flash_Entire_Chart();
    void Set_Chart_Flash_Color();

    //WorkSpace Settings.
    void Store_all_Chart_settings();
    void Update_Chart_setting(String Setting , String Value);
    void Send_Chart_Settings_to_Workspace_Manager();
    void Request_Chart_Settings_From_Workspace_Manager();



}
