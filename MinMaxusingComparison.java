package DAAASSIGNMENT;

import java.util.Arrays;

public class MinMaxusingComparison {
    public static int[] MM(int[] arr) {
        int length = arr.length;
        int[] minmax = new int[2];
        if (length == 1) {
            minmax[0] = minmax[1] = arr[0];
            return minmax;
        } else if (length % 2 != 0) {
            minmax[0] = minmax[1] = arr[0];
            for (int i = 1; i < length - 1; i += 2) {
                if (arr[i] < arr[i + 1]) {
                    if (minmax[0] > arr[i]) minmax[0] = arr[i];
                    if (minmax[1] < arr[i + 1]) minmax[1] = arr[i + 1];
                } else {
                    if (minmax[0] > arr[i + 1]) minmax[0] = arr[i + 1];
                    if (minmax[1] < arr[i]) minmax[1] = arr[i];
                }
            }
        } else {
            if (arr[0] < arr[1]) {
                minmax[0] = arr[0];
                minmax[1] = arr[1];
            } else {
                minmax[0] = arr[1];
                minmax[1] = arr[0];
            }
            for (int i = 2; i < length - 1; i += 2) {
                if (arr[i] < arr[i + 1]) {
                    if (minmax[0] > arr[i]) minmax[0] = arr[i];
                    if (minmax[1] < arr[i + 1]) minmax[1] = arr[i + 1];
                } else {
                    if (minmax[0] > arr[i + 1]) minmax[0] = arr[i + 1];
                    if (minmax[1] < arr[i]) minmax[1] = arr[i];
                }
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 4, 5, 0, 9};
        System.out.println(Arrays.toString(MM(arr)));
    }
}
