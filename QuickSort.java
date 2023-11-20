package DAAASSIGNMENT;

import java.util.Arrays;

public class QuickSort {
    public static int  lpartition(int [] arr,int low ,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j <= high-1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(i+1);
        return i+1;
    }
    public static void qs(int [] arr,int low,int high) {
        if (low < high) {
            int p= lpartition(arr, low, high);
            qs(arr,low,p-1);
            qs(arr, p + 1, high);
        }
    }
    public static void main(String[] args) {
        int [] arr={2,5,3,7,6,0,89,56,44,34,-1};
        lpartition(arr,0, arr.length-1);
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

// some tips regarding quicksort
// worst time complexity of quicksort is o(n^2) which is occur when our pivot is smallest or greatest
// avg time complexity of quicksort is o(nlogn)