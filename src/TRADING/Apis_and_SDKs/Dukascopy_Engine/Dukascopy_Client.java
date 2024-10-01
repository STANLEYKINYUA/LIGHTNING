package TRADING.Apis_and_SDKs.Dukascopy_Engine;

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

public class Dukascopy_Client implements IClient {
    /**
     * Authenticates and connects to dukascopy servers
     *
     * @param jnlp     address of jnlp file, that is used to launch platform
     * @param username user name
     * @param password password
     * @throws JFAuthenticationException authentication error, incorrect username or password,
     *                                   IP address unrecognized in case of LIVE systems
     * @throws JFVersionException        version is blocked on the server, update your libraries
     * @throws Exception                 all kinds of errors that resulted in exception
     */

    int Max_connect_Wait_Time_Seconds = 10;

    public Dukascopy_Client(String usernme, String password,String jnlp) throws Exception , JFAuthenticationException,JFVersionException
    {
        String UserName = usernme;
        String Password = password;
        String JNLP_Url = jnlp;


        //Try to Connect
        try
        {
            //On start :: Initiate a Connection and Maintain it
            connect(jnlp,UserName,Password);

            //Wait 10 seconds max
            while(Max_connect_Wait_Time_Seconds >0 && !this.isConnected())
            {
                Thread.sleep(1000);
                Max_connect_Wait_Time_Seconds--;

            }

            //If it has failed to connect
            if(!this.isConnected())
            {
                //Output an Error.
                System.out.print("FAILED TO CONNECT TO DUKASCOPY SERVERS");

            }else
            {
                //Set the System Listener
                this.setSystemListener(new ISystemListener() {
                    @Override
                    public void onStart(long processId) {
                        System.out.println("System Listener has started Strategy on: " + processId);
                    }

                    @Override
                    public void onStop(long processId) {
                        System.out.println("System Listener has stopped Strategy on: " + processId);
                    }

                    @Override
                    public void onConnect() {
                        System.out.println("System Listener has Connected to Dukascopy Server ");
                    }

                    @Override
                    public void onDisconnect() {
                        System.out.println("System Listener has been Disconnected from Dukascopy Server ");
                    }
                });

                //Subscribe to Instruments and request Price Feed
                Set<Instrument> Symbols = new HashSet<>();
                Symbols.add(Instrument.USDJPY);
                this.setSubscribedInstruments(Symbols);

                //Request market data
                System.out.println("Subscribed Instrumeners : " + Symbols);


            }

        }
        catch(Exception e)
        {
            //print the exception
            e.printStackTrace();;
        }
        finally
        {
            //Disconnect
            this.disconnect();
        }



    }



    @Override
    public void connect(String jnlp, String username, String password) throws JFAuthenticationException, JFVersionException, Exception {

    }

    /**
     * Authenticates and connects to dukascopy servers
     *
     * @param jnlp     address of jnlp file, that is used to launch platform
     * @param username user name
     * @param password password
     * @param pin      pin code generated with the captcha from the last {@link #getCaptchaImage} call
     * @throws JFAuthenticationException authentication error, incorrect username or password,
     *                                   IP address unrecognized in case of LIVE systems
     * @throws JFVersionException        version is blocked on the server, update your libraries
     * @throws Exception                 all kinds of errors that resulted in exception
     */
    @Override
    public void connect(String jnlp, String username, String password, String pin) throws JFAuthenticationException, JFVersionException, Exception {

    }

    /**
     * Returns the image that can be provided to the user to generate correct pin code
     *
     * @param jnlp address of jnlp file, that is used to launch platform
     * @return captcha image
     * @throws Exception if request for captcha failed
     */
    @Override
    public BufferedImage getCaptchaImage(String jnlp) throws Exception {
        return null;
    }

    /**
     * Tries to reconnect transport without reauthenticating. Method is asynchronous, meaning it will exit immidiately
     * after sending connection request without waiting for the response. Caller will receive notification through
     * {@link ISystemListener} interface
     */
    @Override
    public void reconnect() {

    }

