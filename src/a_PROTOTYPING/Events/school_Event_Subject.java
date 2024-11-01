package a_PROTOTYPING.Events;



public class school_Event_Subject 
{
    
    public int number = 25;
    
    private EventListener listener;
    
    public void setEventListener(EventListener listener)
    {
        this.listener = listener;
    }
    
    public void Do_Something()
    {
        System.out.println("School is doing something");
        
        if(listener != null)
        {
            listener.onEvent("School has opened");
        }
    }
   
}
