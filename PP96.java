/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp9.pkg6;

//Design a Java interface called Priority that includes two methods:
//setPriority and getPriority. The interface should define
//a way to establish numeric priority among a set of objects. Design
//and implement a class called Task that represents a task (such as
//on a to-do list) that implements the Priority interface. Create a
//driver class to exercise some Task objects

//Modify the Task class from Programming Project 9.6 so that it
//also implements the Comparable interface from the Java standard
//class library. Implement the interface such that the tasks are
//ranked by priority. Create a driver class whose main method
//shows these new features of Task objects.

public class PP96 
{
    public static void main(String[] args) 
    {
       Priority[] groceryList = {
         new Task(10), // highest priority
          new Task(9), 
          new Task(8),
          new Task(7),
          new Task(6), 
         new Task(5), 
         new Task(4), 
        new Task(3), 
         new Task(2), 
         new Task(1)};
        
       
       for(int i = 0; i < groceryList.length; ++i)
       {
           System.out.println(groceryList[i].getPriority()); 
       }
        
        
       System.out.println();
       
       // A bad bubble sort algo 
       for(int i =0; i < groceryList.length; ++i)
       {
           for(int j = 0; j < groceryList.length - 1; ++j)
           {
               if(((Comparable)groceryList[j]).compareTo((Comparable)groceryList[j+1]) == 1)
               {
                   Priority temp = groceryList[j+1]; // get reference
                   groceryList[j + 1] = groceryList[j]; 
                   groceryList[j] = temp; 
               }
           }
       }
       
       for(int i = 0; i < groceryList.length; ++i)
       {
           System.out.println(groceryList[i].getPriority()); 
       }
        
        
    }
    
}
