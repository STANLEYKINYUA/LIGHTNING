package TRADING.MARKET_DATA_FEEDS.Data_Parsers;

public interface Parser
{
     Double Highest_Tick = 0.0;
     Double Lowest_Tick  = 0.0;

     Double Open_Tick = 0.0;
     Double Close_Tick = 0.0;

     String Open_Time = " ";
     String Close_Time = " ";


     //Market Data Handling
    void Read_Market_Data_File_to_Memory();
    void Read_Next_Tick();


    //High - Low parsing
    public void Check_if_High();
    public void Check_if_Low();

    //Open and Close Price
    public void Set_OpenPrice();
    public void Set_ClosePrice();

    //Open and Close Time
    public String Get_OpenTime();
    public String Get_CloseTime();
}
