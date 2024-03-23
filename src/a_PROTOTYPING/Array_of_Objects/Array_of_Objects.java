package a_PROTOTYPING.Array_of_Objects;

import java.util.List;
import java.util.Vector;

public class Array_of_Objects
{
    public Array_of_Objects(String Time )
    {
        String myTime = Time;
        //String myAsk  = Double.toString(Ask_Price);
        //String myBid  = Double.toString(Bid_Price);

    }

    public static void main(String[] args)
    {
        //Create an Array
        String ObjectsArray[] = new String[100];

        //Create a List
        List<Array_of_Objects> objectsList = new Vector<>();

        objectsList.set(0, new Array_of_Objects("TODAY"));

        System.out.println(objectsList.get(0));
    }
}
