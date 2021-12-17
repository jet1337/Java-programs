/*
Coin Game
Whoever draws the last coin wins!
*/

import java.util.Scanner;

public class coinGame{
   public static void main(String[]	args){
   
      int whoWon = 0; //keeps	track	of	who won
      int coins =	0;	//number	of	coins remaining
      int take	= 0; //computer coin take
      int whoIsNext = 1; //computer	turn 1, human turn 2
      int youDecide = 0; //human	coin take
      Scanner s =	new Scanner(System.in);	//inputs human coin take
   
      coins	= 21;
   
      //	game loop
      while	(whoWon == 0){
         if	(whoIsNext == 1){
            whoIsNext =	2;	//human goes next
            System.out.println("The number of coins remaining is: " + coins);
            take = (int)(Math.random()	* 3) + 1; //generate	the computer's	move
            System.out.println("The computer takes " + take	+ " coins");
            coins	= coins - take; //deduct computer move	from coins
            if	(coins <= 0){
               whoWon =	1;	//computer wins
               whoIsNext =	0;
            }
         }
         if	(whoIsNext == 2){
            whoIsNext =	1; //computer goes next
            System.out.println("The number of coins remaining is: " + coins);
            System.out.print("Enter a value between 1 and 3, inclusive: ");
            youDecide =	s.nextInt(); //user coins
            while	(youDecide < 1	||	youDecide >	3){ //ensures the	user cannot	bypass this	feature by flipflopping
               while	(youDecide < 1){ //user	entered value < 1
                  System.out.println("You must take at least 1 coin during each turn.");
                  System.out.print("Enter a value between 1 and 3, inclusive: ");
                  youDecide =	s.nextInt();
                  System.out.println();
               }
               while	(youDecide > 3){ //user	entered value > 3
                  System.out.println("You cannot take more than 3 coins during each turn.");
                  System.out.print("Enter a value between 1 and 3, inclusive: ");
                  youDecide =	s.nextInt();
                  System.out.println();
               }
            }
            coins	= coins - youDecide;
            if	(coins <= 0){
               whoWon =	2;
               whoIsNext =	0;
            }
         }
      } //end game loop
   
   //	print	results block
      if	(whoIsNext == 0){
         if	(whoWon == 1){
            System.out.println("The computer won, bow to your AI overlord");
         }
         if	(whoWon == 2){
            System.out.println("The human player won, this time...");
         }
         if	(whoWon < 1	&&	whoWon >	2){
            System.out.println("Nobody won, something went wrong");
         } //end results
      }
   
   } //end of main method
} //end of class