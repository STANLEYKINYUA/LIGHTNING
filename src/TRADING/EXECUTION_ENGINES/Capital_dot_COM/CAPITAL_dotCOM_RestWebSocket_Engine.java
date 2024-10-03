package TRADING.EXECUTION_ENGINES.Capital_dot_COM;

import TRADING.EXECUTION_ENGINES.REST.REST_ENGINE;
import okhttp3.*;

import java.io.IOException;
import java.sql.SQLOutput;

public class CAPITAL_dotCOM_RestWebSocket_Engine extends REST_ENGINE
{
    //Venue URL
    String CDC_Rest_URL = " https://api-capital.backend-capital.com/";
    String CDC_Demo_Rest_URL = "https://demo-api-capital.backend-capital.com/";
    String CDC_Websocket_Url = "wss://api-streaming-capital.backend-capital.com/connect";

    //Credentials
    String API_Key = "EIYbFsrNmWGMwqHV";
    String My_Password = "n@TASHA10896";
    String Encrypted_API_Password = " ";
    String My_Email = "Stanley.andrew.kinyua@gmail.com";

    public CAPITAL_dotCOM_RestWebSocket_Engine()
    {
        //Set Special Venue unique Features
        this.VenueName = "CAPITAL.com";
        this.API_Password_Environment_Name = "CAPITAL_DOT_COM_PASSWORD";
        this.API_Key_Environment_Name = "CAPITAL_DOT_COM_API_KEY";

        System.out.println(" ");
        System.out.println("CAPITAL.com CALLED");





        //todo use a try catch block and finally to disconnect


    }



}
