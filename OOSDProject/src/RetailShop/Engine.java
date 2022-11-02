/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
CreaTE AN OBJECT ARRAY WITH THE THREE CLASSES IN TESTPOLYMORPHISM
IN TEST POLYMORPHISM CREATE A WAY FOR USER TO CHOOSE WHICH CLASS THEY WOULD LIKE TO PUT DATA INTO AND GET AN OUTPUT.
*/
package RetailShop;

public class Engine extends StockItem
{
    Engine(String StockCode,int Quantity,double Price)//andrei
    {
        super(StockCode, Quantity, Price);
    }
    
    @Override///!!!!!!!!!
        public String getStockName()
        {
         return "Engine";
        }
        @Override///!!!!!!!!!
        public String getStockDescription()
        {
         return ("v8 4 stroke");
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
