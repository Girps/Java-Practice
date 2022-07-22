/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp8.pkg2;

/*Abstract Emplyee class cannot be instantaited and is not full 
    defined until inherited by dervied classes */ 
public abstract class Employee {

    private String occupation; 
    private String name; 
   
    
    // Parameterized constructor 
    Employee(String name, String occupation)
    { 
        this.occupation = occupation;
        this.name = name; 
    }
    
    
    
    // Accesoor method returns name of employee 
    public String getOccupation ()
    {
        return occupation; 
    }
    
    // Accessor method return string name 
    public String getName()
    {
        return name; 
    }
    
    // Abstract method defined in derived classes 
    public abstract void service(); 
}


