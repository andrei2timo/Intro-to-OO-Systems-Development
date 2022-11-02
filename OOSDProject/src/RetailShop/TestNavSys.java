package RetailShop;
import java.util.Scanner;

public class TestNavSys {
   public static void main(String[] args){
       String stockCodeInput = "";
       int stockAmountInput = 0;
       double stockPriceInput = 0.0;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Stock Code: Navigation system ");
       stockCodeInput = input.nextLine();
       System.out.print("Stock Ammount: Navigation system ");
       stockAmountInput = input.nextInt();
       System.out.print("Stock Price: Navigation system ");
       stockPriceInput = input.nextDouble();
       
        NavSys s = new NavSys(stockCodeInput,stockAmountInput,stockPriceInput);
        
        System.out.println("Creating a stock with 10 units Navigation system, price 99.99, and item code NS101");
        s.toString();
        System.out.println(s);
        System.out.println(" ");
        System.out.println("Increasing 10 more units");
        s.addStock(10);
        s.toString();
        System.out.println(s);
        System.out.println(" ");
        System.out.println("Sold 2 units");
        s.sellStock(2);
        s.toString();
        System.out.println(s);
        System.out.println(" ");
        System.out.println("Set new price 100.99 per unit");
        s.SetNewPrice(100.99);
        s.toString();
        System.out.println(s);
        System.out.println(" ");
        System.out.println("Increasing 0 more units");
        s.addStock(0);
          
   } 
}