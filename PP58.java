/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg5.pkg8;

//Design and implement a class called Flight that represents an
//airline flight. It should contain instance data that represents the
//airline name, flight number, and the flight’s origin and destination
//cities. Define the Flight constructor to accept and initialize all
//instance data. Include getter and setter methods for all instance
//data. Include a toString method that returns a one-line description of the flight.
//Create a driver class called FlightTest, whose
//main method instantiates and updates several Flight objects.


public class PP58 {

   
    public static void main(String[] args) {
        Flight delta = new Flight(5,"Delta","Phoenix AZ", "New York NY"); 
        Flight def = new Flight(); 
        System.out.println(delta);
        System.out.println(def+ "\n"); 
        
        Flight cpy = new Flight(delta);
        System.out.println(cpy);
        cpy.setName("Name change");
        
                System.out.println(cpy + "\n");
                System.out.println(delta);
                                shareAlias(cpy,delta); 

                cpy = delta; // Shallow copy reference share sam object
                shareAlias(cpy,delta); 
       
    }
    
    
    public static void shareAlias(Flight A, Flight B)
    {
        if(A == B)
        {
            System.out.println("References share same address "); 
        }
        else
        {
                        System.out.println("References DO NOT share address "); 

        }
    }
}
