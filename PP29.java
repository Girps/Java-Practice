/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.pkg9;
import java.util.*; // imports everthing from the library 

//Write an application that prompts for and reads a double value
//representing a monetary amount. Then determine the fewest
//number of each bill and coin needed to represent that amount,
//starting with the highest (assume that a ten-dollar bill is the maximum size needed). For example, if the value entered is 47.63
//(forty-seven dollars and sixty-three cents), then the program
//should print the equivalent amount as:
//4 ten dollar bills
//1 five dollar bills
//2 one dollar bills
//2 quarters
//1 dimes
//0 nickles
//3 pennies
public class PP29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in); 
        // 7 denominations 
        int[] den = new int[]{1000,500,100,25,10,5,1};
        int[] denNum = new int[7]; 
        System.out.println("Enter amount (47.63) : ");
        float money = scan.nextFloat();
        int remainder = (int)(money * 100F); 
        
        // greedy algo 
        for(int count = 0;remainder != 0;++count)
        {
            // Get the amount den used
            denNum[count] = remainder / den[count];
            // Truncate remainder
            remainder = remainder % den[count]; 
        }
        
        System.out.println(denNum[0] + " Ten dollar bills\n" + denNum[1] + " Five dollar bills\n"
                + denNum[2] + " One dollar bills\n" + denNum[3] + " Quarter\n" + 
                denNum[4] + " Dimes\n" + denNum[5] + " Nickels\n" + 
                denNum[6] + " Pennies");
       
        
    }
    
}
