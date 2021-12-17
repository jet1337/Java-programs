/*
IE4
Performs calculations and typecasting operations
*/

import java.util.Scanner;

public class dataTypes{
   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      //task 1 variables
      long value1 = 0; //value for task 1
      long sum = 0; //sum of digits
      long hold = 0; //holds the digits from division
      
      //task 2 variables
      int value2 = 0; //max int value
      
      //task 3 variables
      int value3 = 0; //user intered decimal number
      int bin = 0; //holds %2 calculation
      String x = "";
      int deci = 0b0;
      
      System.out.println("Task #1 started"); //begin task 1
      System.out.print("Enter a number: ");
      value1 = s.nextLong();
      while (value1 > 0){
         hold = (long)(value1 % 10);
         sum = (long)(sum + hold);
         value1 = (long)(value1 / 10);
      }
      System.out.println(sum);
      System.out.println("Task #1 complete");//end task 1
      
      System.out.println("Task #2 started"); //begin task 2
      while (value2 >= 0){
         ++value2;
      }
      --value2;
      System.out.println("Largest possible integer value: " + value2);
      System.out.println("Task #2 complete"); //end task 2
      
      System.out.println("Task #3 started"); //begin task 3
      System.out.print("Enter the number you wish to convert to binary: ");
      value3 = s.nextInt();
      while (value3 > 0){
         bin = value3 % 2;
         value3 = value3 / 2;
         x = bin + "" + x;
      }
      //System.out.println(x);
      deci = Integer.parseInt(x);
      System.out.println(deci);
      System.out.println("Task #3 complete");
      
   } //end of main method
}//end of class