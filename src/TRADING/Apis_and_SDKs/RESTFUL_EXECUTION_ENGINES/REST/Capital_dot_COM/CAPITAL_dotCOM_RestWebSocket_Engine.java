package TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST.Capital_dot_COM;

import TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST.REST_ENGINE;
import io.reactivex.Completable;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class CAPITAL_dotCOM_RestWebSocket_Engine extends REST_ENGINE
{
    //Database Connector to Add and Remove data

    // Authentication Information
    final String Api_Key = "EIYbFsrNmWGMwqHV";
    final String Password ="n@TASHA10896";
    final String My_Email = "stanley.andrew.kinyua@gmail.com";
    final String Login = "PROJECT-n@T";

    String CST_Token = null;
    String X_Security_Token = null;


    //URLS
    String Base_URL = "https://api-capital.backend-capital.com/api/v1/";
    String Base_Demo_Url = "https://demo-api-capital.backend-capital.com/api/v1/";

    //Url Extensions
    final String Ping = "ping";
    final String Session = "session";
    final String Time   = "time";

    //Instantiate HTTP Client
    HttpClient Capital_dot_Com = HttpClient.newBuilder().build();

    //Requests

            //Get_Request

            //Post_Request


    public CAPITAL_dotCOM_RestWebSocket_Engine() throws IOException, URISyntaxException, InterruptedException, ExecutionException, TimeoutException
    {
        System.out.println("Starting Capital.com ");

        //Form Endpoint
        String Session_EndPoint = Base_URL + Session;

        //Create a Session
        Create_Session();


        //Ping the Session
        Ping_the_Session();



        //Start a Websocket Session and fetch list of epics +  Start Getting Prices :: 10 Instruments

            //Create a Body to start Streaming Prices of 5 inst:: Crude , EURUSD , BTC , GOLD , SILVER
            String Streaming_Body = "{\"encryptedPassword\": \"false\" ,"+
                "               \"identifier\": \"Stanley.andrew.kinyua@gmail.com\","+
                "               \"password\": \"n@TASHA10896\"}";

            //Create a GET Request to fetch List of Epics
            HttpRequest GET_WebSocket_Epics = HttpRequest.newBuilder()
                .uri(new URI("https://api-capital.backend-capital.com/api/v1/marketnavigation"))
                .header("content-type","application/json")
                .header("X-CAP-API-KEY",Api_Key)
                .POST(HttpRequest.BodyPublishers.ofString(Streaming_Body))
                .build();

    }

    //Session Creation
    public void Create_Session() throws URISyntaxException, ExecutionException, InterruptedException, TimeoutException {
        //Form Endpoint
        String Session_EndPoint = Base_URL + Session;

        // Create a Message Body
        String Message_Body = "{\"encryptedPassword\": \"false\" ,"+
                "               \"identifier\": \"Stanley.andrew.kinyua@gmail.com\","+
                "               \"password\": \"n@TASHA10896\"}";

        //Send the Post Request
        HttpRequest Session_Initiate_request = HttpRequest.newBuilder()
                .uri(new URI("https://api-capital.backend-capital.com/api/v1/session"))
                .header("content-type","application/json")
                .header("X-CAP-API-KEY",Api_Key)
                .POST(HttpRequest.BodyPublishers.ofString(Message_Body))
                .build();

        //Send the response Assyncronously and handle the response when it arrives
        CompletableFuture<HttpResponse<String>> Assync_Response = Capital_dot_Com.sendAsync(Session_Initiate_request,HttpResponse.BodyHandlers.ofString());

        //Hand the response when it gets here
        Assync_Response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);
        HttpResponse<String> Response = Assync_Response.join();
        int Async_Response_Code = Assync_Response.thenApply(HttpResponse::statusCode).get(5,TimeUnit.SECONDS);


        //Output the Response and the Headers
        System.out.println(("Our request was = " + Message_Body));
        System.out.println(" ");
        System.out.println("The Headers we received back were : " + Response.headers());
        System.out.println("The Response that we got was : "+Response.statusCode() +"= " + Response.body());

        Map<String, List<String>> Headers = Response.headers().map();
        String cst_token = Headers.getOrDefault("cst",List.of("")).get(0);
        String xSecurityToken = Headers.getOrDefault("x-security-token", List.of("")).get(0);

        System.out.println("CST: " + cst_token);
        System.out.println("X-SECURITY-TOKEN: " + xSecurityToken);

        //Set the CST and X Security Token
        X_Security_Token = xSecurityToken;
        CST_Token = cst_token;

        //TODO Create an Object that Pings the Session every 5 minutes to keep connection alive


    }

    //Market Data Subscription
    public void Ping_the_Session() throws URISyntaxException, ExecutionException, InterruptedException, TimeoutException
    {
        System.out.println("=================================================================================");

        System.out.println(" Pinging CDC");
        //Create the PingURL
        String Ping_URL ="https://api-capital.backend-capital.com/api/v1/ping" ;

        System.out.println("URL = " + Ping_URL);
        //Create and send the Ping Request
        HttpRequest Ping_request = HttpRequest.newBuilder()
                .uri(new URI(Ping_URL))
                .header("X-SECURITY-TOKEN", X_Security_Token)
                .header("CST",CST_Token)
                .GET()
                .build();

        System.out.println("Here");

        //Send Request Assynchronously
        CompletableFuture<HttpResponse<String>> Ping_Assync_Response = Capital_dot_Com.sendAsync(Ping_request,HttpResponse.BodyHandlers.ofString());


        //Hand the response when it gets here
        Ping_Assync_Response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);
        HttpResponse<String> Response = Ping_Assync_Response.join();
        int Async_Response_Code = Ping_Assync_Response.thenApply(HttpResponse::statusCode).get(5,TimeUnit.SECONDS);




        //Output the Result
        System.out.println(" ");
        System.out.println("PING sent Successfully");
        System.out.println("Response code : " + Response.statusCode());
        System.out.println("Response : " + Response.body());
        System.out.println(" ");


        System.out.println("=================================================================================");
    }

    public Map<String, Double> Return_WatchList_Map()
    {
        Map<String , Double > WatchList_Map = new HashMap<>();


        return WatchList_Map;
    }

    //Functions related to
}