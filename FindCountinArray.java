package com.array.ex;

import java.util.Scanner;

public class FindCountinArray {
    static void findCount(int[] arr, int target) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                count++;

        }
        System.out.println("No of " + target + " Elements occures " + count);
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
        findCount(arr, target);

        sc.close();
    }

}
