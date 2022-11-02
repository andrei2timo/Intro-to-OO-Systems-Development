/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailShop;


public class StockItem
{
  String StockCode;
  public int Quantity;
  public double Price;
    StockItem(String StockCode,int Quantity,double Price)
    {
        this.StockCode=StockCode;
        this.Quantity=Quantity;
        this.Price=Price;
    }
    public void SetNewPrice(double Price)
    {
        this.Price=Price;
    }
    public String getStockName()
    {
       return "Unknown Stock Name";
    }
    public String getStockDescription()
    {
         return "Unknown Stock Description";
    }
    public void addStock(int StockLevel)
    {
        Quantity=Quantity+StockLevel;
        if(StockLevel<1 || Quantity>100)
            System.out.println("Increased item must be greater than or equal to one");
    }
    public boolean sellStock(int StockLevel)
    {
        boolean ok=false;
        Quantity=Quantity-StockLevel;
        if(Quantity<1)
            System.out.println("Increased item must be greater than or equal to one");
        else if(Quantity<=StockLevel)
            ok=true;
        return ok;
    }
    public double getVAT()
    {   
        final double VAT=17.5/100;
        return VAT;
    }
    public double PriceWithVAT(double priceWithVat)
    {
        priceWithVat=priceWithVat+priceWithVat*getVAT();
        return priceWithVat;
    }
    public double PriceWithoutVAT(double priceWithoutVat)
    {
        return priceWithoutVat;
    }
    public String toString()
    {   
        return  "Stock Type: "        + getStockName() + "\n" + 
          "Description: "         + getStockDescription() + "\n" +
          "Stock Code: " + StockCode + "\n" +
          "Price without VAT: "       + PriceWithoutVAT(Price) + "\n" +
          "Price with VAT: "           + PriceWithVAT(Price)+ "\n" +
          "Total unit in Stock: "       +Quantity; 
    }
    
     public static void main(String[] args) {
        StockItem stockObject = new StockItem("W101",10,99.99);
        stockObject.toString();
        System.out.println(stockObject);
        System.out.println(" ");
        
        System.out.println("Increasing 10 more units");
        stockObject.addStock(10);
        stockObject.toString();
        System.out.println(stockObject);
        System.out.println(" ");
        
        System.out.println("Sold 2 units");
        stockObject.sellStock(2);
        stockObject.toString();
        System.out.println(stockObject);
        System.out.println(" ");
        
        System.out.println("Set new price 100.99 per unit");
        stockObject.SetNewPrice(100.99);
        stockObject.toString();
        System.out.println(stockObject);
        System.out.println(" ");
        
        System.out.println("Increasing 0 more units");
        stockObject.addStock(0);
    }
}


   
