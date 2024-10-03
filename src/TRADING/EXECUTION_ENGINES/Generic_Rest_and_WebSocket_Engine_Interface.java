package TRADING.EXECUTION_ENGINES;

public interface Generic_Rest_and_WebSocket_Engine_Interface
{
    // Connection Functions
    public void Connect();
    public void Disconnect();
    public void Reconnect();

    //WebSocket Functions
    public void Connect_WebSocket();
    public void Disconnect_WebSocket();


    // Select Session Type
    public void Start_Session_asDEMO();
    public void Start_Session_asLIVE();

    //Session Maintenance Functions
    public void Ping_EndPoint();

    //Read API Key from Secure Config File
    public void SelectConfigFile_Location();
    public void Read_Api_Key();
    public void Decrypt_Api_Key();
    public void Read_Secret();

    // API Limits and Other Limits
    public void set_Limit();


    // Compute Hashes

    // Error Code Parser
    public void Determine_Error();

    //Market Data Functions
    public void Fetch_Bars();

    //StartUp Activities
    public void Read_Settings_From_File();


    //Trade Functions
    public void Open_Trade();
    public void Close_Trade();
    public void Fetch_List_of_OpenTrades();
}
