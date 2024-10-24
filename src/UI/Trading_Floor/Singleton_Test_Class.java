package UI.Trading_Floor;

public class Singleton_Test_Class
{

    //A private and static instance of our class
    private static Singleton_Test_Class instance;

    //private constructor to prevent instantiation from outside the Class
    private Singleton_Test_Class()
    {

    }

    //public static method to provide Access to the Instance
    public static Singleton_Test_Class getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton_Test_Class();
        }

        return instance;


    }

    //Sample methods to show Functionality
    public void Call()
    {
        System.out.println("I have been called");
    }

    public void Accept()
    {
        System.out.println("I have accepted");
    }

}
