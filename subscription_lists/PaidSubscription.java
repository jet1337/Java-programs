// Feel free to add here any import statements that you need
import java.util.*;


/** 
   This class models information about a paid subscription.
   It is a subclass of the Subscription class.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
**/
/* 
   We want to modify the class declaration line below
   so that our class:
      1. inherits from the Subscription class (.5 point)
      2. implements the comparable interface (.5 points)
   Please note that, you may wait to implement item 2 above
   until you are ready to complete the implementation of the compareTo method
   in task #9 below.
*/
public class PaidSubscription extends Subscription
                              implements Comparable<PaidSubscription>{
   
   /* 
      Define the following private attributes;
         price       of data type   double
         renewal     of data type   String
   */
   private double price;
   private String renewal;


   /* 
      Provide the code for the following 4-args constructor so that it
      initialize the attributes appropriately. Do not modify the name
      of the parameters.
      
      Call the superclass' 2-args constructor with the appropriate arguments.
      
      
      Check that the parameter renewal is equal to one of the following strings:
         "week", "month", or "year"
      If it is, then assign its value to the corresponding attribute.
      If it is not, then assign "month" as default and ignore the parameter value.   
      
      
      Since a PaidSubscription can not be free, check that the price is greater
      than $0.0. If it is not, then assign $1.0 as the default price instead of
      using the parameter value.
        
   */
   public PaidSubscription(String serviceName, String description, double price, String renewal){
      super(serviceName, description);
      if (price < 0.0)
         this.price = 1.0;
      else
         this.price = price;
      if(renewal.equals("week")||renewal.equals("year")||renewal.equals("month"))
         this.renewal = renewal;
      else
         this.renewal = "month";
   }
   
   
   
   /* 
      Provide the code for the following 3-args constructor so that it
      calls this class' 4-args constructor with the appropriate arguments
      so that we end up with "" as description.
   */  
   public PaidSubscription(String serviceName, double price, String renewal){
      this(serviceName, "", price, renewal);
   }
   
   
   
   /* 
      Provide the code for the following 3-args constructor so that it
      calls this class' 4-args constructor with the appropriate arguments
      so that we end up with "month" as renewal.
   */
   public PaidSubscription(String serviceName, String description, double price){
      this(serviceName, description, price, "month");
   }

   
   
   /* 
      Provide the code for the following 2-args constructor so that it
      calls this class' 4-args constructor with the appropriate arguments
      so that we end up with "month" as renewal, and "" as description.
   */
   public PaidSubscription(String serviceName, double price){
      this(serviceName, "", price, "month");
   }
   
   
   
   /* 
      Provide the code for the following getter method so that it
      returns the value of the price attribute.
   */
   public double getPrice(){
      return this.price;
   } 

   
   
   /* 
      Provide the code for the following toString method so that it
      uses the superclass toString method and returns a String
      describing this object in the following format:
      
      "Subscription to Microsoft Office (with OneDrive): $99.9 every year"
      
      In the above example, the service name is "MicrosoftOffice"
      and the description is "with OneDrive", the price is 99.9
      and renewal is "year".
   */
   public String toString(){
      return super.toString() + ": $" + this.price + " every " + this.renewal;
   }
   
   
   
   /* 
      Provide the code for the toCompare method required for this class
      to implement the comparable interface. The comparison will be 
      based on the price attribute.
   */
   public int compareTo(PaidSubscription s){
      if (this.getPrice() == s.getPrice())
         return 0;
      else if (this.getPrice() < s.getPrice())
         return -1;
      else
         return 1;
   }
   
}// end class
