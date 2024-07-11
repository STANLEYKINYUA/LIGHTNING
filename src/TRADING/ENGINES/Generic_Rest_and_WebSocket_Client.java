package TRADING.ENGINES;

public interface Generic_Rest_and_WebSocket_Client
{
    // Connection Functions
    public void Connect();
    public void Disconnect();
    public void Reconnect();

    // API Limits and Other Limits
    public void Check_Api_Credits_Spent();
    public void Check_Api_Credits_Remaining();

    // Compute Hashes

    // Error Code Parser
    public void Determine_Error();

    //Market Data Functions

    //Trade Functions
    public void Open_Trade();
    public void Close_Trade();
}
