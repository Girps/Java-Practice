/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlowconsoleapp;
import java.util.Random; // Get random class
import java.util.Scanner; // get scanner class
//Design and implement an application that plays the Hi-Lo
//guessing game with numbers. The program should pick a random number between 1 and 100 (inclusive), then repeatedly
//prompt the user to guess the number. On each guess, report to
//the user that he or she is correct or that the guess is high or low.
//Continue accepting guesses until the user guesses correctly or
//chooses to quit. Use a sentinel value to determine whether the
//user wants to quit. Count the number of guesses and report that
//value when the user guesses correctly. At the end of each game
//(by quitting or a correct guess), prompt to determine whether
//the user wants to play again. Continue playing games until the
//user chooses to stop.
public class HighLowConsoleApp {

    
    public static void main(String[] args)
    {
       // Local data   
        boolean sent = true;
        int guess = 0; 
        String lineInput = null; 
        Scanner kb = new Scanner(System.in); // get input from keyboard 
        int result = 0; 
        
        do
        {
        result = getRandom(); 
        System.out.println("Answer: " + result); 
        System.out.println("Guess random number between 10 - 90 enter 'quit' " + 
                "to terminate program"); 
        
        // Parse input 
        lineInput = kb.nextLine(); 
        
        Scanner praseInt = new Scanner(lineInput);
        
        // Now get the guess 
        while(praseInt.hasNext())
        {
            if(praseInt.hasNextInt())
            {
                guess = praseInt.nextInt(); 
            }
            else
            {
              System.out.println("Int not parsed enter again"); 
              sent = ((praseInt.next())).equals("quit") ? false : true; 
            }
        }
        if(sent == true)
        guessfunc(result,guess); 
        }while(sent == true); 
       
    }
 
    public static int getRandom()
    {
        Random gen = new Random(); // No seed
        int randomNumber = gen.nextInt(101) + 1; // get number between 1 - 100 
        return randomNumber;
    }
    public static void guessfunc(int result, int guess)
    {
        // Guess is high or low 
        if( (result - guess) > 0 ) 
        {
            System.out.println("Low");
        }
        else if (result - guess < 0)
        {
            System.out.println("High"); 
        }
        else{System.out.println("Correct!");}
        
    }
    
}
