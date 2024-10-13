package GENERAL_SYSTEMS.CONFIG.General_Config;

import com.jidesoft.range.CategoryRange;

import java.io.File;

//General Configuration Manager that handles core System Functions
public class General_Config
{
    private final String General_Config_FilePATH = "C:\\LIGHTNING";
    private final String General_Config_FileName = "General_Config";
    private final String General_Config_Absolute_FileName = "C:\\LIGHTNING\\General_Config.txt";

    private boolean is_First_Run;

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
        }
        catch (Exception Create_General_Config_Exception)
        {
            //Output
            Create_General_Config_Exception.printStackTrace();
        }

    }




}
