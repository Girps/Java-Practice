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
public class Administor extends Employee {
    public Administor(String name)
    {
        super(name,"Administor"); 
    }
    
    
    @Override 
    public void service()
    {

    
        System.out.println("Hello my name is " + super.getName() + 
                "I am a " + super.getOccupation() + " who provides general Administrator services "); 
    
    }
}

