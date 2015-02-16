package com.opentuned;

public class AssignmentSort {

public static void main(String args[]){
    // Set up our test data to be sorted
    int[] testData = new int[10];
    // Populate with random integers
    for(int i = 0; i < testData.length; i++ ){
        testData[i] = (int) (Math.random() * 10);
    }
}

// Base definition takes a single integer array and calls sort with an arity of 3 vars
static void sort(int a[]){
    sort(a, 0, a.length);
}
// Overloaded sort method takes the array to be sorted, a starting position and its length
static void sort(int a[] , int l, int r) {
    // length of array to be sorted - 1
    int size = r - 1; //
    // Step 1
    // last or first and only element, exit and return
    if(size <= 1)
        return;
    // Step 2
    // if we have two elements
    // compare first to next, if first is greater
    //      swap a[l] and a[l + 1]
    else if (size == 2) {
        if (a[l] > a[l + 1]) {
            int tmp = a[l];
            a[l] = a[l + 1];
            a[l + 1] = tmp;
        }
    // Step 3
    // Three recursive calls to the sort method, set var i to the length of array / 3
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
