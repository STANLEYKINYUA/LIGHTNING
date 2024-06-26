package aa_UI.Trading_Windows.Dockable.Charts_and_Objects.ChartManager;

/** This class is used to Open and Manage Charts_and_Objects +  store Chart Settings + Chart Template Information */
public class Chart_Manager
{
    private String Config_File_Location = null;

    private int Open_Charts = 0;

    //Special Data Types to track which Charts_and_Objects are open.
   private boolean[] Charts_Array = new boolean[30];


    /** Default Constructor for Chart Manager*/
    public Chart_Manager()
    {
        String Locked_Positions_FromConfigFile = null;

        // On Load : Read the Config Files and Determine Open Charts_and_Objects if any
        Read_From_Config_File();

        //Lock Chart Positions in Array after reading the Locked Positions
        Lock_Multiple_ChartPositions_in_ChartsArray(Locked_Positions_FromConfigFile);

        //Set all unused Chart Positions to Null


    }

    // Chart Manager Functions that Open and Manage Number of Open Charts_and_Objects
    public void Open_Chart(int Chart_Number ,String Symbol , String Chart_Type , int Period)
    {
        //Read Charts_and_Objects Array and Determine Open Charts_and_Objects

        //Write to Config File on what has changed
        Write_to_Config_File();
    }
    public void Close_Chart(int Chart_Number)
    {

        //Write to Config File on what has changed
        Write_to_Config_File();
    }

    /** Functions to manipulate Chart Array*/

    public void Lock_Multiple_ChartPositions_in_ChartsArray(String Positions_toLock)
    {
        //Split String PositionsTo Lock and extract positions to be unlocked and add them to an array

    }
    public void Lock_Chart_Position_in_ChartsArray(int Position_toLock)
    {}
    public void Unlock_Chart_Position_in_ChartsArray(int Position_toUnlock)
    {}


    /** Chart Manager Config File Reading Functions */
    public void Write_to_Config_File()
    {
        //Concatenate Open Positions
    }
    public void Read_From_Config_File()
    {

    }

    public void Update_Number_ofOpen_Charts(){}
    public void Update_Specific_Chart_Settings(int Chart_Number, String Chart_Type , int Period){}






    //Chart Manager Supports Opening up to 30 Charts_and_Objects which can be accessed by their Individual names
    public void OpenChart1(String Symbol , String Chart_Type , int Period, String DockPosition , String Dock_Parent)
    {
        //Create new Chart Object and Spawn Window

        //Chart name should be derived from : Symbol + Chart_Type + Period
    }
    public void OpenChart2(){}
    public void OpenChart3(){}
    public void OpenChart4(){}
    public void OpenChart5(){}
    public void OpenChart6(){}
    public void OpenChart7(){}
    public void OpenChart8(){}
    public void OpenChart9(){}
    public void OpenChart10(){}
    public void OpenChart11(){}
    public void OpenChart12(){}
    public void OpenChart13(){}
    public void OpenChart14(){}
    public void OpenChart15(){}
    public void OpenChart16(){}
    public void OpenChart17(){}
    public void OpenChart18(){}





}
