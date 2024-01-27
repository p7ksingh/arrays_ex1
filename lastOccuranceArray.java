package com.array.ex;

import java.util.Scanner;

public class lastOccuranceArray {
    static void lastOccurance(int[] arr, int target) {
        int lastOccurance = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                lastOccurance = i;
        }
        System.out.println("lastOccurance array element: " + lastOccurance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arrays :");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Element in Array :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target elemrnt :");
        int target = sc.nextInt();
        lastOccurance(arr, target);

        sc.close();
    }

}
