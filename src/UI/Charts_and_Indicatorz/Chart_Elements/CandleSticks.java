package UI.Charts_and_Indicatorz.Chart_Elements;

public class CandleSticks
{

    public int Open_Price;
    public int Close_Price;
    public int High_Price;
    public int Low_Price;

    String Open_Time;
    String Close_Time;



    public CandleSticks(int OpenPrice,int ClosePrice,int HighPrice,int LowPrice)
    {
        //Set the values
        this.Open_Price = OpenPrice;
        this.Close_Price = ClosePrice;
        this.High_Price = HighPrice;
        this.Low_Price = LowPrice;


    }
}
