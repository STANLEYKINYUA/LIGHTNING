package TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES;

public interface Generic_Rest_and_WebSocket_Engine_Interface
{




    public String Read_Api_Key_from_DataBase();
    public String Read_Api_Password_Database();
    public String Read_Email_from_Database();

    // Select Session Type
    public void Start_Session_asDEMO();
    public void Start_Session_asLIVE();

    // Connection Functions
    public void Connect_with_Password();
    public void Connect_with_EncryptedPASSWORD();
    public void Disconnect();
    public void Reconnect();



    //Session Maintenance
    public void Create_Rest_Session();
    public void Create_Web_Socket_Session();
    public void Ping_Rest_EndPoint();
    public void Ping_WebSocket_EndPoint();


    //WebSocket Functions
    public void Connect_WebSocket();
    public void Disconnect_WebSocket();


    // Error Code Parser
    public void Parse_Error();

    void Determine_Error();

    //Market Data Functions
    public void Fetch_Bars();

    void Read_Settings_From_File();

    //Trade Functions
    public void Open_Trade();
    public void Close_Trade();
    public void Fetch_List_of_OpenTrades();


}
