package IO.DatabaseAccess;

public interface DataBaseAccess_Interface
{

    /**Checks whether MySQL is installed or not - if not Throws Exception*/
    void Check_if_MySQL_Installed();

    /**
     * Checks whether the Schema for Lightning Database is created
     */
    default boolean Check_if_Lightning_Schema_is_Created() {
        return false;
    }


    //Create a Database Schema
    void Create_Database_Schema(String Name_in_Lowercase);

    //Initialize Core Database Tables
    void Initialize_Core_Database();

    /**Open a Connection to the Database_Engine */
    void Create_Connection_to_Database();

    /** Close a Connection to the Database_Engine */
    void Close_Connection();

    /**Execute a SQL Statement */
    void Execute_SQL_Command(String SQL_Command);

    /** DATABASE ACTIONS*/
    String Read_From_Database();
    String Write_to_Database();

        //Create and Modify Actions
    void CreateTable(String SQL_Command, String Table_Name);
    void Add_Table_Columns(String Table_Name , String Column_Name , String Column_DataType);

        //Delete
    void DeleteTable(String SQL_Command,String Table_Name);

        //Data Manipulation
    void SortTable(String SQL_Command);
    void Execute_Query(String SQL_Command);

    void Commit_Changes();
    void Revert_Changes();

}
