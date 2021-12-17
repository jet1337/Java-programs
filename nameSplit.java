/*
name split
Separates first name & last names into a list
*/

import java.util.Scanner;

public class nameSplit{
   public static void main(String[] args){
      
      Scanner s = new Scanner(System.in);
      String first = ""; //string of all first names
      String last = "";  //string of all last names
      String entry = " ", scan = ""; //holds user entry
      
      
      System.out.println("Enter names in the form of 'First' 'space' 'Last'" +
                         "\nWhen finished, enter an empty line.");
                         
      do{
         entry = s.nextLine(); //user enters name
         entry = entry.trim();
         if (entry.equals("")) //user enters empty string
            break;
         if (entry.indexOf(' ') != entry.lastIndexOf(' ') || entry.indexOf(' ') < 0){ //user enters multiple spaces or no space
            System.out.println("Ensure your format is 'First name' 'Single Space' 'Last name'");
         continue;
         }
         first = first + entry.substring(0, entry.indexOf(' ')) + ", "; //combining the first names
         last =  last + entry.substring(entry.indexOf(' ') , entry.length()) + ", "; //combining the last names
      } while (!entry.equals(""));
      
      //result block
      if (first.equals("") || last.equals(""))
         System.out.println("Enter your values again, you messed up somewhere");
      else{first = first.substring(0, first.length() - 2);
           last = last.substring(0, last.length() - 2);
           System.out.println(first + "\n" + last);
      }
   }
}