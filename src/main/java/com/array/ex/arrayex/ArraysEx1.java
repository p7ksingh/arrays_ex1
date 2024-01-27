package com.array.ex.arrayex;

import java.util.Scanner;

public class ArraysEx1 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Arrays :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array " + n + " elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = arr;
        printArray(arr);
        printArray(arr2);
    }
}
