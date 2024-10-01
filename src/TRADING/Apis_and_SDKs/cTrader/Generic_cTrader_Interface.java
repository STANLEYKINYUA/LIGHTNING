package TRADING.Apis_and_SDKs.cTrader;

public interface Generic_cTrader_Interface
{

    //Network Functions
    void Display_Connection_Point();
    private String Get_my_IP() {
        String Ip_Adress;
        Ip_Adress = "";
        return Ip_Adress ;
    }
    private int Get_Connection_Latency(){
        int Latency;
        Latency = 00;

        return Latency;
    }

    void Accept_cTrader_Connection();
    void Close_cTrader_Connection();



    //Symbology
    String Fetch_List_of_Instrument_Symbols();

    //Account Data
    double Fetch_Account_Equity();
    int    Fetch_Account_Leverage();

    //Trading Functions
    void Open_Position(char Direction,double Volume,String Label);
    void Close_Position(String Label , int Percentage_to_Close);

    //Market Data Parsing Functions
    void Parse_Bid_Ask_Prices();
    void Compute_Spread();
    void Parse_MarketDepth();
    void Parse_News();




}
