/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdate;
import java.util.Random; 
import java.io.*; // deffine all classes
/**
 *
 * @author Jesse
 */
public class TestDate {

    /**
     * @param args the command line arguments
     */
    // Checked excpetion must be appended to function header
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        final int MAX = 10; 
        int value; 
        String file = "test.dat"; 
        
        Random rand = new Random(); 
        
        FileWriter fw = new FileWriter(file); 
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        for(int line = 1; line <= MAX; line++)
        {
            for(int num = 1; num <= MAX; ++num)
            {
                value = rand.nextInt(90) + 10; 
                outFile.print(value + " "); 
            }
            outFile.println(); 
        }
        
        outFile.close(); 
    }
    
}
