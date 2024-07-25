package TRADING.ENGINES.REST;

public class Rate_Limiter
{
    //Limits Variables.
    private int MaxAttempts_toGenerateApi_Keys_24hrs;
    private int Maximum_requests_perSecond;
    private int Maximum_requestRate_Opening_Closing_Positions;

    //Limits for Demo and Special Accounts
    private int Max_DemoAcc_RequestsPerHour;

    //Limits for different Api Activities
    private int Post_Requests_Limits;

    //Limits for Connection Duration
    private int RestSession_MaxInactivity_period;
    private int WebSocket_MaxInactivity_period;




    public Rate_Limiter()
    {

    }


    //Functions.





}
