/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailShop;

public class GasTank extends StockItem {
   GasTank(String StockCode,int Quantity,double Price)//andrei
    {
        super(StockCode, Quantity, Price);
    }
   
   @Override///!!!!!!!!!
        public String getStockName()
        {
         return "Gas tank";
        }
        @Override///!!!!!!!!!
        public String getStockDescription()
        {
         return ("80 leters");
        }
       
      @Override
    public String toString()
    {     
        return  "Stock Type: "        + getStockName() + "\n" + 
          "Description: "         + getStockDescription() + "\n" +
          "Stock Code: " + StockCode + "\n" +
          "Price without VAT: "       + PriceWithoutVAT(Price) + "\n" +
          "Price with VAT: "           + PriceWithVAT(Price)+ "\n" +
          "Total unit in Stock: "       +Quantity;
    }
   
}
