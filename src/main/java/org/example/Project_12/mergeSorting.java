package org.example.Project_12;

import java.util.Arrays;

public class mergeSorting {
    // Реализовать алгоритм сортировки слиянием
    public static void main(String[] args) {
         int[] array = new int[9]; // initial a random array
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);
        }
        int n = array.length;
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, n - 1);
        System.out.println(Arrays.toString(array));
    }
    static void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }
    static void merge(int a[], int beg, int mid, int end) {
        int i, j, k;
        int teOne = mid - beg + 1;
        int teSec = end - mid;

        int LeftArray[] = new int[teOne];
        int RightArray[] = new int[teSec];

        // copying data to temporary arrays
        for (i = 0; i < teOne; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < teSec; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; // initial index of the left sub-array
        j = 0; // initial index of right sub-array
        k = beg;  // initial index of merged sub-array

        while (i < teOne && j < teSec) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < teOne) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < teSec) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
