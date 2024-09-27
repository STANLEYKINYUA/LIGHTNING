package TRADING.Apis_and_SDKs.Dukascopy_Engine;


import com.dukascopy.api.system.ClientFactory;
import com.dukascopy.api.system.IClient;
import com.github.weisj.jsvg.nodes.Use;

public class Dukascopy_Engine
{
    public Dukascopy_Engine(String UsrName , String Passwrd) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //Fetch the User Name and the Password
        final String  jnlpURL = "https://www.dukascopy.com/client/demo/jclient/jforex.jnlp";
        String UserName = UsrName;
        String Password = Passwrd;

        //Wait Times
        int Connection_Wait_time = 10;
        int Max_Reconnection_Attempts = 5;
        int Reconnect_after_Time_Seconds = 10;

        //Connect to Dukascopy
        IClient CLIENT = ClientFactory.getDefaultInstance();

        try
        {
            //Connect to Dukascopy Servers
            CLIENT.connect(jnlpURL, UserName,Password);

            //todo Sleep this thread for 10 Seconds for the System to Connect

            //Client is not connected
            if(!CLIENT.isConnected())
            {
                System.err.println("Failed to connect to Dukascopy");

            }else
            {

            }

            //

        }
        catch(Exception Dukascopy_exception)
        {
            Dukascopy_exception.printStackTrace();

        }
        finally
        {
            //Disconnect from Dukascopy when we are Done
            CLIENT.disconnect();
        }


    }
}
