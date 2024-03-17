package INPUT_OUTPUT;

public interface File_Accessor
{
    void Test_if_File_Exists();
    void Test_if_Directory_Exists();

    void Create_File(String FileName , String  File_Location);
    void Create_Directory(String DirectoryName, String Directory_Location);

    void Open_File();
    void Test_if_File_is_Writeable();

    void Write_to_File(String Message_to_Write);

}
