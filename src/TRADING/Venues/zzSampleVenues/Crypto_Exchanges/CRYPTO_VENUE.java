package TRADING.Venues.zzSampleVenues.Crypto_Exchanges;

public interface CRYPTO_VENUE
{
    //Functions related to Crypto TRADING.Venues.

    //--------------------------------------------------------------------------
    //Functions related to Connections.

    void Connect_to_Venue(String API_Key , String Secret_Key);
    void Connect_to_Venue(String API_Key, String Secret_Key , String User_Name);

    void Disconnected();
    void Attempt_Reconnection();

    void Reconnected_Successfully();
    void Reconnection_Sequence();

    void Send_Heart_Beat();

    void Close_Connection_Sequence();
    void Close_Connection();
    //--------------------------------------------------------------------------


    //--------------------------------------------------------------------------
    //Functions related to API.

    void Check_if_API_CALL_Limit_Crossed();
    void API_Call_Limit_Exceeded();

    void Check_API_Permissions();
    void Set_Permissions();
    //--------------------------------------------------------------------------


    //--------------------------------------------------------------------------
    //Functions related to Market Data.

            // Market Depth
    void request_market_data_From_Rest();
    void request_continuous_market_data_Feed_From_WebSocket();
    void Halt_continuous_market_data_Feed_From_WebSocket();

            //Market Depth
    void request_continuous_market_depth_Feed_From_WebSocket();
    void Halt_continuous_market_depth_Feed_From_WebSocket();

            //Specific Details
    Double request_Specific_Coin_Latest_Price(String Symbol);
    //--------------------------------------------------------------------------


    //--------------------------------------------------------------------------
    //Functions related to Account

    Double request_Account_Equity_Balance();
    Double request_Coin_Specific_Balance(String Coin_Name);

    //--------------------------------------------------------------------------

    //--------------------------------------------------------------------------
    //Functions related to Trading.

    void Open_Long_Trade(String Symbol , Double Trade_Size , String Label);
    void Open_Short_Trade(String Symbol , Double Trade_Size, String Label);

    void Close_Position(String Label , Double Quantity_to_Close);

    //--------------------------------------------------------------------------

    //--------------------------------------------------------------------------
    //Functions related to Trading Platform Data.

    void Update_Account_Balance_on_Trading_Platform();
    void Update_Positions_Displayed_on_Trading_Platform();

    void Update_Connection_Status();

    //--------------------------------------------------------------------------


    //--------------------------------------------------------------------------
    // Functions related to Notifications.

    void Notify_Venue_Disconnected();
    void Notify_Venue_Reconnected();

    void Notify_Position_Opened();
    void Notify_Position_Closed();

    void Notify_Profits_Made();
    void Notify_Loss_Made();


    //--------------------------------------------------------------------------


}
