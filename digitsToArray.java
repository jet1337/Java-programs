/*
digits to array
takes string numbers and splits them into arrays
*/

import java.util.Arrays;

public class digitsToArray {
   
   /**
      This method takes a non-null and non-empty string made only
      of single-digits values between 0 and 9 (inclusive),
      without spaces or anything else.
      You do not have to verify this, you can assume that your method
      will always be called with such strings.
      
      Examples; "123" or "0"
      
      Your method returns a new array of int values that will hold 
      each of the digits specified in the String, in the order they appeared. 
      
      Example; if the string passed is "123" your returned array
      should contain the int value 1 at index 0, the value 2 at index 1,
      and the value 3 at index 2.
   **/
   public static int[] StringOfDigitsToArray(String str){
      int[] array = new int[str.length()]; //new array to hold string values
      for (int i = 0; i < str.length(); i++){
         array[i] = Integer.parseInt(str.substring(i, i + 1));
      } //end string-parsing for loop
      return array;
   }// end method StringOfDigitsToArray
   
   
   
   /*
      You do not have to modify the main method except if adding more tests helps you ensure
      that your program fulfills all requirements.
   */
   public static void main(String[] args){
      String[] strings= {
         "3",
         "9", 
         "12",
         "123"
      };
      
      int[][] vectors = {
         {3},
         {9},
         {1,2},
         {1,2,3}
      };
      
      System.out.println("\nTesting your method StringOfDigitsToArray(...)");
      if(vectors.length != strings.length){
         System.out.println("All tables must have the same # of tests");
         System.exit(-1);
      }// end if
      
      for(int test=0 ; test < strings.length ; test++){
         int[] observed = StringOfDigitsToArray(strings[test]);
         System.out.print("\tTest #" + test + " with string \"" + strings[test] + "\"");
         System.out.println(" "+ (Arrays.equals(observed, vectors[test])?"SUCCEEDED":"FAILED"));  
      }//end for loop
   }// end main method
} // end class