    /**
     * Returns true if reconnect is allowed.
     *
     * @return true if reconnect is allowed
     */
    @Override
    public boolean isReconnectAllowed() {
        return false;
    }

    /**
     * Stops all running strategies and disconnect from dukascopy server.
     */
    @Override
    public void disconnect() {

    }

    /**
     * Returns true if client is authenticated authorized and transport is in connected state
     *
     * @return true if there is open and working connection to the server
     */
    @Override
    public boolean isConnected() {
        return false;
    }

    /**
     * Starts the strategy with default exception handler that will stop strategy if it trows exception
     *
     * @param strategy strategy to run
     * @return returns id assigned to the strategy
     * @throws IllegalStateException if not connected
     * @throws NullPointerException  if one of the parameters is null
     */
    @Override
    public long startStrategy(IStrategy strategy) throws IllegalStateException, NullPointerException {
        return 0;
    }

    /**
     * Starts the strategy
     *
     * @param strategy         strategy to run
     * @param exceptionHandler if not null then passed exception handler will be called when strategy throws exception
     * @return returns id assigned to the strategy
     * @throws IllegalStateException if not connected
     * @throws NullPointerException  if one of the parameters is null
     */
    @Override
    public long startStrategy(IStrategy strategy, IStrategyExceptionHandler exceptionHandler) throws IllegalStateException, NullPointerException {
        return 0;
    }

    /**
     * Starts the plugin
     *
     * @param plugin           plugin to run
     * @param exceptionHandler if not null then passed exception handler will be called when strategy throws exception
     * @return returns id assigned to the strategy
     * @throws IllegalStateException if not connected
     * @throws NullPointerException  if one of the parameters is null
     */
    @Override
    public UUID runPlugin(Plugin plugin, IStrategyExceptionHandler exceptionHandler) throws IllegalStateException, NullPointerException {
        return null;
    }

    /**
     * Starts the strategy
     *
     * @param plugin            plugin to run
     * @param exceptionHandler  if not null then passed exception handler will be called when strategy throws exception
     * @param pluginGuiListener listener for plugin gui events
     * @return returns id assigned to the strategy
     * @throws IllegalStateException if not connected
     * @throws NullPointerException  if one of the parameters is null
     */
    @Override
    public UUID runPlugin(Plugin plugin, IStrategyExceptionHandler exceptionHandler, PluginGuiListener pluginGuiListener) throws IllegalStateException, NullPointerException {
        return null;
    }

    /**
     * Stops the strategy with the specified id
     *
     * @param processId id of the strategy
     */
    @Override
    public void stopPlugin(UUID processId) {

    }

    /**
     * Loads strategy from jfx file
     *
     * @param strategyBinaryFile jfx file
     * @return loaded strategy
     * @throws Exception if loading failed
     */
    @Override
    public IStrategy loadStrategy(File strategyBinaryFile) throws Exception {
        return null;
    }

    /**
     * Stops the strategy with the specified id
     *
     * @param processId id of the strategy
     */
    @Override
    public void stopStrategy(long processId) {

    }

    /**
     * Returns map with ids mapped to associated strategies.
     * Includes only strategies started by the current process.
     *
     * @return started strategies
     */
    @Override
    public Map<Long, IStrategy> getStartedStrategies() {
        return Map.of();
    }

    /**
     * Returns map with ids mapped to associated strategies
     *
     * @return started strategies
     */
    @Override
    public Map<UUID, Plugin> getRunningPlugins() {
        return Map.of();
    }

    /**
     * Sets the listener, that will receive notifications about connects disconnects and strategies starts and stops.
     * Only one system listener can be set.
     *
     * @param systemListener listener
     */
    @Override
    public void setSystemListener(ISystemListener systemListener) {

    }

