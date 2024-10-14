package IO.DatabaseAccess;

public class Database_Engine implements DataBaseAccess_Interface
{
    //Variables
    private boolean MySQL_Installed = false;


    public Database_Engine()
    {

    }

    /**
     * Checks whether MySQL is installed or not - if not Throws Exception
     */
    @Override
    public void Check_if_MySQL_Installed() {

    }

    /**
     * Check for Config File Presence
     */
    @Override
    public void Check_for_Config_File() {

    }

    /**
     * Open a Connection to the Database_Engine
     */
    @Override
    public void Create_Connection_to_Database() {

    }

    /**
     * Close a Connection to the Database_Engine
     */
    @Override
    public void Close_Connection() {

    }

    /**
     * Execute a SQL Statement
     *
     * @param SQL_Command
     */
    @Override
    public void Execute_SQL_Command(String SQL_Command) {

    }

    /**
     * DATABASE ACTIONS
     */
    @Override
    public String Read_From_Database() {
        return "";
    }

    @Override
    public String Write_to_Database() {
        return "";
    }

    @Override
    public void CreateTable(String SQL_Command, String Table_Name) {

    }

    @Override
    public void Add_Table_Columns(String Table_Name, String Column_Name, String Column_DataType) {

    }

    @Override
    public void DeleteTable(String SQL_Command, String Table_Name) {

    }

    @Override
    public void SortTable(String SQL_Command) {

    }

    @Override
    public void Execute_Query(String SQL_Command) {

    }

    @Override
    public void Commit_Changes() {

    }

    @Override
    public void Revert_Changes() {

    }
}
