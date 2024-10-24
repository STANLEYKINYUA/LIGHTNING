package a_PROTOTYPING.ModernDocking_prototype;

import ModernDocking.Dockable;
import ModernDocking.DockingRegion;
import ModernDocking.app.Docking;
import ModernDocking.app.RootDockingPanel;
import GENERAL_SYSTEMS.THEMES.FlatMacDark_LAF;

import javax.swing.*;
import java.awt.*;

public class Hello
{
    static class DockingPanel extends JPanel implements Dockable
    {
        private final String text;

        public DockingPanel(String text)
        {
            this.text = text;

            Docking.registerDockable(this);
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

    static class DockingTabbedPanel extends JTabbedPane implements Dockable
    {
        private final String text;

        public DockingTabbedPanel(String text)
        {
            this.text = text;

            Docking.registerDockable(this);
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

    public static class MainFrame extends JFrame
    {
        public MainFrame()
        {
            this.setSize(400,300);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            Docking.initialize(this);

            //Create a RootDocking Panel for each Docking Panel & Add to this Form.
            RootDockingPanel root_panel_1 = new RootDockingPanel(this);
            this.add(root_panel_1, BorderLayout.CENTER);


            //note that the two "hello" variables are similar for var and string text

            DockingPanel hello1 = new DockingPanel("hello");
            DockingPanel hello2 = new DockingPanel("hello2");
            DockingTabbedPanel hello3 = new DockingTabbedPanel("hello3");
            DockingPanel Favourites = new DockingPanel("Favourites");

            hello3.addTab("All",new JTabbedPane());
            hello3.addTab("Fx",new JTabbedPane());
            hello3.addTab("Crypto",new JTabbedPane());
            hello3.addTab("Commodities",new JTabbedPane());

            DockingPanel hello4 = new DockingPanel("hello4");


            /* TODO  From here I can create the max number of panels I want to be able to dock
            *           I can restrict formation of Other Panels using IF statement
            *
            *   >   Order how Windows are laid out using my Class
            *   >   Create my Own Layout Manager that Stores
            * */


            //Dock hello1 into the centre of the frame
            Docking.dock(hello1,this);

            //Dock hello2 into the east of this frame
            Docking.dock(hello2,this, DockingRegion.EAST);

            //Dock hello3 into the centre of hello2 == This creates a Tabbed Frame;
            Docking.dock(hello3,hello2 , DockingRegion.CENTER);

            //Dock hello4 into global West of the entire Frame
            Docking.dock(hello4,this, DockingRegion.WEST);

        }
    }

    public static void main(String[] args)
    {
        FlatMacDark_LAF.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
        FlatMacDark_LAF.setup();

        SwingUtilities.invokeLater(()-> new MainFrame().setVisible(true));
    }

}
