/*
largest vector
checks for the largest vector of two arrays 
*/

import java.util.Arrays;

public class largestVector{
   
   /**
      This method returns 1 if vector v1 is the "largest", 2 if it is vector v2,
      or 0 otherwise.
      
      We define "largest" as follows; 
      .  If one of the vector has more elements than the other, it is the largest one.
      .  If both are the same size, then we look at every element one by one in order.
      .  As soon as one of the two vectors has an element that is > than the corresponding
         element from the other vector, then it is recognized as the "largest" one by our method.
   **/
   public static int largest(int[] v1, int[] v2){
      if (v1.length > v2.length) //length comparison
         return 1;
      if (v2.length > v1.length)
         return 2;
      for (int i = 0; i < v1.length; i++){ //element comparison
         if (v1[i] == v2[i])
            continue;
         if (Math.max(v1[i], v2[i]) == v1[i])
            return 1;
         else
            return 2;
      }
      return 0; //default return statement
   }// end method largest
   
   
  
   public static void main(String[] args){
      System.out.println("Testing your method largest(...)");
      
      int[][] testVectors1 = {
         {1,2,3},
         {1,2,3,4},
         {1,2,3},
         {1,2,3}, 
         {2,3,4}
      };
      
      int [][] testVectors2 = {
         {1,2,3,4},
         {1,2,3},
         {1,2,3},
         {2,3,4},
         {1,2,3}         
      };
      
      int [] expectedOutcomes = {
         2, 1, 0, 2, 1
      };
      
      if((expectedOutcomes.length != testVectors2.length)
         ||(expectedOutcomes.length != testVectors1.length)
         ||(testVectors1.length != testVectors2.length)){
         System.out.println("All tables must have the same # of tests");
         System.exit(-1);
      }// end if
      
      int nTests = expectedOutcomes.length;
      
      for(int test=0; test < nTests ; test++){
         int observedOutcome = largest(testVectors1[test], testVectors2[test]);
         System.out.print("\tTest #" + test + " with vectors " 
               + Arrays.toString(testVectors1[test]) + " and " + Arrays.toString(testVectors2[test]));
         if(observedOutcome == expectedOutcomes[test])
            System.out.println(" SUCCEEDED");
         else
            System.out.println(" FAILED");
      }// end for loop
   }// end main method
} // end class