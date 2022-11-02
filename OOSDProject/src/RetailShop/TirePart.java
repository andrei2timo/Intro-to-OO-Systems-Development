/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailShop;

/**
 *
 * @author user
 */
public class TirePart extends StockItem{
    
    TirePart(String code,int quantity,double price)//andrei
    {
        super(code, quantity, price);
    }
    
    @Override///!!!!!!!!!
        public String getStockName()
        {
         return "Tire";
        }
        @Override///!!!!!!!!!
        public String getStockDescription()
        {
         return ("Winter Tires");
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
