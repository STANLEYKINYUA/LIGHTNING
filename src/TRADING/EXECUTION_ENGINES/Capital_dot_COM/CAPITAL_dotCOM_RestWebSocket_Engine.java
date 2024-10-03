package TRADING.EXECUTION_ENGINES.Capital_dot_COM;

import TRADING.EXECUTION_ENGINES.REST.REST_ENGINE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.sql.SQLOutput;
import java.net.URL;

public class CAPITAL_dotCOM_RestWebSocket_Engine extends REST_ENGINE
{
    //Venue URL
    String CDC_Rest_BASE_URL = " https://api-capital.backend-capital.com/";
    String CDC_Demo_Rest_BASE_URL = "https://demo-api-capital.backend-capital.com/";
    String CDC_Websocket_BASE_Url = "wss://api-streaming-capital.backend-capital.com/connect";

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


        //Authenticate Session Tokens
        try
        {
            String Endpoint = CDC_Demo_Rest_BASE_URL + "\session";

        }
        catch
        {}


        //todo use a try catch block and finally to disconnect


    }


    String Send_Post_Request(String Endpoint , String JSON_InputString) throws Exception
    {
        URL url = new URL(Endpoint);


    }



}
