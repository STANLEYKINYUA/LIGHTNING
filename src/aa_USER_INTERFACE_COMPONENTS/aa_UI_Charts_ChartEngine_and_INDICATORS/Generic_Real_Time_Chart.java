package aa_USER_INTERFACE_COMPONENTS.aa_UI_Charts_ChartEngine_and_INDICATORS;

/** Interface that deals with real time Charts */
public interface Generic_Real_Time_Chart
{
    /** This is called when new data is received and causes a bar to be repainted */
    void Repaint_Bar_on_new_Data();       //  Allows chart to be repainted each time a new data point arrives.

    /** This is called to paint a new bar */
    void Paint_New_Bar();

    /** Registers Custom Listeners with Data Library so that special events can be fired ie
     *      onBar
     *      onTick
     * */
    void Register_Listener_with_Data_Library();

    /** Used to create new Thread*/
    //TODO  Create a Multi - Threaded Architecture for Spawning Charts and updating awy from main thread.
    void Spawn_new_Thread();
}