    /**
     * Adds news filter
     *
     * @param newsFilter news filter
     */
    @Override
    public void addNewsFilter(INewsFilter newsFilter) {

    }

    /**
     * Returns news filter for the source
     *
     * @param newsSource news source
     * @return news filter
     */
    @Override
    public INewsFilter getNewsFilter(INewsFilter.NewsSource newsSource) {
        return null;
    }

    /**
     * Removes news filter, resetting it to the default value
     *
     * @param newsSource news source
     * @return news filter removed
     */
    @Override
    public INewsFilter removeNewsFilter(INewsFilter.NewsSource newsSource) {
        return null;
    }

    /**
     * Subscribes to the specified instruments set.
     * Ticks passed in onTick method will have full depth for this instruments, while other instruments are not guaranteed to have full depth.
     *
     * @param instruments set of the instruments
     */
    @Override
    public void setSubscribedInstruments(Set<Instrument> instruments) {

    }

    /**
     * Unsubscribes from instruments specified in instruments set.
     *
     * @param instruments set of the instruments
     */
    @Override
    public void unsubscribeInstruments(Set<Instrument> instruments) {

    }

    /**
     * Subscribes to the specified instruments set.
     * Ticks passed in onTick method will have full depth for this instruments, while other instruments are not guaranteed to have full depth.
     *
     * @param financialInstruments set of the instruments
     */
    @Override
    public void setSubscribedFinancialInstruments(Set<IFinancialInstrument> financialInstruments) {

    }

    /**
     * Returns subscribed instruments
     *
     * @return set of the subscribed instruments
     */
    @Override
    public Set<Instrument> getSubscribedInstruments() {
        return Set.of();
    }

    /**
     * Returns subscribed instruments
     *
     * @return set of the subscribed instruments
     */
    @Override
    public Set<IFinancialInstrument> getSubscribedFinancialInstruments() {
        return Set.of();
    }

    /**
     * Sets stream that will be passed to the strategy through IConsole. Default out is System.out
     *
     * @param out stream
     */
    @Override
    public void setOut(PrintStream out) {

    }

    /**
     * Sets stream that will be passed to the strategy through IConsole. Default err is System.err
     *
     * @param err stream
     */
    @Override
    public void setErr(PrintStream err) {

    }

    /**
     * Sets the location of the cache files. Default is <code>System.getProperty("java.io.tmpdir") + "/.cache"</code>
     * <p> The method should get called <u>before</u> the call of {@link #connect(String, String, String)}.
     * <p>WARNING: JForex might delete all folder's content if folder already existed AND was not created by this method call.
     *
     * @param cacheDirectory directory where cache files should be saved
     */
    @Override
    public void setCacheDirectory(File cacheDirectory) {

    }

    /**
     * Compile .java strategy file to .jfx file. Destination .jfx file will be located in the same directory as the source.
     *
     * @param srcJavaFile .java source file to be compiled
     * @param obfuscate   if true, the strategy will be obfuscated
     * @throws IllegalStateException if not connected
     */
    @Override
    public void compileStrategy(String srcJavaFile, boolean obfuscate) {

    }

    /**
     * @param file .jar source file to be packed
     * @return the packed jfx file.
     * @throws IllegalStateException if not connected
     * @see #packToJfx(File)
     */
    @Override
    public File packPluginToJfx(File file) {
        return null;
    }

    /**
     * Packs .jar a strategy, indicator or plugin file to .jfx file.
     * Destination .jfx file will be located in the same directory as the source.
     * The META-INF/MANIFEST.MF should contain an entry which determines the qualified name
     * of the strategy, indicator or plugin main class (the class which will serve
     * as the "entry point" for the platform. For instance:
     * <p>
     * <code>jfMainClass: mypackage.MyStrategy</code>
     *
     * @param file .jar source file to be packed
     * @return the packed jfx file.
     * @throws IllegalStateException if not connected
     */
    @Override
    public File packToJfx(File file) {
        return null;
    }

