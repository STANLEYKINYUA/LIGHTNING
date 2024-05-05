package a_PROTOTYPING.FONT_TEST;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FONT_DISPLAY extends JFrame
{
    Font Chosence_Light =null;




    public FONT_DISPLAY()
    {
        this.setBounds(500,500,200,400);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new MigLayout());

        //Create Font.
        Create_Font();



    }

    void Create_Font()
    {
        //Catch the Exception - Try to create Font
        try
        {

            GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment();

            Font[] fontNames = GE.getAllFonts();
            for(Font s : fontNames)
            {
               // System.out.println(s);
            }

            //GE.registerFont(Font.createFont(Font.TRUETYPE_FONT ,new File("Chosence Light.otf")));
            //GE.registerFont(Font.createFont(Font.TRUETYPE_FONT ,new File("Buran USSR.ttf")));

            //Chosence_Light = Font.createFont(Font.TRUETYPE_FONT ,getClass().getClassLoader().getResourceAsStream("/Chosence Light.otf") );
            //Font Derived_Buran_USSR = Font.createFont(Font.TRUETYPE_FONT ,getClass().getClassLoader().getResourceAsStream("a_PROTOTYPING/FONT_TEST/Buran USSR.ttf") );

            //Font Buran_USSR = Derived_Buran_USSR.deriveFont(16);
            //Font BurranUSSR_font = new Font("Burran USSR",Font.PLAIN,16);

            // TODO Change this to be able to read even from JAR Files
            InputStream myStream = new BufferedInputStream(new FileInputStream("src/a_PROTOTYPING/FONT_TEST/Buran USSR.ttf"));
            Font BurranFONT = Font.createFont(Font.TRUETYPE_FONT,myStream);

            //Derive a new Font with larger text because some fonts have only 1 size
            Font BURRAN_FONT = BurranFONT.deriveFont(Font.PLAIN,36);

            //Create JLabel and Display Font
            JLabel FontLabel = new JLabel("FONT TESTING");
            FontLabel.setFont(new Font(BurranFONT.getFamily(),Font.PLAIN ,36));


            this.add(FontLabel,"span");

        }
        catch(Exception FontCreator_Exception)
        {
            FontCreator_Exception.printStackTrace();
        }
    }
}
