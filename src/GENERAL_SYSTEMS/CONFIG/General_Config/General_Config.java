package GENERAL_SYSTEMS.CONFIG.General_Config;

import com.jidesoft.range.CategoryRange;

import java.io.File;
import java.util.HashMap;

//General Configuration Manager that handles core System Functions
public class General_Config
{
    private final String General_Config_FilePATH = "C:\\LIGHTNING";
    private final String General_Config_FileName = "General_Config";
    private final String General_Config_Absolute_FileName = "C:\\LIGHTNING\\General_Config.txt";

    private boolean is_First_Run;

    private final String Encryption_Key = "Ns@V(6!<vasb24{_31a5nu33eq385##T%%&QWE321as3d5as";


    //System Parametres


    long  JVM_HeapSize;
    String JVM_Version = " ";

    String Operating_System = " ";
    String OS_version = " ";

    int System_CPU_Cores;
    long System_Ram;
    String System_Screen_Size;









    //Constructor
    public General_Config()
    {
        File General_Config_File = new File(General_Config_Absolute_FileName);

        //Test for First Run
        is_First_Run = General_Config_File.exists();



        //If it does not exist : Create A General Config File
        if(is_First_Run == false)
        {
            //Is the First Run so Create the General Config File
            System.out.println("First Run detected - No previous Config Files");
            System.out.println("CREATING FIRST CONFIG FILE");
            Create_General_Config_File();

        }
        else
        {
            //Is not the First Run so just Read the General Config File
            System.out.println(" Config File Detected ");

            //Read Config File Parametres


        }

    }


    public void Create_General_Config_File()
    {
        //Create the File

        try
        {
            //Create the Folder
            File Config_Folder = new File(General_Config_FilePATH);
            Config_Folder.mkdir();

            //Create the File
            File Config_File = new File(General_Config_Absolute_FileName);
            Config_File.createNewFile();

            System.out.println("--------------------------------------------");
            System.out.println("Created General Config File");

            //Read System Parametres and Write to the File
                // OS Version
                // CPU Cores + Cpu Speed + Ram
                // JVM Version + Heap Size
                // Drive C - Available Storage

        }
        catch (Exception Create_General_Config_Exception)
        {
            //Output
            Create_General_Config_Exception.printStackTrace();
        }

    }

    //Read the General Configuration File
    public void Read_General_Config_File()
    {
        try
        {
            //Read all the Contents of the Config File into a Hashmap
            HashMap <String , String> Config_HashMap = new HashMap<>();





        }
        catch(Exception Read_Config_File_Exception)
        {

        }

    }

    private void Read_Users_File()
    {

        //If no Users - Create Users File

    }

    private void Create_Users_File()
    {
        //Create a Config File for Users
        //Create a Folder for Each User
    }

    public void Add_New_User()
    {

    }

    public void Create_User_Folder()
    {

    }
    private void Encrypt_Users_File()
    {

    }

    private void Decrypt_Users_File()
    {

    }

    //Passwords and Usernames Manipulation
    private void Generate_SHA256_Password_Hash(String Password , String Hash_Key)
    {

    }

    private void Encrypt_UserName(String UserName, String Key)
    {

    }

    private void Decrypt_UseName(String UserName_Hash , String Key)
    {

    }



}
