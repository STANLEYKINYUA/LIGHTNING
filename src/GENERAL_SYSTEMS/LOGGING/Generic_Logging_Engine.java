package GENERAL_SYSTEMS.LOGGING;

public interface Generic_Logging_Engine
{
    /*  TODO  Create a Logging Object that has access to Log Files and Log messages are sent and queued in this object
      being written to File

    * */




    //-----------------------------------------------------------
    //Functions that test for File Existence and whether File is Writeable.

    char Does_Log_File_Exist(String LogDirectory_Address , String LogFile_Name);
    char Is_Log_File_Writable(String LogDirectory_Address , String LogFile_Name);
    //-----------------------------------------------------------


    //-----------------------------------------------------------
    //Date and Time Functions
    String get_Date_Today();
    String get_exact_Time();
    //-----------------------------------------------------------


    //-----------------------------------------------------------
    //  TODO    Create Functions that Access Log Queue Objects and enqueue Messages
    //-----------------------------------------------------------

    //-----------------------------------------------------------
    //  Functions that Handle Writing to Files.

    void Log_to_Specific_Log(String Specific_Log_FileName , String LogMessage);
    void Log_to_General_Log(String LogMessage);
    //-----------------------------------------------------------

    //-----------------------------------------------------------
    //LOGGING MESSAGES

    void Action_Failed_with_Message(String LogMessage);

    void Log_Connection();
    void Log_Disconnect();
    void Log_Reconnect();


    //-----------------------------------------------------------

}
