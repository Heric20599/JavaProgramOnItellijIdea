package DAAASSIGNMENT;

import java.util.Arrays;

public class HeapSort {
   public static void buildheap(int []arr,int n){
       for (int i = (n-2)/2; i >=0 ; i--) {
           heapify(arr,n,i);
       }
   }
   public static void Hs(int [] arr,int n){
       buildheap(arr,arr.length);
       for (int i = n-1; i >=1; i--) {
           int temp=arr[0];
           arr[0]=arr[i];
           arr[i]=temp;
           heapify(arr,i,0);
       }
   }
   public static void heapify(int []arr,int n,int i){
       int largest=i;
       int l=2*i+1;
       int r=2*i+2;
       if (l<n&&arr[l]>arr[largest]){
           largest=l;
       }if(r<n&&arr[r]>arr[largest]){
           largest=r;
       }
       if(largest!=i){
           int temp=arr[i];
           arr[i]=arr[largest];
           arr[largest]=temp;

           heapify(arr,n,largest);
       }
   }
    public static void main(String[] args) {
        int [] arr={1,7,6,8,4,5,3};
        Hs(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
//    static void buildHeap(int[] arr, int n){
//        for (int i = (n-2)/2; i >=0 ; i--) {
//            heapify(arr,n,i);
//        }
//    }
//    public static void Hs(int [] arr,int n){
//        buildHeap(arr, n);
//        for (int i = n-1; i>=1 ; i--) {
//            int temp=arr[0];
//            arr[0]=arr[i];
//            arr[i]=temp;
//            heapify(arr,i,0);
//        }
//    }
//    public static void heapify(int [] arr,int n,int i){
//        int largest=i;
//        int l=2*i+1;
//        int r=2*i+2;
//        if(l<n&&arr[l]>arr[largest]){
//            largest=l;
//        }if(r<n&&arr[r]>arr[largest]){
//            largest=r;
//        }if(largest!=i){
//            int temp=arr[i];
//            arr[i]=arr[largest];
//            arr[largest]=temp;
//            heapify(arr,n,largest);
//        }
//    }