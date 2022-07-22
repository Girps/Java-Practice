/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp8.pkg2;
import java.util.Scanner; // Get scanner class
import java.lang.String; // Get String class

/**
 *
 * @author Jesse
 */
public class PP82 {

//     Design and implement a set of classes that define the employees
//of a hospital: doctor, nurse, administrator, surgeon, receptionist,
//janitor, and so on. Include methods in each class that are named
//according to the services provided by that person and that print
//an appropriate message. Create a driver class to instantiate and
//exercise several of the classes.
    public static void main(String[] args) {
        
       // menu pick which instance we want
       
       int input= 0; 
       int count  =0; // how many object in the array 
        Scanner kb = new Scanner(System.in); 
       String line  = ""; 
       boolean sent = true; 
       Employee[] arr = new Employee[10]; 
       
       
       while(sent == true )
       {
       System.out.println("Enter a selection\n(1)Add Doctor\n(2)Add Nurse\n"
               + "(3)Add Janitor\n(4)Add Receptionist\n(5)Add Administrator\n"
               + "(6)Add Surgeon\n(7)Print services\n(8)Terminate program\n" ); 
       
       input = kb.nextInt(); 
       kb.nextLine(); 
       switch(input)
             {
           case(1): // Add doc
               System.out.println("Enter a name\n");
               String name = kb.nextLine(); 
               arr[count++] = new Doctor(name); 
               System.out.println("Doctor added"); 
               break; 
           case(2): // Add nurse
               System.out.println("Enter a name\n");
                name = kb.nextLine(); 
               arr[count++] = new Nurse(name); 
                    System.out.println("Nurse added"); 
               break; 
           case(3): // Add janitor
               System.out.println("Enter a name\n");
                name = kb.nextLine(); 
               arr[count++] = new Janitor(name); 
                    System.out.println("Janitor added"); 
               break;
           case(4): // Add receptionist 
               System.out.println("Enter a name\n");
                name = kb.nextLine(); 
               arr[count++] = new Receptionist(name); 
                    System.out.println("Receptionist added"); 
               break; 
           case(5): // Add Administrator
                System.out.println("Enter a name\n");
                name = kb.nextLine(); 
               arr[count++] = new Administor(name); 
                    System.out.println("Administrator added"); 
               break;
           case(6): // Add surgeon
                System.out.println("Enter a name\n");
                name = kb.nextLine(); 
               arr[count++] = new Surgeon(name); 
                  System.out.println("Surgeon added"); 
               break; 
           case(7): // print all services 
               for(int i = 0; i < count; ++i)
               {
                   arr[i].service(); // call service or each instance 
               }
               break; 
           case(8): 
               sent = false; 
               System.out.printf("Program terminated"); 
               break; 
           default: 
               System.out.println("Wrong format"); 
               break; 
            }
       }
    }
    
}
