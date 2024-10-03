package TRADING.PORTFOLIO_MANAGER;

import java.math.BigDecimal;

public class PORTFOLIO
{
    BigDecimal Total_Global_Account_Value;
    BigDecimal Total_Amt_of_Crypto_in_USD;


    //Value of the Portfolio
    BigDecimal Dollar_Value_of_Total_Assets;
    BigDecimal Value_by_Currency;


    //Crypto Assets
    Double  Aggregated_Crypto_Dollar_Value = 0.000000000002;

    PORTFOLIO()
    {

    }


    void Update_Portfolio()
    {}

    void Compute_Value_by_Currency(String Currency_Name , Double Current_SpotPrice)
    {

    }

}
