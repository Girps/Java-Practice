/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;
import java.io.*; 
import java.util.Scanner; 
/**
 *
 * @author Jesse
 */
public class FIleExample {
    // Throws an excpetion if file is not found 
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner scanFile = new Scanner(new File("lilst.txt")); 
        Scanner urlScan; 
        // Reacd and process each line of the file
        while(scanFile.hasNext())
        {
            // Gets the line
            String line = scanFile.nextLine(); // consumes line and returns a string
            System.out.println("URL: " + line );
            
            urlScan = new Scanner(line); // reads input from this string
            // Parse a string delimited with '/'
            urlScan.useDelimiter("/"); 
            
            while(urlScan.hasNext())
            {
                // Consumes each string delimted by '/' 
                System.out.println("\n " + urlScan.next()); 
            }
            System.out.println(); 
        }
        
    }
    
}
