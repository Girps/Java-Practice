/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp10.pkg2;
import java.util.Scanner; // get scanner class
//Design and implement a program that creates an exception class
//called StringTooLongException, designed to be thrown when
//a string is discovered that has too many characters in it. In the
//main driver of the program, read strings from the user until the
//user enters "DONE". If a string is entered that has too many characters (say 20)
//, throw the exception. Allow the thrown exception to terminate the program.
public class PP102 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String line = null; 
       
       // Ask for string from client
       
      
       try{ 
       System.out.println("Input a string less than or equal to 20 characters\n");
       
       line = scan.nextLine(); 

       if(line.length() > 20)
       {
           throw new StringTooLongException("String over 20 characters"); 
       }
       }
       catch(java.lang.RuntimeException prob)
       {
           System.out.println(prob); 
       }
       finally
       {
           System.out.println("Program terminated "); 
       }
       
    }
    
}
