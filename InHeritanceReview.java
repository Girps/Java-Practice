/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancereview;

/**
 *
 * @author Jesse
 */
public class InHeritanceReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        thought base = new thought(); 
        Advice derived = new Advice(); 
        
        base.message(); 
        derived.message(); 
        
    }
    
}
