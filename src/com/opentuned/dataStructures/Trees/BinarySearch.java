package com.opentuned.dataStructures.Trees;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/01/2015
 * Time: 20:55
 */
public class BinarySearch {

    // Binary Search, a non recursive implementation
    // Invariant. If key appears in the array a[], then a[lo] <= key <= a[hi]
    public static int binarySearch(int[] a, int key) {

        int lo = 0, hi = a.length-1;

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            // 3 way compare
            if (key < a[mid]) hi = mid -1;
            else if (key < a[mid]) hi = mid +1;
            else return mid;
        }
        return -1;
    }
    
}
