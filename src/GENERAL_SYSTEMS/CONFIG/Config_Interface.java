package GENERAL_SYSTEMS.CONFIG;

public interface Config_Interface
{
    String Config_File_Adress = " ";


    //Write Functions
    public void Write_to_File(String FileName);

    //Read Functions
    public void Read_to_Memory(String FileName);

    //Edit Functions
    public void Edit_Config_Value(String Parametre , String Value);

    //Set Config File Adress
    public void Set_Config_File_Adress(String New_Adress);

}
