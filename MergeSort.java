package DAAASSIGNMENT;

import java.util.Arrays;

public class MergeSort {
   static void devide(int [] arr,int s,int e){
       if(s>=e){
           return;
       }else{
           int mid=s+(e-s)/2;
           devide(arr,s,mid);
           devide(arr,mid+1,e);
           conq(arr,s,mid,e);
       }
   }
   static void conq(int []arr,int s,int mid,int e){
       int []merge=new int [e-s+1];
       int idx1=s;
       int idx2=mid+1;
       int x=0;
       while (idx1<=mid&&idx2<=e){
           if(arr[idx1]<arr[idx2]){
               merge[x++]=arr[idx1++];
           }else{
               merge[x++]=arr[idx2++];
           }
       }
       while (idx1<=mid) {
           merge[x++] = arr[idx1++];
       }while (idx2<=e){
           merge[x++]=arr[idx2++];
       }
       for (int i = 0,j=s; i <merge.length ; i++,j++) {
           arr[j]=merge[i];
       }

       }

    public static void main(String[] args) {
        int [] arr={1,6,5,4,8,7,3,2};
        int n=arr.length;
        devide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
//    static void devide(int []arr,int s,int e){
//        if(s>=e){
//            return;
//        }
//        int mid=s+(e-s)/2;
//        devide(arr,s,mid);
//        devide(arr,mid+1,e);
//        conq(arr,s,mid,e);
//
//    }
//    static void conq(int [] arr,int s,int mid,int e) {
//        int[] merged = new int[e - s + 1];
//        int idx1 = s;
//        int idx2 = mid + 1;
//        int x = 0;
//        while (idx1 <= mid && idx2 <= e) {
//            if (arr[idx1] <= arr[idx2]) {
//                merged[x++] = arr[idx1++];
//            } else {
//                merged[x++] = arr[idx2++];
//            }
//        }
//        while (idx1 <= mid) {
//            merged[x++] = arr[idx1++];
//        }
//        while (idx2 <= e) {
//            merged[x++] = arr[idx2++];
//        }
//        for (int i = 0,j=s; i <merged.length ; i++,j++) {
//            arr[j]=merged[i];
//        }
//    }

