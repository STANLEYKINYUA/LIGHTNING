package TRADING.Apis_and_SDKs.Dukascopy_Engine;


import com.dukascopy.api.system.ClientFactory;
import com.dukascopy.api.system.IClient;
import com.github.weisj.jsvg.nodes.Use;

public class Dukascopy_Engine
{
    public Dukascopy_Engine(String UsrName , String Passwrd) throws Exception {

        //Fetch the User Name and the Password
        String UserName = UsrName;
        String Password = Passwrd;
        final String JNLP_URL = "https://www.dukascopy.com/client/demo/jclient/jforex.jnlp";


        //Wait Times
        int Connection_Wait_time = 10;
        int Max_Reconnection_Attempts = 5;
        int Reconnect_after_Time_Seconds = 10;

        //Instantiate a new Dukas Client
        Dukascopy_Client CLIENT = new Dukascopy_Client(UserName,Password,JNLP_URL);


    }
}
