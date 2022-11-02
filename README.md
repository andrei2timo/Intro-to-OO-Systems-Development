# Intro-to-OO-Systems-Development

Imagine a Car Parts and Accessories shop, which requires a software system to keep track
of stock items and prices. The shop will sell different kinds of stock items. However, to start
with, you have been tasked with designing and implementing a class called StockItem with
the following properties.
    • An instance (object) of the StockItem class represents a particular item which the
    shop sells, with a string representing fixed stock code, an integer representing
    variable quantity in stock and a double representing variable price of the stocked
    item.
    
    • A constructor that creates a Stock Item with the specified quantity, price, and the
    fixed stock code.
    
    • All the appropriate ‘setters’ and ‘getters’ methods, including a getStockName()
    method which returns the string "Unknown Stock Name" and a getStockDescription()
    method which returns the string "Unknown Stock Description".
    • An addStock() method that increases the stock level by the given amount. If the
    value is less than one or the stock exceeds 100, a suitable error message should be
    printed.
    
    • A sellStock() method that attempts to reduce the stock level by the given amount. If
    it is less than one, a suitable error message should be printed. If the amount is
    otherwise less than or equal to the stock level, then the reduction is successful and
    true is returned. Else there is no effect, but false is returned.
    
    • A getVAT() method that returns the standard percentage VAT rate, e.g., you can use
    17.5
    • Appropriate ‘setters’ method for price (without VAT) and ‘getters’ methods for price
    with and without VAT
    
    • A method named toString() that returns a string giving the stock code, the stock
    name, the description, the quantity in stock, the price before VAT and the price after
    VAT. It must use the appropriate methods above to obtain the stock name,
    description, quantity and prices. 
    
Task 1.1. Design and draw the corresponding UML class diagram of the StockItem class
described above (no UML modelling tool is required, you can just draw using a simple editor,
e.g., MS Word).

Task 1.2. Code and Test it! (This is recommended and purely for your benefit! This will
help you in producing some working code before proceeding to the next step in Part-II.
However, you can directly proceed to Part-II.)

Implement the above class and test it with a program called TestStockItem. That is, your
TestStockItem class will contain the main() method, which you have known and perhaps
practiced many similar programs in the practical lab exercises.
You should create some instances of StockItem class, add stock, sell some stock and change
the price, whilst printing out the items in between. 
