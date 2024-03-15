package CONFIG;

public interface XML_CONFIG_FILE_PARSER
{

    void WriteXML_to_Config_File(String File_Adress,String FileName , String Message);
    void ReadXML_from_Config_File(String File_Adress, String FileName);


    void Create_XML_File(String File_Adress , String File_Name);

    void Check_if_File_Exists(String File_Adress , String File_Name);

}
