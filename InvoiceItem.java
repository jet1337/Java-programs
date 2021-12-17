import java.util.Date;
/**
   
   This class is meant to model an item on an invoice.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class InvoiceItem{

   /* 
   InvoiceItem attributes
   */ 
   private String name;
   private String description;
   private int quantity;
   private double unitPrice;
   private Date dateRegistered;  

   
   /* 
   InvoiceItem constructor
   */
   public InvoiceItem(String name, String description, int quantity, double unitPrice){
      java.util.Date d = new java.util.Date();
      dateRegistered = d;
      this.name = name;
      this.description = description;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
   }// end constructor with 4 args
  
  
  
   /* 
   Default constructor
   */
   public InvoiceItem(){
      this("Default Item", "...", 0, 0.0);
      /*java.util.Date d = new java.util.Date();
      dateRegistered = d;
      this.name = "Default Item";
      this.description = "...";
      this.quantity = 0;
      this.unitPrice = 0.0;
      */
   }// end no-args constructor 
   
  
   
   /* 
   Price calculation method
   */
   public double getTotalPrice(){
      return this.unitPrice * this.quantity;
   }// end method getTotalPrice
   
   
   
   /* 
   Get current price method
   */
   public double getUnitPrice(){
      return this.unitPrice; 
   }// end method getUnitPrice
   
   
   
   /* 
   Quantity increase method
   */
   public void increaseQuantity(int v){
      if (v < 0){
         System.out.println("-- Desired increase must not be negative --");
         return;
      }else
         this.quantity = this.quantity + v;
   }// end method increaseQuantity
   
   
   
   /* 
   Quantity decrease method
   */
   public void decreaseQuantity(int v){
       if (v < 0||this.quantity - v < 0){
         System.out.println("-- Desired decrease and result must not be negative --");
         return;
      }else
         this.quantity = this.quantity - v;
   }// end method decreaseQuantity
   
   
   
   /* 
   Print item info method
   */
   public String toString(){
      String output = this.name + ": " + this.quantity + " units, $" + this.unitPrice + " per unit (" + this.description + ")";
      return output; // this is not right, replace this with your own code
   }// end method toString
   
   //extra methods
   
   public int getQuantity(){
      return this.quantity;
   }
   
}// end class
