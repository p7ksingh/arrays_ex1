package com.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // static boolean sortArray(int[] arr) {
    // boolean check = true;
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i - 1] > arr[i]) {
    // check = false;
    // break;
    // }
    // }
    // return check;
    // }
    // find smalest and largest no fron array and return array
    static int[] findElement(int[] arr) {
        Arrays.sort(arr);
        int[] result = { arr[0], arr[arr.length - 1] };

        return result;
    }

    static int findKthHighest(int[] arr, int k) {
        // Sort the array in descending order
        Arrays.sort(arr);

        // Retrieve the kth highest element
        return arr[arr.length - k];
    }

    static int findKthElement(int[] arr, int k) {
        if (k >= 1 && k <= arr.length) {
            // Access the kth element (1-based indexing)
            return arr[k - 1];
        } else {
            System.out.println("Invalid value of k");
            return -1; // Return a sentinel value or handle the error as appropriate
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements in Array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // boolean t = sortArray(arr);
        // System.out.println(t);
        // System.out.println("Sorted Array:");

        // int[] ele = findElement(arr);
        // System.out.println(ele[0] + " " + ele[1]);
        // int el=findKthHighest(arr, 2);
        // System.out.println(el);

        int kthElement = findKthElement(arr, 2);
        System.out.println(kthElement);
        sc.close();
    }
}
