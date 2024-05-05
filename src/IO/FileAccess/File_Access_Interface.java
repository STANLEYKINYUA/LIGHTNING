package IO.FileAccess;

public interface File_Access_Interface
{
    void Check_if_File_Exists();
    void Check_if_Directory_Exists();

    void Create_File(String FileName , String  File_Location);
    void Create_Directory(String DirectoryName, String Directory_Location);

    void Open_File(String FileName , String File_Directory);
    void Test_if_File_is_Writeable();

    void Write_to_File(String Message_to_Write);

}
