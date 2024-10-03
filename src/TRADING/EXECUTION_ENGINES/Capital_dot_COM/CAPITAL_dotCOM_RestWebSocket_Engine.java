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

public class CAPITAL_dotCOM_RestWebSocket_Engine extends REST_ENGINE {
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
            String Session_Response = Send_Post_Request(EndPoint, jsonInputString);
            System.out.println("Session Response : " + Session_Response);


        } catch (Exception e) {
            throw new RuntimeException(e);

        }


        //todo use a try catch block and finally to disconnect


    }


    String Send_Post_Request(String Endpoint, String JSON_InputString) throws Exception {
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

        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();

            String responseLine;

            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return response.toString();


        }


    }

    private String SendGetRequest(String endpoint) throws Exception {
        URL url = new URL(endpoint);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

        conn.setRequestProperty("X-CAP-API-KEY", API_Key);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8)))
        {
            StringBuilder response = new StringBuilder();

            String responseLine;

            while ((responseLine = br.readLine()) != null)
            {
                response.append(responseLine.trim());
            }

            System.out.println(response.toString());
            return response.toString();
        }

    }
}