/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp4.pkg10;

//create modified versions of the Stars program to print the following patterns.
//Create a separate program to produce each pattern. Hint: Parts b, c, and d require several loops, some of which
//print a specific number of spaces.
public class PP410 {

 
    public static void main(String[] args) {
        
        printA(); 
        printB(); 
        System.out.println(); 
        printC(); 
        printD();
    }
    
    public static void printD()
    {
        // outter loop for  newLine for top half 
        // Closes arthemtic sequence a(n) = 1 + 2n, n>=0;
        
        for(int newline = 4; newline > 0; --newline)
        {
            System.out.println(); 
            // Space characters
            for(int spaces = (1 + (2 * newline))/2 ; spaces > 0;--spaces)
            {
            System.out.print(" ");
            }
            
             // Nowprint star characters 
            for(int star = (1+ (2 * (4 - newline )));star > 0;--star)
            {
            System.out.print("*");     
            }
        }
         System.out.println(); 
        System.out.println("*********");
        // Bottom par
        for(int newline = 4; newline >= 0; --newline)
        {
        
            // Space characters
          for(int spaces = ((1 + (2 * newline))/2) - 4 ; spaces < 0;++spaces)
           {
           System.out.print(" ");
           }
            
             // Nowprint star characters 
            for(int star = (1+ (2 * ( newline )));star >0;--star)
            {
            System.out.print("*");     
            }
            System.out.println(); 
        }
    }
     
    public static void printA()
    {
      for(int x = 10; x > 0; --x)
      {
       int i = x; 
       for(; i > 0; --i)
       {
            System.out.print("*"); 
       }
       System.out.println(); 
      }
    }
    
    public static void printB()
    {
        // Out handle the horzontal case
        for(int x = 0; x < 10; ++x)
        {
            int side = x; 
            
            // Print spaces
                for(int spaces = 10 - x; spaces > 0; --spaces)
                {
                    System.out.print(" ");
                }
            for(;side > 0;--side )
            {
                
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
    
    public static void printC()
    {
        // Outer loop print newline
        for(int i = 10;i > 0;--i)
        {
            // print spaces first
            for(int x = 10 - i; x > 0;--x)
            {
                System.out.print(" "); 
            }
            for(int x = i; x > 0; --x)
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
    
}
