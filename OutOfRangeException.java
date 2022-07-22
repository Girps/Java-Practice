/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionreview;

/**
 *
 * @author Jesse
 */
// Class inherits exception class
public class OutOfRangeException extends Exception{
    
    public  OutOfRangeException(String message)
    {
        super(message);
    }
    
}
