/*
invoice test
Test implementation of InvoiceItem class
*/
public class invoiceTest{
   
   public static void main(String[] args){
      /*
      Write your tests in this main method.
      You will be graded on the thoroughness of your tests; 
         1 point  main code tests each of the available methods at least once, 
                  this includes testing object creation with all available constructors
         1 point  In addition, methods are tested on parameters that they should reject
                  or handle as special cases.
         1 point  All tests result in clear information being displayed on the screen
                  so that, by just reading the programs' output, we can understand exactly
                  what has been tested, with what values, and what was the result or
                  consequences of running the test.
      */
      System.out.println("Starting the testing of the InvoiceItem class...");
      
      InvoiceItem test1 = new InvoiceItem(); //test of default constructor
      InvoiceItem test2 = new InvoiceItem("Shrek","Action Figure, Shrek is love Shrek is life",5,69.00); //test of constructor
      
      System.out.println("\nTest of getTotalPrice method\n\ttest1: $" + test1.getTotalPrice() +
                            "\n\ttest2: $" + test2.getTotalPrice()); //getTotalPrice test
                            
      System.out.println("Test of getUnitPrice method\n\ttest1: $" + test1.getUnitPrice() +
                            "\n\ttest2: $" + test2.getUnitPrice()); //getUnitPrice test
                            
      System.out.println("\nTest of increaseQuantity method"); //increaseQuantity tests
      System.out.println("\tQuantity before increase: " + test2.getQuantity());
      System.out.println("Limit Test, v == -1");
         test2.increaseQuantity(-1); //negative increase
      System.out.println("Output test, v == 3");   
         test2.increaseQuantity(3); //positive increase
      System.out.println("\tQuantity after proper increase: " + test2.getQuantity());
      
      System.out.println("\nTest of decreaseQuantity method"); //decreaseQuantity tests
      System.out.println("\tQuantity before decrease: " + test2.getQuantity());
      System.out.println("Limit Test, v == -1");
         test2.decreaseQuantity(-1); //negative decrease
      System.out.println("Limit test, v == 9");
         test2.decreaseQuantity(9);
      System.out.println("Output test, v == 3");   
         test2.decreaseQuantity(3); //positive decrease
      System.out.println("\tQuantity after proper decrease: " + test2.getQuantity());
      
      System.out.println("\nTest of toString method");
      System.out.println("Default Constructor\n\t" + test1.toString());
      System.out.println("4-Arg Constructor\n\t" + test2.toString());
   }
   
} // end public class
