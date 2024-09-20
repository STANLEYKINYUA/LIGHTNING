/*
*   Generic Rest Engine that maintains connections to restFul and WebSocket Clients
*
*
* */

package TRADING.ENGINES.REST;


import okhttp3.OkHttpClient;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;


public class REST_ENGINE
{
    // Variables for the Rest Client
    private String API_Key;
    private String SECRET_KEY;
    private String URL;




    /** Constructor for the rest Client */
    public REST_ENGINE()
    {

    }



    //Function that generates a signature for Authentication
    private static String Generate_Authentication_Signature( String Data , String Key) throws NoSuchAlgorithmException {
        // sha256HMAC = Mac.getInstance("HmacSHA256");

        return null;
    }



}
