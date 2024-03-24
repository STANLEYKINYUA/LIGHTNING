package NOTIFICATIONS_SYSTEM.Pop_Up_Notifications;

/** Pop UP interface is used to declare functions that pop up messages will Call*/
public interface POP_UP_Interface
{

    /** Display the Popup notification window*/
    void Show_Pop_up(int x , int y);

    /** Registers the PopUp Window with the PopUp manager*/
    void Register_PopUp_Window();
}
