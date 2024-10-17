package TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST.Capital_dot_COM;

import TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST.REST_ENGINE;
import io.reactivex.Completable;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class CAPITAL_dotCOM_RestWebSocket_Engine extends REST_ENGINE
{
    // Authentication Information
    final String Api_Key = "EIYbFsrNmWGMwqHV";
    final String Password ="n@TASHA10896";
    final String My_Email = "stanley.andrew.kinyua@gmail.com";
    final String Login = "PROJECT-n@T";

    //TOKENS
    final String CST_Token = " ";
    final String X_security_Token = " ";

    //URLS
    String Base_URL = "https://api-capital.backend-capital.com/api/v1/ ";
    String Base_Demo_Url = "https://demo-api-capital.backend-capital.com/api/v1/ ";

    //Url Extensions
    final String Ping = "ping";
    final String Session = "session";
    final String Time   = "time";

    public CAPITAL_dotCOM_RestWebSocket_Engine() throws IOException, URISyntaxException, InterruptedException, ExecutionException, TimeoutException {
        System.out.println("Starting Capital.com ");

        //Instantiate HTTP Client
        HttpClient Capital_dot_Com = HttpClient.newBuilder().build();

        //Form Endpoint
        String Session_EndPoint = Base_URL + Session;

        // Create a Message Body
        String Message_Body = "{\"encryptedPassword\": \"false\" ,"+
                "               \"identifier\": \"Stanley.andrew.kinyua@gmail.com\","+
                "               \"password\": \"n@TASHA10896\"}";


        //Create a Post Request to start a Session
        HttpRequest Session_Initiate_request = HttpRequest.newBuilder()
                .uri(new URI("https://api-capital.backend-capital.com/api/v1/session"))
                .header("content-type","application/json")
                .header("X-CAP-API-KEY",Api_Key)
                .POST(HttpRequest.BodyPublishers.ofString(Message_Body))
                .build();


        //Send the response Assyncronously and handle the response when it arrives
        CompletableFuture<HttpResponse<String>> Assync_Response = Capital_dot_Com.sendAsync(Session_Initiate_request,HttpResponse.BodyHandlers.ofString());

        //HttpResponse<String> Response = Capital_dot_Com.send(Session_Initiate_request, HttpResponse.BodyHandlers.ofString());

        //Hand the response when it gets here
        Assync_Response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);

        //
        HttpResponse<String> Response = Assync_Response.join();
        int Async_Response_Code = Assync_Response.thenApply(HttpResponse::statusCode).get(5,TimeUnit.SECONDS);

        //Output the Response and the Headers
        System.out.println(("Our request was = " + Message_Body));
        System.out.println(" ");
        System.out.println("The Headers we received back were : " + Response.headers());
        System.out.println("The Response that we got was : "+Response.statusCode() +"= " + Response.body());

        Map<String, List<String>> Headers = Response.headers().map();
        String cst = Headers.getOrDefault("cst",List.of("")).get(0);
        String xSecurityToken = Headers.getOrDefault("x-security-token", List.of("")).get(0);

        System.out.println("CST: " + cst);
        System.out.println("X-SECURITY-TOKEN: " + xSecurityToken);

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

    public void Send_Post_Request()
    {

    }
}