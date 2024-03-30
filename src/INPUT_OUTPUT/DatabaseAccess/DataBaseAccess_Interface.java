package INPUT_OUTPUT.DatabaseAccess;

public interface DataBaseAccess_Interface
{

    /**Checks whether MySQL is installed or not - if not Throws Exception*/
    void Check_if_MySQL_Installed();

    /**Check for Config File Presence */
    void Check_for_Config_File();
}
