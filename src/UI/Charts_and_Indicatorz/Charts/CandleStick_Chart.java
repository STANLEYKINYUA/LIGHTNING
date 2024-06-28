package UI.Charts_and_Indicatorz.Charts;

import ModernDocking.Dockable;
import ModernDocking.app.Docking;
import UI.Charts_and_Indicatorz.Charts.Generic_XY_Chart._Generic_XY_Chart;

public class CandleStick_Chart extends _Generic_XY_Chart implements Dockable
{
    private final String text;

    public CandleStick_Chart(String text)
    {
        this.text = text;

        //Register as Dockable
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
