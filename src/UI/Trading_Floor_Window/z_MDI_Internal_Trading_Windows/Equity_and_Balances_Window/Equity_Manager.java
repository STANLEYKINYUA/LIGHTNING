package UI.Trading_Floor_Window.z_MDI_Internal_Trading_Windows.Equity_and_Balances_Window;

public class Equity_Manager
{
    //Variables for Name,Venue

    //Venue1
    String Venue1_Name;
    Double Venue1_Equity;
    Double Venue1_Balance;
    int    Venue1_Leverage;
    String Venue1_ID;            // Describes the Actual Venue Connected ie  Binance1


    //V2
    String Venue2_Name;
    Double Venue2_Equity;
    Double Venue2_Balance;
    int    Venue2_Leverage;
    String Venue2_ID;           // Describes the Actual Venue Connected ie  Binance1

    //V3
    //V4
    //V5
    //V6
    //V7
    //V8
    //V9
    //V10




    //Functions that is used to update Equity Values
    public Double Fetch_Venue_Balance(String Venue_ID)
    {
        //Call Function that Fetches Data and Injects it into DBase
        Double Balance= 00.00;
        return Balance;
    };

    public Double Fetch_Venue_Account_Equity()
    {
        //Call functions to fetch the data and inject it into the Dbase
        Double Acc_Equity =0.00;
        return Acc_Equity;
    }

    public int Fetch_Venue_Account_Leverage()
    {
        int Leverage =0;
        return Leverage;
    }
}
