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
public class Algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TVShow[] shows = {new TVShow("F",TVShow.Days.Monday), new TVShow("B",TVShow.Days.Friday),
            new TVShow("D",TVShow.Days.Saturday),
            new TVShow("A",TVShow.Days.Sunday), new TVShow("E",TVShow.Days.Thursday),new TVShow("Z",TVShow.Days.Tuesday)};
        
        MergeAlgo.mergeSort(shows, 0, shows.length-1);
       
        for(int i =0; i < shows.length; ++i)
        {
            System.out.print(shows[i]+ " "); 
        }
        
    }
    
    /* Void recrusive function partions a list by half base case reached 
        stack diwndling calls a helper function to merge sorrted lists */
    public static void mergeSort(int[] array, int first, int max)
    {
        // Base case if list is size one return 
        if(first < max)
        {
            int middle = (first+max)/2; 
            // get middle elements 
            mergeSort(array,first,middle); // handle left side of array 
            mergeSort(array,middle+1,max); // hanld right side of array 
            // now merge using a helper function
            merge(array,first,middle,max);  
            
            
        }
    }
    
    
    public static void merge(int[] data, int first, int mid, int last)
    {
        int[] temp = new int[data.length];
        // Copy arrays together
        
        int first1 = first; 
        int last1 = mid; 
        
        int first2 = mid+1; 
        int last2 = last; 
        
        int i = first1; 
        while(first1 <= last1 && first2 <= last2)
        {
            if(data[first1] < data[first2])
            {
                temp[i] = data[first1++];
            }
            else
            {
                temp[i] = data[first2++]; 
            }
            ++i; 
        }
        
        // left is bigger
        while(first1 <= last1)
        {   
            temp[i] = data[first1++]; 
            i++; 
        }
        
        while(first2 <= last2)
        {
             temp[i] = data[first2++];
             i++; 
        }
        
        // copy temp array to array
        for( i= first; i <= last;++i)
        {
            data[i] = temp[i]; 
        }
    }
    
}
