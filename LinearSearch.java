package DAAASSIGNMENT;

public class LinearSearch {
    public static int ls(int []arr,int x,int n){
        int start=0;
        n=arr.length-1;
        while (start!=arr.length){
            if(arr[start]==x){
                return start;
            }else{
                start++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={8,9,10,11,12,13,14};
        System.out.println(ls(arr,14,7));
    }
}

