
package reviewingjava;
import java.util.Scanner; // imports scanner class from std libary
/**
 * write an application that reads values representing a time 
 * duration in hours, minutes, and seconds, and then prints the 
 * equal total number of seconds. (For example, 1 hour, 28 minutes,
and 42 seconds is equivalent to 5322 seconds.
 * 
 */
public class ReviewIngJava 
{   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] Array; 
        Array = new int[3]; 
        int count = 0; 
        int hours, mins,secs; 
        System.out.println("Enter hour minutes and seconds to be "
                + " converted into seconds"); 
        
        String line = scan.nextLine(); 
        
        Scanner scanLine = new Scanner(line);
        scanLine.useDelimiter(":"); // Parse when token is delimted by : 
        while(scanLine.hasNext())
        {
            if(scanLine.hasNextInt())
            {
                    Array[count++] = scanLine.nextInt(); 
            } 
        }
        System.out.println("input recieved\nhours: " + Array[0] + 
                "\nminutes: " + Array[1] + "\nseconds: " + Array[2]); 
        int seconds = Array[2]; 
        seconds += convertToSeconds(Array[0],0);
        seconds += convertToSeconds(Array[1],1);

        System.out.println("In seconds: " + seconds); 
        
        // Close scanner class
        scanLine.close(); 
        scan.close(); 
        
    }
    
    
    public static int convertToSeconds(int time, int  type)
    {
        final int seconds = 60; 
        int result = (type == 0) ? (60 * 60 * time) : (60 * time);
        return result; 
    }
    
    
   
}
