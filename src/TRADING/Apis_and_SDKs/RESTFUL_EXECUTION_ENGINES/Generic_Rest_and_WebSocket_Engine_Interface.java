package TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES;

public interface Generic_Rest_and_WebSocket_Engine_Interface
{


    //Fetch API Key from Secure Config File


    public String Read_Api_Key_from_System_Environment(String KeyName);
    public String Read_Api_Password_from_System_Environment(String PasswordNAME);

    // Connection Functions
    public void Connect_with_Password();
    public void Connect_with_EncryptedPASSWORD();
    public void Disconnect();
    public void Reconnect();

    //Session Maintenance
    public void Ping_Rest_EndPoint();
    public void Ping_WebSocket_EndPoint();


    //WebSocket Functions
    public void Connect_WebSocket();
    public void Disconnect_WebSocket();


    // Select Session Type
    public void Start_Session_asDEMO();
    public void Start_Session_asLIVE();



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
