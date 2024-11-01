package a_PROTOTYPING.Events;

public class Main 
{
    public static void main(String args[])
    {
        System.out.println("Started !!!");
        
       
        school_Event_Subject school = new school_Event_Subject();
        boy_Event_observer boy = new boy_Event_observer(school);
        
        school.Do_Something();
    }
}
