/*
Stars
Prints the desired amount of stars, decreasing by 1 for each of the desired amount of lines
*/

import java.util.Scanner;

public class stars{
   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      int stars = 0; //number stars
      int lines = 0; //number lines
      int reset = 0; //control for stars
      
      //gets the stars value from user
      System.out.print("Enter how many stars to start with: ");
      stars = s.nextInt();
      System.out.println();
      
      //gets the lines value from user
      System.out.print("Enter how many lines total: ");
      lines = s.nextInt();
      System.out.println();
      
      //makes user enter the proper values
      while (stars <= lines){
         System.out.println("Make sure the number of stars is greater than the number of lines");
         System.out.print("Enter how many stars to start with: ");
         stars = s.nextInt();
         System.out.println();
         System.out.print("Enter how many lines total: ");
         lines = s.nextInt();
         System.out.println();
      } //end first while loop
      
      reset = stars; //variable to decrement stars
      
      //displays stars in loop
      while (lines > 0){
      --lines;
      //--reset;
         //stars per line control
         while (stars > 0){
         System.out.print("*");
         --stars;
         } //end of star print loop
      System.out.println();
      stars = --reset;
      } //end of line loop
   } //end of main method
} //end of class