/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp9.pkg6;

/**
 *
 * @author Jesse
 */
// Class implements priority interface inherits abstracts method to be defined
public class Task implements Priority, Comparable{
    
    private int priorityNumber; 
    
    Task()
    {
        priorityNumber = 0; 
    }
    
    Task(int number )
    {
        priorityNumber = number; 
    }
    
    @Override public void setPriority(int num){priorityNumber = num;}
    
    @Override public int getPriority(){return priorityNumber; }
    
    @Override public int compareTo(Object arg)
    { 
        if (this.priorityNumber == ((Task)arg).priorityNumber)
        {
            return 0;
        }
        else if(this.priorityNumber > ((Task)arg).priorityNumber)
        {
            return 1; 
        }
        else
        {
            return -1; 
        }
        
    }
}
