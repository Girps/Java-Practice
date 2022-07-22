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
public class Receptionist extends Employee  {
    public Receptionist(String name)
    {
        super(name,"Receptionist"); 
    }
    
    @Override
    public void service()
    {
    
        System.out.println("Hello my name is " + super.getName() + 
                "I am a " + super.getOccupation() + " who provides general Receptionist services "); 
    
    }
    
}
