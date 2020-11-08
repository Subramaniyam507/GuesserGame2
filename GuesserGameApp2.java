package com.GuesserGameApp2.subbu;
import java.util.*;

import com.GuesserGameApp.subbu.Guesser;
import com.GuesserGameApp.subbu.Player;
import com.GuesserGameApp.subbu.Umpire;
/**
 * Represents a guesser
 * A guesser guesses a number
 * @author s
 * @version 14.0
 * @since 2020-11-08
 *
 */


class Guesser{
	   int gnum;
	   /**
		* This method collects the number from the Guesser.
		*
		* @param low The lowest permissible value.
		* @param high The highest permissible value.
		* @return the number collected from the Guesser.
		*/
	    int guessNum(int low, int high){
	        System.out.println("Guesser! please guess the number between"+low+" "+"to"+" "+high);
	        Scanner scan=new Scanner(System.in);
	        gnum=scan.nextInt();
	        
	        
	        if(gnum>=low&&gnum<=high){
	            return gnum;
	        }
	        else
	        {
	            System.out.println("Guesser please select the number within the valid range of"+low+"to"+high);
	            return guessNum(low,high);
	        }
	    }
	}
/**
 * Represents a player
 * A player predicts a number
 * @author s
 * @version 14.0
 * @since 2020-11-08
 *
 */
	 class Player{
		
	int pnum;
	/**
	* This method collects the number from the Guesser.
	*
	* @param low The lowest permissible value.
	* @param high The highest permissible value.
	* @return the number collected from the Guesser.
	*/
	
			
			int predictNum(int low,int high)
			{
				System.out.println("\nGame Host:Players! Kindly predict the number the guesser has guessed");
				Scanner scan = new Scanner(System.in);
				pnum=scan.nextInt();
				
				
				if (pnum>=low&&pnum<=high)
				{
				return pnum;
				}
				else
				{
					System.out.println("\nGame Host:Please predict between with in the range not below or above the specified range");
				return predictNum(low,high);
				}
				
			}
		}
	       
	 /*** Represents a umpire
	 * An umpire declares the winner 
	 * @author s
	 * @version 14.0
	 * @since 2020-11-08
	 *
	 */  
	
	
	    class Umpire{
	    int numFromGuesser;
	    int numFromPlayer1;
	    int numFromPlayer2;
	    int numFromPlayer3;
	    public static int low;
		public static int high;
		public  int chances;
		 /**
		 * This method enacts as if a game host is hosting the game.here the umpire decides the lowest to highest range 
		 * all so decides the number of chances the players gets to predict the guessed number.
		 * 
		 * 
		 */
		
	    void decisionOfRangesAndChoices() {
	    	System.out.println("\nGame Host: Hello folks this your favourite game host BINOD KUMAR hosting GuesserGameShow live from StarsSports channel!!"+
	    "\nAs you guys know the rules of this game is simple."+
	    			"\nSo basically there is one UMPIRE who decides the range of the number within which the Guesser has to guess a Number."+
	    "\nThe Umpire also decides the number of chances that would be given to our players to predict the number the Guesser has Guessed."+
	    "\nSo we have three players tonight.If any one of the Players predicts the number correctly that person would be declared WINNER"+
	    "\nThe lucky winner will get a chance to ride with me in CYCLE  back to their house"+
	    "\n All said and done LETS BEGIN THE GAME guys!!!");
	    Scanner scan= new Scanner(System.in);
		System.out.println("\nGame Host:Umpire please select the lowest number of the range");
		low=scan.nextInt();
		System.out.println("\nGame Host:Umpire please select the highest number of the range");
		high=scan.nextInt();
		
		System.out.println("\nGame Host:Umpire please select the maximum number of chances the players get to guess the number");
		chances=scan.nextInt();
		
		
        
	    }
	    /**
		 * This method collects the number from the guesser and stores the number in the NumfromGuesser field.
		 * 
		 * @see Guesser
		 */
	    void collectNumFromGuesser(){
	    	
	        Guesser g=new Guesser();
	        numFromGuesser=g.guessNum(low,high);
	        
	    }
	    /**
		 * This method collects the number from the players and stores the number in the numfromplayer1,numfromplayer2 and numfromplayer3 field.
		 * 
		 * @see Player
		 */
	    void collectNumFromPlayer(){
	        Player p1=new Player();
	        Player p2=new Player();
	        Player p3=new Player();
	        

	        numFromPlayer1=p1.predictNum(low,high);	
	        numFromPlayer2=p2.predictNum(low,high);
	        numFromPlayer3=p3.predictNum(low,high);
	    }
	    /**
		 * This method compares the number predicted by the players 
		 * with number guessed by the Guesser
		 * And also announces the winner if any
		 */
	    void compare(){
	    	
	    	for(int i=chances;i>0;i--)
	        if(numFromPlayer1==numFromGuesser) {
				System.out.println("\nGame Host:player 1 has won the game!!!!!");
			}
			if(numFromPlayer2==numFromGuesser) {
				System.out.println("\nGame Host:player 2 has won the game!!!!!");
			}
			if(numFromPlayer3==numFromGuesser) {
				System.out.println("\nGame Host:player 3 has won the game!!!!!");
			}
			else if(numFromPlayer1!=numFromGuesser&&numFromPlayer2!=numFromGuesser&&numFromPlayer3!=numFromGuesser ) {
				
	            System.out.println("\n Game Host:All players have lost the game please try again");
	            
			}
	    }
	 }

public class GuesserGameApp2 {
	/**
	 * this is the main method which makes
	 * use of collectNumFromGuesser,collectNumFromPlayer
	 * and compare methods
	 * @param args unused
	 * @see Guesser
	 * @see Player
	 * @see Umpire
	 */
	

		   
		public static void main(String[] args) {
			Umpire u=new Umpire();
			
		
		
			
		
			
	        u.decisionOfRangesAndChoices();
	        
	        u.collectNumFromGuesser();
	        
	      for(int i=u.chances;i>0;i--) {
	        	
	        	
	        u.collectNumFromPlayer();
	        u.compare();
	       
	       
	        	}
	        System.out.println("\nGame Host:all "+" "+u.chances+" "+"tries are over"+
	        	"\nThats it guys bye bye tata");

			
			
		
		
		}
		
	}	



