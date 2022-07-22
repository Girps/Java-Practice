/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp8.pkg2;

/**
 *
 * @author Jesse
 */
public class Janitor extends Employee{

    public Janitor(String name)
    {
        super(name,"Janitor"); 
    }
   
    
    @Override
    public void service()
    {
    
        System.out.println("Hello my name is " + super.getName() + 
                "I am a " + super.getOccupation() + " who provides general Janitor services "); 
    
    }
    
}
