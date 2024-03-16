package aa_11_DEV_TERMINAL;

import com.github.weisj.jsvg.geometry.path.Terminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CMD_Terminal extends JFrame
{

    String Current_Command;


    public CMD_Terminal()
    {
        //TODO  Create Window and Set Window Parameters
        this.setBounds(200,50,400,350);

        //Set it to always be on top.
        this.setAlwaysOnTop(true);


        //TODO  Add Large TextBox
        JTextArea Terminal_Pane = new Terminal_Text_Pane();
        this.add(Terminal_Pane);
        Terminal_Pane.setVisible(true);


        //Add a Listener to handle Pressing of the ENTER_KEY_LISTENER Key and Interpret Command.


    }

    //------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------
    // Commands use to Manage and Administer the Console.

    //Clear all text from the Console
    void Clear_Terminal_Screen()
    {
        //Command to clear Screen of the Terminal.
        // Command -  CLS / Clear / Clear Screen
    }

    //Action that Occurs when ENTER_KEY_LISTENER KEY is pressed.
    void ENTER_KEY_PRESSED()
    {
        //Call Message Interpreter and pass message to it.




    }

    //Read Message and Interpret Command
    void Interpret(String Command_Message)
    {
        String Command = Command_Message;
        //Read Message and Determine Action to Perform
    }


    //------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------
    //Commands used to call various Windows
    void Jump_to_Trading_window(String Window_Name)
    {
        String Name_of_Window = Window_Name;

        //Window to Jump to.

    }
    //------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------
    //Commands used to Reset Entire Program.
    void SYSTEM_RESET()
    {

    }

    //------------------------------------------------------------------------------------------





}
