package UI.Main_Trading_Window.MENUS;

import javax.swing.*;

/** This class deals with the MenuBar Item for Reports */
public class Reports_Menu extends JMenu
{
    /** This is the default Constructor for the reports menu class*/
    public Reports_Menu()
    {
        this.setText("REPORTS");


        //TRADES REPORT
        JMenu Trades_Report = new JMenu("TRADES");
        this.add(Trades_Report);



        //PROFIT AND LOSS
        JMenu Profit_and_Loss = new JMenu("PROFIT AND LOSS");
        this.add(Profit_and_Loss);

            JMenuItem PL_Chart = new JMenuItem("P/L Chart");
            Profit_and_Loss.add(PL_Chart);

            JMenuItem PL_Statement = new JMenuItem("P/L Statement");
            Profit_and_Loss.add(PL_Statement);


        //RISK & REWARD
        JMenu Risk_and_Reward = new JMenu("RISK-REWARD");
        this.add(Risk_and_Reward);

            JMenuItem Balance_Equity_Chart = new JMenuItem("BALANCE - EQUITY CHART");
            Risk_and_Reward.add(Balance_Equity_Chart);



        //TRADING COSTS
        JMenu Trading_Costs = new JMenu("TRADING COSTS");
        this.add(Trading_Costs);

            JMenuItem  Cost_Summary = new JMenuItem("COSTS SUMMARY");
            Trading_Costs.add(Cost_Summary);

            JMenuItem Commissions_Statement = new JMenuItem("COMMISSIONS");
            Trading_Costs.add(Commissions_Statement);

            JMenuItem Swaps_Statement = new JMenuItem("SWAPS & OVERNIGHTS");
            Trading_Costs.add(Swaps_Statement);


    }

}
