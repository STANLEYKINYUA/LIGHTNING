package a_PROTOTYPING.Dukascopy_prototype;

import com.dukascopy.api.*;
import com.dukascopy.api.feed.IFeedDescriptor;
import com.dukascopy.api.feed.IFeedInfo;
import com.dukascopy.api.instrument.IFinancialInstrument;
import com.dukascopy.api.plugins.Plugin;
import com.dukascopy.api.plugins.PluginGuiListener;
import com.dukascopy.api.strategy.remote.IRemoteStrategyManager;
import com.dukascopy.api.system.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final String jnlpUrl = "https://www.dukascopy.com/client/demo/jclient/jforex.jnlp";
    private static final String username = "your_username";
    private static final String password = "your_password";



    
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        System.out.println("Dukascopy Started !!");

        System.out.println("Attempting to connect to Dukascopy");
        
        //Create an Instance of the Class
        Dukascopy_Client dukascopy_client = new Dukascopy_Client();
        
        
        try
        {
            dukascopy_client.connect(jnlpUrl,username,password);

            System.out.println("Attempted the Connection");
        }
        catch(Exception Connection_Exception)
        {
            System.out.println(Connection_Exception.toString());
        }
        
       
    }
}