package aa_USER_INTERFACE_COMPONENTS.Core_UI_Classes.Trading_and_Trading_WorkFlow_Windows.Dockable.Charts;

/**  Interface that must be implemented by all XY Charts*/
public interface Generic_XY_Chart_Interface
{

    /** Functions that affect Chart View */
    public void Pan();
    public void Zoom();

    /** Functions Associated with Plotting the Chart */
    public void Plot_Chart();
    public void Update_Chart();

    public void Set_X_Axis_Scale();
    public void Set_Y_Axis_Scale();

    /** Functions Associated with the Display of Indicators */
    public void Plot_Indicator();




}
