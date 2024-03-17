package aa_11_DEV_TERMINAL;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Terminal_Text_Pane extends JTextArea
{

    //Create Class Constructor.
    public Terminal_Text_Pane()
    {
        //Initialize TextPane
        Init_Terminal_TextPane();

    }



    //Text Pane Code
    void Init_Terminal_TextPane()
    {
        //Exception to handle any fails that may occur.
        try
        {
            //Set bounds for the textpane
            this.setBounds(10,10,190,330);

            //Set the BackColour to Black.
            this.setBackground(Color.BLACK);

            //Set ForeGround to Green
            this.setForeground(Color.GREEN);

            //Set Lines to Wrap
            this.setLineWrap(true);

            //Set Cursor
            this.setCursor(new Cursor(Cursor.TEXT_CURSOR));

            //Set the Font
            this.setFont(new Font(FlatRobotoFont.FAMILY,Font.BOLD ,12));

            //Set Carret.



        }
        catch(Exception Terminal_Text_Pane_Exception)
        {
            Terminal_Text_Pane_Exception.printStackTrace();
        }

    }

    //----------------------------------------------------------------------------
    // ENTER KEY LISTENER
    class ENTER_LISTENER implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                //Call Enter Key Pressed Function.
                ENTER_KEY_PRESSED();

            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
    //----------------------------------------------------------------------------

    //----------------------------------------------------------------------------
    //Function to Execute when Enter Key is Pressed.
    void ENTER_KEY_PRESSED()
    {
        Print_to_Terminal("ENTER PRESSED SUCCESSFULLY");
    }
    //----------------------------------------------------------------------------


    //----------------------------------------------------------------------------
    //Functions to Add Text to the Terminal
    void Print_to_Terminal(String Message)
    {
        String Output = Message;

        //TODO  Set text to print when enter pressed.


    }
    //----------------------------------------------------------------------------


    //----------------------------------------------------------------------------
    //----------------------------------------------------------------------------


}
