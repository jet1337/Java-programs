// Feel free to add here any import statements that you need
import java.util.*;

/** 
   This class models information about a list of subscriptions
   while keeping track of the total cost and available budget.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
**/
/*
   We want to modify the class declaration line below
   so that our class inherits from the SubscriptionList class.
*/
public class BudgetFriendlySubscriptionsList extends SubscriptionsList{

   /* 
      Define the following private attributes;
         budget   of data type   double
         cost     of data type   double
   */
   private double budget;
   private double cost;
   

   /* 
      Provide the code for the following no-arg constructor
      so that it calls this class' 1-arg constructor with
      a default budget value of 15.0      
   */
   public BudgetFriendlySubscriptionsList(){
      this(15.0);
   }



   /* 
      Provide the code for the following 1-arg constructor
      so that it initializes the cost attribute to 0.0 (.5 point).
      If the budget parameter is greater or equal to 0.0, use it
      to initialize the budget attribute. Otherwise, initialize
      the budget attribute to 15.0
   */
   public BudgetFriendlySubscriptionsList(double budget){
      if (budget < 0)
         this.budget = 0;
      else
         this.budget = budget;
      this.cost = 0.0;
   }



   /* 
      Provide the code for the following method so that it checks
      that all the elements in the ArrayList are of type 
      PaidSubscription. If even a single element is not of that type,
      then simply return from this method.
      
      
      Otherwise, store all the elements of the ArrayList into a new
      array of appropriate size (.5 point), sort it (.5 point),
      then clear the contents of your ArrayList (.5 point),
      and finally add the elements from your array into the ArrayList
      
   */
   public void sort(){
      for(Subscription element : this.list){
         if (!(element instanceof PaidSubscription))
            return;  
      }
      Subscription[] temp = new Subscription[list.size()];
      list.toArray(temp);
      Arrays.sort(temp);
      this.list = new ArrayList<>(Arrays.asList(temp));
       
   }
   
   
   
   /* 
      Provide the code for the following method so that it first
      starts by sorting the ArrayList then return the
      string description of first object in that ArrayList .
   */
   public String mostExpensive(){
      Subscription[] temp = new Subscription[list.size()];
      list.toArray(temp);
      Arrays.sort(temp);
      this.list = new ArrayList<>(Arrays.asList(temp));
      
      Collections.reverse(list);
      return (list.get(0)).toString();
   }
   
   

   /*
   
   Provide the code for the following method so that it:
      -  just adds to the ArrayList the subscription passed as parameter
         if it is not of type PaidSubscription 
      -  If it is of type PaidSubscription, then only add it if its price
         will not put us over our budget.
      -  If you end up adding it, also update the cost attribute 
      */
   
   public void add(PaidSubscription s){
      if(s instanceof PaidSubscription){
         if (s.getPrice() + this.cost < this.budget){
               list.add(s);
               this.cost += s.getPrice();
               return;
         }
      }
      else
         list.add(s);
      
    }
   
   

   /* 
      Provide the code for the following toString method so that it
      uses the superclass toString method and returns a String describing
      this object in the following format:
      
      "Budget-Friendly Subscriptions list:
      	-	Subscription to MeTube (Home of the selfies vids): $17.0 every month
      	-	Subscription to Mandalorian Channel (Some other stuff too): $79.0 every year
      Total cost is $96.0 out of $150.0 budgeted
      "
      
      Please note the added information before and after 
      the string returned by the superclass' toString method.
   */
   public String toString(){
      System.out.print("Budget-Friendly ");
      super.toString();
      return "Total cost is $" + this.cost + " out of $" + this.budget + " budgeted";
   }
   
}// end class
