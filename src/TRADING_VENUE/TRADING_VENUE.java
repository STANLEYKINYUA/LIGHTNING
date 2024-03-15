package TRADING_VENUE;

public interface TRADING_VENUE
{
    //TODO      Create more Functions in Trading Venue Interface and Flesh them out.


    void Connect_to_Trading_Venue();        //Connect to Trading Venue
    void Disconnect_From_Trading_Venue();   //Disconnect From Trading Venue
    void Unable_to_Connect();
    void Connected_Successfully();
    void Test_Connection();
    void Send_HeartBeat();
    void Has_Disconnected();
    void Has_Reconnected();



    void Request_Market_Data();
    void Halt_Market_Data();
    void Fetch_Historical_Market_Data(String Symbol , String Date_From , String Date_To);



    void Open_Trade(String Position_Label , Double Position_Size);      // Open a Trade in this Trading Venue
    void Close_Trade(String Position_Label , Double Position_Size);    //  Close Trade in this Trading Venue.
    String Fetch_All_Open_Positions();
    String Fetch_Commission_for_position(String Position_Label);
    String Fetch_Entry_Price(String Position_Label);



}
