package com.opentuned;

public class CheckingAssignmentSort {
    
    // Some basic metrics on recursion and swap count
    static int swapcount = 0;
    static int reccount = 0;
    static int count = 0;

    public static void main(String args[]) {
        while (count < 10000) {
            count++;
            reccount=0;
            swapcount=0;
            System.out.println("Input Data");
            // Set up our test data to be sorted
            int[] testData = new int[5];
            //        testData[0] = 1;
            //        testData[1] = 0;
            //        testData[2] = 5;
            //        testData[3] = 7;
            //        testData[4] = 2;

            // Populate with random integers
            for (int i = 0; i < testData.length; i++) {
                testData[i] = (int) (Math.random() * 10);
                System.out.print(testData[i] + " ");
            }
            // Preform our sorting
            sort(testData);
            // Display our data post sort
            System.out.println("\nOutput Data");
            for (int i = 0; i < testData.length; i++) {
                System.out.print(testData[i] + " ");
            }
            System.out.println("\nMetrics, swap count = " + swapcount + " recursive calls = " + reccount);
        }
    }
    
    static void sort(int a[]) {
        sort(a, 0, a.length);
    }

    static void sort(int a[], int l, int r) {
        reccount++;
        int size = r - l;
        if (size <= 1)
            return;
        else if (size == 2) {
            if (a[l] > a[l + 1]) { // swap a[l] and a[l + 1] 
                swapcount++;
                int tmp = a[l];
                a[l] = a[l + 1];
                a[l + 1] = tmp;
            }
        } else {
            int i = size / 3;
            sort(a, l, r - i);
            sort(a, l + i, r);
            sort(a, l, r - i);
        }
    }
}