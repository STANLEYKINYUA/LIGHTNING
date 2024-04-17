package aa_UI.Trading_Windows.Dockable.Charts_and_Objects.Charts;

/**  Interface that must be implemented by all XY Charts_and_Objects*/
public interface _Generic_XY_Chart_Interface
{

    /** Functions that affect Chart View */
    public void Pan();
    public void Zoom();

    /** Functions Associated with Parsing bars */
    void Parse_Bars();
    void Feed_Bars_into_Data_Manager();
    void Read_Bars_From_Data_Manager();


    /** Functions Associated with Plotting the Chart */
    public void Plot_Chart();
    public void ReDraw_Chart();
    public void Update_Chart();

    public void Set_X_Axis_Scale();
    public void Set_Y_Axis_Scale();

    /** Functions Associated with the Display of Indicators */
    public void Plot_MovingAverage(String MA_type, int MA_Periods);
    public void Plot_BollingerBands(int Periods);

    /**Functions Associated with the Plotting of useful objects on the Chart */
    public void Plot_Indicator();
    public void Plot_Text();
    public void Draw_Period_Seperators();
    public void Draw_Events_CalendarPoints();


    /**Functions associated with the Drawing of Chart Objects like Shapes and text */
    public void Plot_Object();

    /** Functions Associated with Colours */
    public void Set_BackGround_Color();
    public void Set_ForeGround_Color();
    public void Set_PositiveBar_Color();
    public void Set_NegativeBar_Color();
    public void Set_Bar_Opacity();
    public void Set_DojiBar_Color();

    /** Functions that draw Windows that are Useful */
    public void Draw_ColorPicker_Window();
    public void Draw_Order_Window();
    public void Draw_ChartObjects_Window();     //  Window to Manipulate Indicators and other Chart Objects
    public void Draw_MarketDepth_Window();





}
