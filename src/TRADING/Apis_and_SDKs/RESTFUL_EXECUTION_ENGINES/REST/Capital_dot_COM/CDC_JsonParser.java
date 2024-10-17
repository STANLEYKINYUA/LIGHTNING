package TRADING.Apis_and_SDKs.RESTFUL_EXECUTION_ENGINES.REST.Capital_dot_COM;

import org.json.JSONObject;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Map;

public class CDC_JsonParser
{
    public CDC_JsonParser()
    {

    }

    //Parsing Functions ::  Accept a map of the Headers and parse it
    public void Parse_Session_Initiation_Headers(Map<String , List<String>> Session_Header)
    {


        //Fetch the CST + X security token
        JSONObject JsonHeader = new JSONObject();

            //Extract CST
        String CST = JsonHeader.getString("cst");
        String X_S_T= JsonHeader.getString("x-security-token");

        System.out.println("CST Header = "+ CST);
        System.out.println("X-Security-Token =" + X_S_T);

    }

    void Parse_Session_Initiation_Response_Body(String Response_Status_Code)
    {
        String Response = Response_Status_Code;



    }
}
