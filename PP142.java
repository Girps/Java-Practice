/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp14.pkg2;
import java.util.Stack; // Get the stack class
import java.util.Scanner; // get scanner class
/**
 *
 * @author Jesse
 */
public class PP142 {

//    PP 14.2 Design and implement an application that reads a sentence from
//the user and prints the sentence with the characters of each
//word backwards. Use a stack to reverse the characters of each
//word.
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> line = new Stack<String>(); 
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Enter a sentenced to be reversed"); 
        String sent = scan.nextLine(); 
        
        // Push characters onto the stack 
        for(int i =0; i < sent.length();++i)
        {
            line.push(Character.toString(sent.charAt(i))); // converts char to String type
        }
        
        // Now each character on the stack now pop 
        String backwards = ""; 
        
        while(line.isEmpty() == false)
        {
            backwards = backwards.concat(line.pop());
        }
        
        System.out.println(backwards); 
        
    }
    
}
