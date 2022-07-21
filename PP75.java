/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp7.pkg5;

//Design and implement an application that computes and prints
//the mean and standard deviation of a list of integers x1 through
//xn. Assume that there will be no more than 50 input values.
//Compute both the mean and standard deviation as floating point
//values, using the following formulas.
public class PP75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] arry = {1,2,3,4,5};
        
        System.out.println("Mean: " + myMath.mean(arry)); 
        System.out.println("STD: " + myMath.std(arry)); 
    }
    
}
