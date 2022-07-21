/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg5.pkg6;
import java.util.Scanner; // Get our scanner class
//Design and implement a class called Box that contains instance
//data that represents the height, width, and depth of the box. Also
//include a boolean variable called full as instance data that represents 
//if the box is full or not. Define the Box constructor to accept and initialize 
//the height, width, and depth of the box. Each
//newly created Box is empty (the constructor should initialize full
//to false). Include getter and setter methods for all instance data.
//Include a toString method that returns a one-line description of
//the box. Create a driver class called BoxTest, whose main
//method instantiates and updates several Box objects.

public class PP56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Box A = new Box(1,2,3);
              Box B = new Box(1,2,3);
       Box C = new Box(1,2,3);
       Box D = new Box(1,2,3);
       Box E = new Box(1,2,3);

       System.out.println(A.getCount()); 
        
    }

    
}
