package com.array.ex;

import java.util.Scanner;

public class FindXinArray {
    static boolean findX(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }

        return false;
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
        System.out.println("Enter Target element in Array:");
        int target = sc.nextInt();
        boolean t = findX(arr, target);
        System.out.println("Element present in array : " + t);
        sc.close();
    }

}
