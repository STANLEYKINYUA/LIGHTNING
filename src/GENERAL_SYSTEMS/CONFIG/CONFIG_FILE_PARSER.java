package GENERAL_SYSTEMS.CONFIG;

/** Interface that contains Functions that are Implemented by Config Files. */
public interface CONFIG_FILE_PARSER
{
    //----------------------------------------------------------------------------
    // FUNCTIONS THAT CREATE , MODIFY , DELETE GENERAL_SYSTEMS.CONFIG FILES

    /** Checks if the File exists  */
    void Check_if_File_Exists();

    /** Check if the Folder exists */
    void Check_if_Folder_Exists(String Folder_Adress , String Folder_Name);

    /** Create Config Files*/
    void Create_Config_File(String File_Adress , String File_Name);

    /** Delete Config Files */
    void Delete_Config_File(String File_Adress , String File_Name);

    /** Modify Config File name */
    void Modify_Config_File(String Old_Name , String New_Name);
    //----------------------------------------------------------------------------


    //----------------------------------------------------------------------------
    // FUNCTIONS THAT READ / WRITE GENERAL_SYSTEMS.CONFIG FILES
    /** Reads Config File From File and Loads it into Memory*/
    void Read_from_Config_File();

    /** Write Data to Config File*/
    void Write_to_Config_File();
    //----------------------------------------------------------------------------


    //----------------------------------------------------------------------------
    // FUNCTIONS TO PARSE GENERAL_SYSTEMS.CONFIG FILES.
    /** Parse Config Files and  */

    void Search_Tag(String Tag);
    void Read_Tag_Value();
    void Create_Tag(String Tag);

    //----------------------------------------------------------------------------





}
