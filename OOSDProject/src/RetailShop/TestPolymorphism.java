package RetailShop;
/*
You do not need to edit the other three classes only add polymorphism and the other thing to this class
*/
import java.util.Scanner;
public class TestPolymorphism {
    
 public static void itemInstance(StockItem stockArray[]){

System.out.println("Printing item stock information:");
for (int i = 0; i<3; i++){
    stockArray[i].toString();
    System.out.println(stockArray[i]);
    System.out.println(" ");
        
    System.out.println("Increasing 10 more units");
    stockArray[i].addStock(10);
    System.out.println(stockArray[i]);
    System.out.println(" ");
       
    System.out.println("Sold 2 units");
    stockArray[i].sellStock(2);
    System.out.println(stockArray[i]);
    System.out.println(" ");
        
    System.out.println("Set new price 100 per unit");
    stockArray[i].SetNewPrice(100);
    System.out.println(stockArray[i]);
    System.out.println(" ");
        
    System.out.println("Increasing 0 more units");
    stockArray[i].addStock(0);
    System.out.println();
   
}

 }

 public static void main(String[] args) {
//======================Variable and object definition==================
 Scanner input = new Scanner(System.in);
  
 String engineStockCodeInput = " ";
 int engineStockAmountInput=0;
 double enginePriceInput=0;
 
  String gasTankStockCodeInput = " ";
 int gasTankAmountInput=0;
 double gasTankPriceInput=0;
 
  String tirePartStockCodeInput = " ";
 int tirePartStockAmountInput=0;
 double tirePartPriceInput=0;
 
//=================User Input Engine======================
System.out.print("UserInput Engine: StockCode ");
engineStockCodeInput = input.nextLine();

System.out.print("UserInput Engine: Stock Ammount ");
engineStockAmountInput = input.nextInt();

System.out.print("UserInput Engine: Price ");
enginePriceInput = input.nextDouble();
System.out.println(" ");

//=================User Input Gas Tank======================
input.nextLine();//Consumes extra line

System.out.print("UserInput Gas Tank: StockCode ");
gasTankStockCodeInput = input.nextLine();

System.out.print("UserInput Gas Tank: Stock Ammount ");
gasTankAmountInput = input.nextInt();

System.out.print("UserInput Gas Tank: Price ");
gasTankPriceInput = input.nextDouble();
System.out.println(" ");

//=================User Input Tires======================
input.nextLine();//Consumes extra line

System.out.print("UserInput Tires: StockCode ");
tirePartStockCodeInput = input.nextLine();

System.out.print("UserInput Tires: Stock Ammount ");
tirePartStockAmountInput = input.nextInt();

System.out.print("UserInput Tires: Price ");
tirePartPriceInput = input.nextDouble();
System.out.println(" ");
//=====================Polymorphic array definition===========================
 StockItem [] stockArray = new StockItem[4];
 
stockArray[0] = new Engine(engineStockCodeInput, engineStockAmountInput, enginePriceInput);
stockArray[1] = new GasTank(gasTankStockCodeInput, gasTankAmountInput, gasTankPriceInput);
stockArray[2] = new TirePart(tirePartStockCodeInput, tirePartStockAmountInput, tirePartPriceInput);

//====================passing data over to method=============================
itemInstance(stockArray);
 }
}
