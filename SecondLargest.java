package com.array.ex;

import java.util.Scanner;

public class SecondLargest {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int maxNo(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMaxNo(int[] arr) {
        int mx = maxNo(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int secondMaxNo = maxNo(arr);
        return secondMaxNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printArray(arr);
        maxNo(arr);
        int max = secondMaxNo(arr);
        System.out.println(max);
        // printArray(arr);
        // System.out.println(arr);
        // secondMaxNo(arr);
        sc.close();

    }
}
