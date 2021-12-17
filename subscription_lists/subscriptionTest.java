/**
Subscription Test
tests the subscription, paidsubscription, and subscriptionList classes
**/
public class subscriptionTest{
   public static void main(String[] args){
   
      
      display("Displaying list of all free & paid subscriptions");
      
      // create a bunch of subscriptions, both basic and paid
      Subscription[] mixedFreeAndPaidSubscriptions = {
         new PaidSubscription("MeTube", "Home of the selfies vids", 17.0),
         new PaidSubscription("Microsift Suite", 99.0, "year"),
         new Subscription("Libre Office"),
         new Subscription("Oogle Drive", "15Gb"),
         new PaidSubscription("Mandalorian Channel","Some other stuff too",79.0, "year"),
         new PaidSubscription("Emma Zone Prime","It is delivery AND Digiorno",119.0, "year")
      };
      
      // create basic SubscriptionsList
      SubscriptionsList list1 = new SubscriptionsList();
      // add all of the above subscriptions to it
      for(Subscription s : mixedFreeAndPaidSubscriptions)
         list1.add(s);
      // display the whole list
      System.out.print(list1);
      


      display("Displaying budget-friendly list of paid subscriptions only");

      // create a bunch of PaidSubscriptions only
      PaidSubscription[] onlyPaidSubscriptions = {
         new PaidSubscription("Mandalorian Channel","Some other stuff too",79.0, "year"),
         new PaidSubscription("MeTube", "Home of the selfies vids", 17.0),
         new PaidSubscription("Emma Zone Prime","It is delivery AND Digiorno",119.0, "year"),
         new PaidSubscription("Microsift Suite", 99.0, "year")
      };
      // create BudgetFriendlySubscriptionsList
      BudgetFriendlySubscriptionsList list2 = new BudgetFriendlySubscriptionsList(150.0);
      // add all of the above PaidSubscriptions to it
      for(PaidSubscription s : onlyPaidSubscriptions)
         list2.add(s);
      // display the whole list
      System.out.print(list2);
      
      
      
      display("Displaying sorted budget-friendly list of paid subscriptions");

      // see above
      list2.sort();
      // display the whole list
      System.out.print(list2);


      display("Displaying most expensive subscription in budget friendly list of paid subscriptions");
      System.out.println(list2.mostExpensive());      
      
      
   }// end main
   


   public static void display(String msg){
      String dashes = ""; 
      for(int i=0 ; i < msg.length() ; i++)
         dashes += "-";
      System.out.println("\n\n\n" + dashes + "\n"+ msg + "\n" + dashes + "\n");
   }
}// end class
