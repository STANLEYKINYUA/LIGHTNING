package TRADING.Apis_Sdks_Rest_Fix_DataEngines.RESTFUL_EXECUTION_ENGINES;

public interface RateLimiter_Interface
{

    //Time Keeping Interface
    void Start_Timer(int Time_in_Seconds);
    void Restart_Timer();

    //Requests Tracking
    void Record_last_Request();
    void update_Request_Counter();
    void clear_request_Counter();

    //

}
