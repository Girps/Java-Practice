/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author Jesse
 */
public class TVShow implements Comparable
{
    private String title;
    
    public TVShow(String arg)
    {
        title = arg; 
    }
    
    public String getTitle(){return title;}
    
    // Overriding method from comparable interface 
    @Override 
    public int compareTo(Object arg)
    {
        return  this.title.compareTo( ((TVShow)arg).title);
    }
    
    // Overrideing object method inhertied from Object super class
    @Override 
    public String toString()
    {
        return this.title; 
    }
}
