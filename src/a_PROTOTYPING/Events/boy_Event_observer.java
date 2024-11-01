package a_PROTOTYPING.Events;

import javax.security.auth.Subject;

public class boy_Event_observer implements EventListener
{
    
    boolean is_School_open ;
    private school_Event_Subject school;
    
    public boy_Event_observer(school_Event_Subject school)
    {
        this.school = school;
        this.school.setEventListener(this);
        
        
    }

    
    public void Respond_to_Event()
    {
        System.out.println("Boy is responding to School");
        int number_from_school = school.number;

        System.out.println("Boy has read Number from School = " + number_from_school);
    }

    @Override
    public void onEvent(String Message) 
    {
        System.out.println("Boy has noticed that school is doing something");
        
        
        Respond_to_Event();
        
    }
}
