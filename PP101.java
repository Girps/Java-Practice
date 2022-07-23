/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp10.pkg1;
import java.util.Scanner; // Get scanner class
//esign and implement a program that reads a series of 10 integers 
//from the user and prints their average. Read each input
//value as a string, and then attempt to convert it to an integer
//using the Integer.parseInt method. If this process throws a
//NumberFormatException (meaning that the input is not a valid
//number), print an appropriate error message and prompt for the
//number again. Continue reading values until 10 valid integers
//have been entered.
public class PP101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr = new int[10]; 
        int count = 0; 
        Scanner scan = new Scanner(System.in); 
        Scanner parseLine; 
        String line;
        int value = 0; 
        
        do
        {
           try
           { 
               System.out.println("\nEnter ten intgers to put in array\n"); 
           line = scan.nextLine(); // Get line
           parseLine = new Scanner(line); 
            // Now parse each integer 
          
           for(int i = 0; i < arr.length; ++i)
           {
             
            arr[i] = Integer.parseInt(parseLine.next());
            ++count; 
           }
           }
           catch(java.lang.NumberFormatException problem)
           {
               System.err.println("Wrong format");
               count = 0; 
           }
           catch(java.lang.Exception e)
           {
               System.err.println("Exception caught");
           }
            
           // print 
           for(int v: arr)
           System.out.print(" " + v); 
            
        }while(count != arr.length); 
      
        
    }
    
}
