package com.opentuned.Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 21/01/2015
 * Time: 13:42
 */
public class BubbleSort {

    public static void bubbleSort(int[] a) {
        for(int i = 0; i < a.length -1; i++){
            for(int j = 0; j < a.length -1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j]; //swap
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
    
    

}
