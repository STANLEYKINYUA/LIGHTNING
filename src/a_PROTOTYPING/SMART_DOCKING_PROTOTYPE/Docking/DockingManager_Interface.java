package a_PROTOTYPING.SMART_DOCKING_PROTOTYPE.Docking;

public interface DockingManager_Interface
{

    /** The Functions are used to Dock in the Docking Manager on the Global Surface instead of inside other Components*/
    void Dock_GlobalNorth();
    void Dock_GlobalSouth();
    void Dock_GlobalEast();
    void Dock_GlobalWest();
    void Dock_GlobalCENTRE();

    /** These Functions are used to dock inside another component */
    void Dock_North();
    void Dock_South();
    void Dock_East();
    void Dock_West();
    void Dock_Centre();
    void Dock_Folded();     //Dock into the Centre of a Component and Fold into a sort of tabbed pane

    /** These Functions are used to detect */
}
