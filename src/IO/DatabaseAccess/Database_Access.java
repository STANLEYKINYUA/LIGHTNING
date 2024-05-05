package IO.DatabaseAccess;

public class Database_Access implements DataBaseAccess_Interface {

    @Override
    public void Check_if_MySQL_Installed() {

    }


    @Override
    public void Check_for_Config_File() {

    }

    /**
     * Open a Connection to the Database
     */
    @Override
    public void Create_Connection() {

    }

    /**
     * Close a Connection to the Database
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
        return null;
    }

    /**
     * @return
     */
    @Override
    public String Write_to_Database() {
        return null;
    }

    /**
     * @param SQL_Command
     */
    @Override
    public void CreateTable(String SQL_Command) {

    }

    /**
     * @param SQL_Command
     */
    @Override
    public void DeleteTable(String SQL_Command) {

    }

    /**
     * @param SQL_Command
     */
    @Override
    public void SortTable(String SQL_Command) {

    }

    /**
     * @param SQL_Command
     */
    @Override
    public void Execute_Query(String SQL_Command) {

    }

    /**
     * Commit Changes to Database
     */
    @Override
    public void Commit_Changes() {

    }

    /**
     * Revert Changes
     */
    @Override
    public void Revert_Changes() {

    }
}
