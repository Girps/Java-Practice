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
public class MergeAlgo {
    
    public static void merge(Comparable[] data, int first,int middle, int last)
    {
         // variables to handle size of array 1 
        int first1 = first; 
        int last1 = middle; 
        
        // variables handle array 2
        int first2 = middle+1;
        int last2 = last; 
        int i = first1;
        
        // allocate array 
        
        Comparable[] temp = new Comparable[data.length];
        
        // copy data into temp array 
        while(first1 <= last1 && first2 <= last2 )
        {
            if(data[first1].compareTo(data[first2]) < 0 )
            {
                temp[i] = data[first1++]; 
            }
            else
            {
                temp[i] = data[first2++]; 
            }
            i++;
        }
        // Now copied the limited array check for largers arrays
        
        // If right array is larger 
        while(first2 <= last2)
        {
            temp[i] = data[first2++]; 
            i++; 
        }
        
        // if left array is larger
        while(first1 <= last1)
        {
            temp[i] = data[first1++]; 
            i++; 
        }
        
        // Now copy temp data into calling methods array 
        
        for(i = first; i <= last; ++i)
        {
            data[i] = temp[i]; 
        }
        
    }
    
    // Recursive method takes an array of data recursives truncates by half 
    // And sort them while stack unwinding using merge method
    public static void mergeSort(Comparable[] data,int first, int last)
    {
        // if list is less than 1 base case return
        if(first < last)
        {
            int middle = (first + last) / 2; 
            // Truncate left side
            mergeSort(data,first,middle);
            // Truncate right side
            mergeSort(data,middle + 1,last );
            // Use merge method to merge arrays together
            merge(data, first,middle,last); 
        }
    }
    
}
