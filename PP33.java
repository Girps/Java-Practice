/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp3.pkg3;
import java.util.Random; // Random class

//Write an application that creates and prints a random phone
//number of the form XXX-XXX-XXXX. Include the dashes in the
//output. Do not let the first three digits contain an 8 or 9 (but
//don’t be more restrictive than that), and make sure that the second set of three digits is not greater than 742. Hint: Think
//through the easiest way to construct the phone number. Each
//digit does not have to be determined separately
public class PP33 {

    public static void main(String[] args) {
        String phone = null; 
       
        phone = getNumber(); 
        System.out.println(phone); 
    }
    
    public static String getNumber()
    {
        String digitsStr = ""; 
        int[] array = {0,0,0,0,0,0,0,0,0,0};
        // No seed set
        Random gen = new Random();
        int count; 
        for(int i = 0; i < 10; ++i)
        {
            switch(i)
            {
                case(3):
                    array[i] = gen.nextInt(8);
                    break; 
                case(4):
                    array[i] = gen.nextInt(5);
                    break; 
                case(5):
                    array[i] = gen.nextInt(3);
                    break;
                default:
           array[i] = (i >= 0 && i <= 2)? (gen.nextInt(8)) : (gen.nextInt(11)); 
            }
        }
                     
        // Now parse digits into string
        
        for(int i = 0; i < 10; ++i)
        {
            digitsStr = digitsStr.concat(Integer.toString(array[i])); 
            if(i == 2 || i == 5){digitsStr = digitsStr.concat("-");}
        }      
        return digitsStr; 
       
    }
    
}
