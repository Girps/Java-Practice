/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp7.pkg5;

/**
 *
 * @author Jesse
 */
// Class not an object but a class of static methods for computations
public class myMath
{
    
    
    public static double mean(int[] disNumber)
    {
        double result = 0; 
        double summation =0 ;
        int n = disNumber.length; 
        // summation 
        for(int i = 0; i < disNumber.length; ++i )
        {
            summation += disNumber[i]; 
        }
        
        // Got summation now get mean 
        result = summation / disNumber.length;
        
        return result; 
    }
 
    
    public static double std(int[] disNumber)
    {
        double result = 0; 
        double summation = 0; 
        int n = disNumber.length; 
        double mean = mean(disNumber); 
        for(int  i = 0; i< disNumber.length ;++i)
        {
            summation += Math.pow( (disNumber[i] - mean) , 2); 
        }
         
        summation /= (n -1); 
        
        result = Math.sqrt(summation); 
        
       return result;  
    }
}