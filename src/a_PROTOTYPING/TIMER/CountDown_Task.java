package a_PROTOTYPING.TIMER;

import java.util.TimerTask;

public class CountDown_Task extends TimerTask
{
    public static int Seconds = 1;

    @Override
    public void run()
    {

        System.out.println(Seconds +" Seconds have passed ");
        //this.cancel();




        if(Seconds >= 10)
        {
            //Kill this Timer and say timer has ended.
            this.cancel();

            System.out.println("TIME IS UP");
        }

        Seconds++;

    }
}
