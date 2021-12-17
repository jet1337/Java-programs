// Feel free to add here any import statements that you need
import java.util.*;


/** 
   This class models information about a list of subscriptions.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
**/
public class SubscriptionsList {
   
   /* 
      Define the following PROTECTED attribute;
      list       of data type   ArrayList of Subscription
      We use protected here so you may freely use this
      attribute in your subclass
   */
   protected ArrayList<Subscription> list;


   /* 
      Provide the code for the following no-args constructor so that it
      initialize the list attribute appropriately. 
   */
   public SubscriptionsList(){
      this.list = new ArrayList<Subscription>();
   }



   /* 
      Provide the code for the following toString method so that it
      returns a String describing this object in the following format:
      
      "Subscriptions list:
      	-	Subscription to MeTube (Home of the selfies vids): $17.0 every month
      	-	Subscription to Microsift Suite: $99.0 every year
      	-	Subscription to Libre Office
      	-	Subscription to Oogle Drive (15Gb)
      	-	Subscription to Mandalorian Channel (Some other stuff too): $79.0 every year
      	-	Subscription to Emma Zone Prime (It is delivery AND Digiorno): $119.0 every year
      "
   */
   public String toString(){
      String result = "";
      for(Subscription s:list){
         result += "\t-\t" + s.toString() +"\n";
      }
      System.out.println("Subscriptions list:");
      return result;
   }   



   /* 
      Provide the code for the following add method so that it
      adds the subscription passed as parameter to your list.
   */
   public void add(Subscription s){
      list.add(s);
   }

}// end class
