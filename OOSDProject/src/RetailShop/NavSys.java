/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailShop;
/**
 *
 * @author Anubis
 */
public class NavSys extends StockItem {
     NavSys(String StockCode,int Quantity,double Price)
        {
            super(StockCode,Quantity,Price);///!!!!!!!!!
        }
        @Override///!!!!!!!!!
        public String getStockName()
        {
         return "Navigation system";
        }
        @Override///!!!!!!!!!
        public String getStockDescription()
        {
         return ("GeoVision Sat Nav");
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
