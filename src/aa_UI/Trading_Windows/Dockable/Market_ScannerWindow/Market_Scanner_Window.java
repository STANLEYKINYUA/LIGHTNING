package aa_UI.Trading_Windows.Dockable.Market_ScannerWindow;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;

import javax.swing.*;

public class Market_Scanner_Window extends JPanel implements Dockable
{
    private final String text;

    public Market_Scanner_Window(String text)
    {

        this.text = text;


        //Register as a Dockable
        Docking.registerDockable(this);

        //Set size
        this.setSize(100,100);





    }



    @Override
    public String getPersistentID() {
        return text;
    }

    @Override
    public String getTabText() {
        return text;
    }
}
