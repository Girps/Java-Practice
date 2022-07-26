/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp10.pkg2;
import java.lang.RuntimeException; // Get runtime class

/**
 *
 * @author Jesse
 */
public class StringTooLongException extends RuntimeException
{
    // public constructor
    public StringTooLongException(String arg)
    {
        super(arg); 
    }
    
   
    
}


