package TRADING.Apis_and_SDKs.cTrader;

public class CTrader_Server_Node implements Generic_cTrader_Interface{


    CTrader_Server_Node()
    {
        //Create a Server and bind it to a specific port to listen
    }


    @Override
    public void Display_Connection_Point() {

    }

    @Override
    public void Accept_cTrader_Connection() {

    }

    @Override
    public void Close_cTrader_Connection() {

    }

    @Override
    public String Fetch_List_of_Instrument_Symbols() {
        return "";
    }

    @Override
    public double Fetch_Account_Equity() {
        return 0;
    }

    @Override
    public int Fetch_Account_Leverage() {
        return 0;
    }

    @Override
    public void Open_Position(char Direction, double Volume, String Label) {

    }

    @Override
    public void Close_Position(String Label, int Percentage_to_Close) {

    }

    @Override
    public void Parse_Bid_Ask_Prices() {

    }

    @Override
    public void Compute_Spread() {

    }

    @Override
    public void Parse_MarketDepth() {

    }

    @Override
    public void Parse_News() {

    }
}
