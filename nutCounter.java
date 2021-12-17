/*
Nut Counter
Adjust the count of various nuts for the squirrel coffers
*/

import java.util.Scanner;

public class nutCounter{
   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      String input = ""; //line input from user stored here
      String part1 = ""; //nut name
      String part2 = ""; //nut count
      int w = 0; //walnuts
      int p = 0; //peanuts
      int a = 0; //almonds
      
      System.out.println("Enter in the format 'nut = 2'\nSelect from 'walnuts' 'almonds' or 'peanuts'");
      System.out.println("Enter 'bye' or 'exit' to quit");
      
      while(true){
      input = s.nextLine();
      input = input.toLowerCase();
      input = input.trim();
      if(input.equals("bye") || input.equals("exit"))
         break; //exit conditions
      if (input.indexOf('=') < 0){
         System.out.println("Syntax Error");
         continue;
      } //back to start of loop if no =
      
      //separation of nut name and nut count
      part1 = input.substring(0, input.indexOf('='));
      part1 = part1.trim();
      part2 = input.substring(input.indexOf('=')+1, input.length());
      part2 = part2.trim();
      
      if(!part1.equals("walnuts") && !part1.equals("peanuts") && !part1.equals("almonds")){
         System.out.println("Sorry, we do not stock up on " + part1);
         continue;
      } //wrong nut type
      
      //updates counts for each nut
      if(part1.equals("walnuts"))
         w = w + Integer.parseInt(part2);
      if(part1.equals("peanuts"))
         p = p + Integer.parseInt(part2);
      if(part1.equals("almonds"))
         a = a + Integer.parseInt(part2);
      
      System.out.println("Our current stocks are: " + p + " peanuts, " +
                           w + " walnuts, " + a + " almonds");
      }//while loop for user inputs
   }//end main method
}//end class