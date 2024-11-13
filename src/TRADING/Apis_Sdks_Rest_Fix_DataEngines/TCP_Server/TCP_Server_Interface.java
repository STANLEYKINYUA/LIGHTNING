package TRADING.Apis_Sdks_Rest_Fix_DataEngines.TCP_Server;

public interface TCP_Server_Interface 
{

    //Network Connection
    void Accept_Connection();
    void Close_Connection(); 
    
    //Threading Functionality
    void Spawn_new_Runnable_Thread();
    
    
}
