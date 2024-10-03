/*
*   Generic Rest Engine that maintains connections to restFul and WebSocket Clients
*
*
* */

package TRADING.EXECUTION_ENGINES.REST;

import TRADING.EXECUTION_ENGINES.Generic_Rest_and_WebSocket_Engine_Interface;
import okhttp3.OkHttpClient;

import java.security.Key;

public class REST_ENGINE implements Generic_Rest_and_WebSocket_Engine_Interface
{
    //Data Variables for Rest Engine
    public String VenueName;
    public String API_Key_Environment_Name;
    public String API_Password_Environment_Name;

    //EndPoints
    String WebSocket_EndPoint = " ";
    String Rest_EndPoint = " ";

    //Credentials
    String API_Key = " ";
    String Password = " ";
    String Encrypted_API_Password = " ";

    public REST_ENGINE()
    {
        System.out.println("REST ENGINE CLASS - CALLED");


        //Create a task to automatically ping the Rest and Web Socket End Points after 5 min - 300s
    }











    @Override
    public void Connect_with_Password()
    {

    }

    @Override
    public void Connect_with_EncryptedPASSWORD() {

    }

    @Override
    public void Disconnect() {

    }

    @Override
    public void Reconnect() {

    }

    @Override
    public void Ping_Rest_EndPoint()
    {


    }

    @Override
    public void Ping_WebSocket_EndPoint() {

    }

    @Override
    public void Connect_WebSocket() {

    }

    @Override
    public void Disconnect_WebSocket() {

    }

    @Override
    public void Start_Session_asDEMO() {

    }

    @Override
    public void Start_Session_asLIVE() {

    }

    @Override
    public void Fetch_ApiKey_Password()
    {
        //Read Key and Password
        API_Key = Read_Api_Key_from_System_Environment(API_Key_Environment_Name);
        Password = Read_Api_Password_from_System_Environment(API_Password_Environment_Name);

        //Print the Password and Key
        System.out.println("KEY = " + API_Key + "Pasword = " + Password);


    }

    @Override
    public String Read_Api_Key_from_System_Environment(String KeyName)
    {
        String Key_Name =KeyName;
        String API_Key = System.getenv(Key_Name);

        //Check that API Key is Found
        if(API_Key == null)
        {
            //Api Key has not been Found


        }
        else
        {
            //Api Key has been Found

        }


        //Fetch the API Key and Password from System Environment

        return API_Key;
    }

    @Override
    public String Read_Api_Password_from_System_Environment(String PasswordNAME)
    {


        return PasswordNAME;
    }


    @Override
    public void Determine_Error() {

    }

    @Override
    public void Fetch_Bars() {

    }

    @Override
    public void Read_Settings_From_File() {

    }

    @Override
    public void Open_Trade() {

    }

    @Override
    public void Close_Trade() {

    }

    @Override
    public void Fetch_List_of_OpenTrades() {

    }
}


