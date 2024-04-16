package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.Charts.Charts;

/**  Interface that must be implemented by all XY Charts*/
public interface Generic_XY_Chart_Interface
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
    public void Draw_Indicator_Window();





}
