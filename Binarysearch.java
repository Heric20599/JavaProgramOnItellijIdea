package DAAASSIGNMENT;

public class Binarysearch {
    public static int bn(int arr[], int x, int n){
        int start=0;
        int mid;
        int end=n-1;
        while (start<=end){
            mid=start-(start-end)/2;
            if(arr[mid]==x){
                return mid;
            }if(arr[mid]<x){
                start=mid+1;
            }else
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={8,9,10,11,12,13,14};
        System.out.println( bn(arr,14,7));
    }
}

