/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp3.pkg5;
import java.util.Scanner; // get scanner class
import java.text.DecimalFormat; // gET DecimalFormat class
//Write an application that reads the radius of a sphere and prints
//its volume and surface area. Use the following formulas, in which
//r represents the sphere’s radius. Print the output to four decimal
//places.
//Volume  
//4
//3
//r3
//Surface area  4r2
public class PP35 {

  
    public static void main(String[] args) 
    {
       System.out.println("Enter radius of a spehere: "); 
       Scanner kb = new Scanner(System.in);
       double radi = kb.nextDouble(); 
       
       double vol = volume(radi);
       double sa = surfaceArea(radi);
       DecimalFormat fmtVol , fmtSa; 
       // Constructor of Decimal Format takes in a patter in string
       fmtVol = new DecimalFormat("0.0000");
       fmtSa = new DecimalFormat("0.0000");
       // format instacne function returns string rep of the double value
       System.out.println("\nVolume : " + fmtVol.format(vol) + "\nSurface Area : " +
               fmtSa.format(sa)); 

       
        
    }
    
    // Voulme method returna double 
    public static double volume(double radi)
    {
        double vol = Math.pow(radi, 3) * Math.PI * (4D/3D); 
        
        return vol; 
    }
    
    public static double surfaceArea(double radi)
    {
        double sa = 4d * Math.PI * Math.pow(radi, 2 ); 
        return sa; 
    }
    
    
}
