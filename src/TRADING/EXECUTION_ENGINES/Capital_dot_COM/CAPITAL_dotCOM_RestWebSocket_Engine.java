package TRADING.EXECUTION_ENGINES.Capital_dot_COM;

import TRADING.EXECUTION_ENGINES.REST.REST_ENGINE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
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

    public CAPITAL_dotCOM_RestWebSocket_Engine() {
        //Set Special Venue unique Features
        this.VenueName = "CAPITAL.com";
        this.API_Password_Environment_Name = "CAPITAL_DOT_COM_PASSWORD";
        this.API_Key_Environment_Name = "CAPITAL_DOT_COM_API_KEY";

        System.out.println(" ");
        System.out.println("CAPITAL.com CALLED");

        String jsonInputString = String.format("{\"identifier\": \"%s\", \"password\": \"%s\"}", My_Email, My_Password);

        //Authenticate Session Tokens
        try {
            //Send Post Request
            System.out.println("Attempting to connect to Capital.com");
            String EndPoint = CDC_Demo_Rest_BASE_URL + "/session";

            System.out.println("Awaiting Server Response");
            String Session_Response = Send_Post_Request(EndPoint, jsonInputString);
            System.out.println("Session Response : " + Session_Response);


        } catch (Exception e) {
            throw new RuntimeException(e);

        }


        //todo use a try catch block and finally to disconnect


    }


    String Send_Post_Request(String Endpoint, String JSON_InputString) throws Exception
    {
        URL url = new URL(Endpoint);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");

        conn.setRequestProperty("Content-Type", "application/json");

        conn.setRequestProperty("X-CAP-API-KEY", API_Key);
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = JSON_InputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        //Fetch and Output the Response code
        int status = conn.getResponseCode();

            if(status == HttpURLConnection.HTTP_OK) // Code 200
            {
                System.out.println("200 - Connection Successful");
                return readResponse(conn);
            }
            else if (status == HttpURLConnection.HTTP_BAD_REQUEST)
            {
                System.out.println(" 400 - Malformed Request");

            }

        return readResponse(conn);
        }

        private static String readResponse(HttpURLConnection conn) throws Exception
        {
            String RESPONSE=" ";
            try
            {
                BufferedReader buffRead = new BufferedReader(new InputStreamReader((conn.getInputStream()),StandardCharsets.UTF_8));

                StringBuilder response = new StringBuilder();

                String responseLine;

                while ((responseLine = buffRead.readLine()) != null)
                {
                response.append(responseLine.trim());
                }

                RESPONSE= response.toString();

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            return RESPONSE;
        }


    }

