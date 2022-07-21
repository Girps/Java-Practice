/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg5.pkg6;

/**
 *
 * @author Jesse
 */
public class Box 
{
    // Data fields arrtibutes of instance type Box
    boolean full; 
    double hieght; 
    double width; 
    double depth; 
    
    // 3 arg constructor initalizes our data memebers 
    Box(double hieght, double width, double depth)
    {
        this.hieght = hieght; 
        this.width = width; 
        this.depth = depth; 
    }
    
    
    // Declare and define our accessors 
    
    double getHieght(){ return hieght; }
    double getWdith(){ return width; }
    double getDepth(){ return depth; }
    boolean getFull(){return full;}
    // Declare and define our mutators
    
    void setHieght(double hieght){ this.hieght = hieght; }
    void setWidth(double width){ this.width = width; }
    void setDepth(double depth){ this.depth = depth; }
    void setFull(boolean arg){this.full = arg; }
    
    
    /*Inherited toString method is overridden by box class*/
    @Override
    public String toString()
    {
        String result = ""; 
        result = result.concat("Box\n" + "Hieght: " +Double.toString(this.hieght) + 
        "\nWidth: " + Double.toString(this.width) + "\nDepth: "+ Double.toString(this.depth) + 
        "\nis full: " + Boolean.toString(this.full));
        
        return result; 
    }

    
    
}
