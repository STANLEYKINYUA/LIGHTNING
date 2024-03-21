package a_PROTOTYPING.ModernDocking_prototype;

import ModernDocking.Dockable;
import ModernDocking.internal.DockingPanel;

import javax.swing.*;

public class Hello
{
    static class DockingPanel extends JPanel implements Dockable
    {
        private final String text;

        public DockingPanel(String text)
        {
            this.text = text;
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

}
