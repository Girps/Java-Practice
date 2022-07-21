/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancereview;

/**
 *
 * @author Jesse
 */

// Adivce class inheirts data memebers and methods from thought class
public class Advice extends thought
{
    public Advice()
    {
        super(); // call default of thought class 
        System.out.println("Adivce construct called"); 
    }
    
    
    @Override
    public  void message()
    {
        System.out.println("Im a Advice message"); 
    }
    
    
}
