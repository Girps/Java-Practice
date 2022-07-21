/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp7.pkg3;
import java.util.Random; // Get Random class 
import java.util.Scanner; // Get Scanner class
//
//Design and implement an application that creates a histogram
//that allows you to visually inspect the frequency distribution of a
//set of values. The program should read in an arbitrary number of
//integers that are in the range 1 to 100 inclusive; then produce a
//chart similar to the one below that indicates how many input values fell in 
//the range 1 to 10, 11 to 20, and so on. Print one asterisk for each value entered.
public class PP73 {

 
    public static void main(String[] args) {
        int[] repeats = new int[10];
        int size = 0;
        int result = 0; 
        System.out.println("How many number to be determined?");
        Scanner kb = new Scanner(System.in);
        size = kb.nextInt(); 
        Random gen = new Random(); 
        // Gen size amount of data 
        for(int i =0; i < size; ++i)
        {
            result = gen.nextInt(101) + 1; // get a number between 1 to 100
            incArray(repeats,result); // Inc array
        }
        
        // Print the array 
        printResults(repeats); 
        
        
    }
    // Increments 
    public static void incArray(int[] arg, int result)
    {
        if(result < 11 && result > 0)
        {
            ++arg[0]; 
        }
        else if(result < 21 && result > 10)
        {
         ++arg[1]; 
        }
        else if(result < 31 && result > 20 )
        {
         ++arg[2]; 
        }
        else if(result < 41 && result > 30)
        {
            ++arg[3]; 
        }
        else if(result < 51 && result > 40)
        {
            ++arg[4]; 
        }
        else if(result < 61 && result > 50)
        {
            ++arg[5]; 
        }
        else if(result < 71 && result > 60)
        {
            ++arg[6]; 
        }
        else if(result < 81 && result > 70)
        {
            ++arg[7]; 
        }
        else if(result < 91 && result > 80)
        {
            ++arg[8]; 
        }
        else if(result < 101 && result > 90)
        {
            ++arg[9]; 
        }
        else
        {
             
        }
    }
    
    // Print histogram 
    public static void printResults(int[] result)
    {
       int number = 0; 
       for(int it = 0; it < result.length; ++it)
       {
           // Print base on index 
           //a(n) + n(10)
           System.out.print("" + (1 + (it * 10)) + "-" + (10 + (it * 10)) +"|" ); 
           // print * based on number in index
           for(int x = 0; x < result[it]; ++x )
           {
               System.out.print("*"); 
           }
           System.out.println(); // print new line 
       }
    }
    
}
