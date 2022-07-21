/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pp.pkg5.pkg8;
import java.lang.String; // Where we get the string class
/**
 *
 * @author Jesse
 */
public class Flight
{
    // Private instance data declaration
    private int num; 
    private String name; 
    private String origin; 
    private String destination; 
    
    // Default constructor 
    Flight()
    {
        this.num = 0; 
        this.name = "N/A"; 
        this.origin = "N/A"; 
        this.destination = "N/A"; 
    }
    
    // Deep copy constructor
    Flight(Flight arg)
    {
        this.destination = arg.destination;
        this.name = arg.name;  
        this.num  = arg.num; 
        this.origin = arg.origin; 
    }
    
    
    // Overloaded constructor takes in 4 arguments initialzes data members
    Flight(int num, String name, String origin, String destination)
    {
       this.num = num; 
       this.name = name; 
       this.origin = origin;
       this.destination = destination; 
    }
    
    // Declare and define Accessor methods
    int getNumber(){return num;}
    String getName(){return name;}
    String getOrigin(){return origin;}
    String getDestination(){return destination;}
    
    // Declare and define mutators methods
    void setNumber(int num){this.num = num;}
    void setName(String name){this.name = name;}
    void setOrigin(String origin){this.origin = origin;}
    void setDestination(String destination){this.destination = destination;}
    
    
    // Override toString method inheirted from object super class
    @Override 
    public String toString()
    {
        String result = "";
        result = result.concat("Flight number: " + Integer.toString(this.num) + 
                "\nName: " + this.name  + "\nOrigin: " + this.origin + 
                "\nDestination: " + this.destination);
        return result;
    }
}