package a_PROTOTYPING.TIMER;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_Main
{



    public static void main(String args[])
    {
        int Seconds = 0;

        System.out.println("Timer Built Successfully");

        Timer timer = new Timer();
        TimerTask  CountDownTask = new CountDown_Task();

        timer.schedule(CountDownTask,5000 ,1000);







    }
}