    /**
     * Register a {@link IClientGUIListener} which is "interested" in open / close charts from strategy
     *
     * @param clientGuiListener {@link IClientGUIListener}
     */
    @Override
    public void addClientGUIListener(IClientGUIListener clientGuiListener) {

    }

    /**
     * Unregister a {@link IClientGUIListener}
     *
     * @param clientGuiListener {@link IClientGUIListener}
     */
    @Override
    public void removeClientGUIListener(IClientGUIListener clientGuiListener) {

    }

    /**
     * Opens new chart with specified in {@link IFeedDescriptor} parameters.
     *
     * @param feedDescriptor Feed descriptor for chart to open
     * @return IChart newly created chart
     * @throws IllegalArgumentException when feedDescriptor not formed well
     */
    @Override
    public IChart openChart(IFeedDescriptor feedDescriptor) {
        return null;
    }

    /**
     * Opens new chart with specified in {@link IFeedInfo} parameters.
     *
     * @param feedInfo Feed info for chart to open
     * @return IChart newly created chart
     * @throws IllegalArgumentException when feedDescriptor not formed well
     */
    @Override
    public IChart openChart(IFeedInfo feedInfo) {
        return null;
    }

    /**
     * Opens new chart from specified .tmpl file
     *
     * @param template file to open
     * @return newly created chart
     * @throws IllegalArgumentException when file is not found or valid
     */
    @Override
    public IChart openChart(File template) {
        return null;
    }

    /**
     * Saves chart to specified .tmpl file
     *
     * @param chart    existing chart
     * @param template file to save
     */
    @Override
    public void saveChart(IChart chart, File template) {

    }

    /**
     * Close specified chart.
     *
     * @param chart Chart to close
     */
    @Override
    public void closeChart(IChart chart) {

    }

    /**
     * Returns {@link IClientGUI} for specified {@link IChart}.<br>
     * <b>NOTE:</b> Can be used only by <b>Standalone JForex API</b>. There is no access to embedded chart's panels from  JForex Platform.
     *
     * @param chart {@link IChart}
     * @return {@link IClientGUI} for specified {@link IChart}, or <code>null</code> if it's not Standalone JForex API environment.
     */
    @Override
    public IClientGUI getClientGUI(IChart chart) {
        return null;
    }

    /**
     * Returns a set of operable for the current user instruments.
     * Use this method to get all available instruments. If there is no
     * instruments available, the method return empty set.
     *
     * @return set of available instruments
     */
    @Override
    public Set<Instrument> getAvailableInstruments() {
        return Set.of();
    }

    /**
     * Returns a set of operable for the current user instruments.
     * Use this method to get all available instruments. If there is no
     * instruments available, the method return empty set.
     *
     * @return set of available instruments
     */
    @Override
    public Set<IFinancialInstrument> getAvailableFinancialInstruments() {
        return Set.of();
    }

    /**
     * Returns global preference holder for JForex-SDK
     *
     * @return global preference holder for JForex-SDK
     */
    @Override
    public IPreferences getPreferences() {
        return null;
    }

    /**
     * Sets global preferences for JForex-SDK
     * Consider hiding the position labels and the closed positions from charts (needs to be called after a successful connection):
     * <pre>
     * IPreferences pref = client
     *     .getPreferences().chart().orders()
     *           .entryOrders(true)
     *     .preferences().chart().positions()
     *           .positionExternalIdLabels(false)
     *           .closedPositions(false)
     *           .openPositions(true)
     *     .preferences();
     * client.setPreferences(pref);
     * </pre>
     *
     * @param preferences preferences
     */
    @Override
    public void setPreferences(IPreferences preferences) {

    }

    /**
     * Returns a manager for remote strategy running, stopping and monitoring
     *
     * @return a manager for remote strategy running, stopping and monitoring
     */
    @Override
    public IRemoteStrategyManager getRemoteStrategyManager() {
        return null;
    }
}
