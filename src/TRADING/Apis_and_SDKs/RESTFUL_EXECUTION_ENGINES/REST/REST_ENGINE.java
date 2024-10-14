/*
*   Generic Rest Engine that maintains connections to restFul and WebSocket Clients
*
*
* */

package TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST;

import TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.Generic_Rest_and_WebSocket_Engine_Interface;

public class REST_ENGINE  implements Generic_Rest_and_WebSocket_Engine_Interface
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
        //
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
    public String Read_Api_Key_from_System_Environment(String KeyName)
    {
        System.out.println("KeyName  = "+ KeyName);

        String API_Key = System.getenv(KeyName);

        System.out.println("API KEY = "+ API_Key);

        return API_Key;
    }

    @Override
    public String Read_Api_Password_from_System_Environment(String PasswordNAME)
    {
        System.out.println("Password Name = "+ PasswordNAME);
        String Password_Name = System.getenv(PasswordNAME);

        System.out.println("API KEY = "+ API_Key);

        return Password_Name;
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


