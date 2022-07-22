/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionreview;
import java.util.Scanner; // Define scanner class 
/**
 *
 * @author Jesse
 */
public class ExceptionReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws OutOfRangeException {
        final int MIN = 25, MAX = 40; 
        Scanner kb = new Scanner(System.in);
        
        OutOfRangeException problem  = new OutOfRangeException("Input value out of range"); 
        
        System.out.print("Enter an integer value between " + MIN + " and " + 
                    MAX + ", inclusive: ");
        
        int value = kb.nextInt();
        
        if(value < MIN || value > MAX){throw problem; }
        
        System.out.println("End of main method"); 
        
    }
    
}
