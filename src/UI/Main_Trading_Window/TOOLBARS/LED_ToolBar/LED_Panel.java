package UI.Main_Trading_Window.TOOLBARS.LED_ToolBar;


import javax.swing.*;
import java.awt.*;

public class LED_Panel extends JPanel
{
    //The Speed that the Font moves across
    private int LED_SPEED;

    public LED_Panel()
    {
        //Start by setting the initial parametres of the Panel
        Init_Led_Panel();



        //When it is called ::
            //1. Display : WELCOME TO LIGHTNING for 5 seconds
            //2. Display Connecting

    }

    private void Init_Led_Panel()
    {
        //Set the Background to black
        this.setBackground(Color.black);

        //todo Add Right click Mouse Handler
    }

    //Display Certain text
    public void Display_Text()
    {

    }

    //Change the Speed of the LED
    public void Change_LED_Speed(int LED_Speed)
    {
        int Speed = LED_Speed;



    }

}
