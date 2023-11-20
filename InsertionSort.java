package DAAASSIGNMENT;

import java.util.Arrays;

public class InsertionSort{
    public static void is(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key =arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }

    public static void main(String[] args) {
        int []arr={1,3,2,5,45,56,0,4};
        is(arr);
        System.out.println(Arrays.toString(arr));
    }
}
//public class InsertionSort {
//    public static void is(int []arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0&&arr[j]>key){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
//    }