/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;
import java.lang.RuntimeException;  
import java.lang.String;  
/**
 *
 * @author Jesse
 */
public class TVShow implements Comparable
{
    private String title;
    //  0 , 1 , 2 ,3 ,4 ,5 ,6 ,7
    public static enum Days {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday, Sunday}
    private Days day; 
    
    public TVShow(String arg,Days argDay)
    {
        title = arg; 
        if(argDay.ordinal() < 0 && argDay.ordinal() > 7)
        {
            throw new RuntimeException("Not a valid day!"); 
        }
        day = argDay; 
    }
    
    public String getTitle(){return title;}
    
    // Overriding method from comparable interface 
    @Override 
    public int compareTo(Object arg)
    {
        // Days have higher prioty 
        if(this.day != ((TVShow)arg).day )
        {
            // dont equal return compareTo
            return ((TVShow)arg).day.compareTo(this.day);
        }
        else
        {
            return  this.title.compareTo( ((TVShow)arg).title);
        }
    }
    
    // Overrideing object method inhertied from Object super class
    @Override 
    public String toString()
    {
        String result =  "\nTitle:" + title; 
        result = result.concat("\nDay:"); 
        result = result.concat(this.day.name()); 
        return result; 
    }
}
