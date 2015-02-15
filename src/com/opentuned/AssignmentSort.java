package com.opentuned;


// Some sample test data
// 1,2,3,6,4,1,6,8,23,13,17,12,89,100

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AssignmentSort {
    
    public static void main(String args[]){

        // Set up our test data to be sorted
        int[] testData = new int[10];

        for(int i = 0; i < testData.length - 2; i++ ){
            testData[i] = (int) (Math.random() * 10);
        }


        System.out.println("Pre sort :" + testData.toString());
        
        sort(testData);
        
        System.out.println("Sorted :" + testData.toString());
        
    }
    
    // Overloaded sort method
    // Base definition takes a single integer array and calls sort with an arity of 3 vars
    static void sort(int a[]){
        sort(a, 0, a.length);
    }
    
    // Invariant:
    // Pre condition:
    // Post condition:
    static void sort(int a[] , int l, int r) {
        
        // length of array to be sorted - 1
        int size = r - 1; //

        // Step 1
        // last element, exit and return
        if(size <= 1)
            return;
                
        // Step 2
        // if we have two elements
        // compare first to next, if first is greater
        //      swap a[l] and a[l + 1]
        else if (size == 2) {
            if (a[l] > a[l + 1]) { // swap a[l] and a[l + 1] int tmp = a[l];
                int tmp = a[l];
                a[l] = a[l + 1];
                a[l + 1] = tmp;
            }

        // Step 3
        // Three recursive calls to the sort method.
        // set var i to the length of array / 3
        // sort in 3 parts, passing the array, left and right in variations
        // 1 -  sort => array , left, right - (size / 3)
        // 2 -  sort => array , left + (size / 3), right
        // 3 -  sort => array , left, right - size / 3  - REPEATS THE FIRST STEP, and is not reachable
        } else {
            int i = size / 3;
            sort(a, l, r - i);
            sort(a, l + i, r);
            sort(a, l, r - i);
        }
    }
    
}

// Firstly we need to declare the intent of the algorithm, a quick run seems to replace
// various elements at its discretion.

// As it stands the algorithm has a number of issues, mainly that arrays are fixed
// length and we eventually end up with an overflow.

// The other issue is that there is duplicate logic in the last line of the else
// statement