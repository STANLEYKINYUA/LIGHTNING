package IO.DatabaseAccess;

public class Database
{
    //Variables
    private boolean MySQL_Installed = false;

    //Constructor for Class Database
    public Database()
    {
        //When it starts : Check if MySQL is Installed
        Check_if_MySQL_Installed();




    }


    //Connecting to the Database
    private void Check_if_MySQL_Installed()
    {
        if(!MySQL_Installed)
        {
            //Throw an error that MySQL is not installed
        }

    }

    //Connecting to the Database
    private void Connect_to_DataBase(String UserName , String Password)
    {

    }
    private void Disconnect_from_The_Database()
    {

    }

    //Performing Actions with the Database
    public void Execute_SQL_Command(String SQL_Command)
    {

    }

    /* Database Actions */

    void DeleteTable( String Name_of_Table_to_Delete) {}

    void CreateMarketData_Table
            (String Symbol,String Period ){}

    void Delete_Row_From_Table()
    {}

}
