package IO.DatabaseAccess;

public interface DataBaseAccess_Interface
{

    /**Checks whether MySQL is installed or not - if not Throws Exception*/
    void Check_if_MySQL_Installed();

    /**Check for Config File Presence */
    void Check_for_Config_File();

    /**Open a Connection to the Database */
    void Create_Connection();

    /** Close a Connection to the Database */
    void Close_Connection();

    /**Execute a SQL Statement */
    void Execute_SQL_Command(String SQL_Command);

    /** DATABASE ACTIONS*/
    String Read_From_Database();
    String Write_to_Database();
    void CreateTable(String SQL_Command);
    void DeleteTable(String SQL_Command);
    void SortTable(String SQL_Command);
    void Execute_Query(String SQL_Command);



    /**Commit Changes to Database */
    void Commit_Changes();

    /**Revert Changes */
    void Revert_Changes();

}
