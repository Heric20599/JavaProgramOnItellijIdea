package DAAASSIGNMENT;

public class KthMin {
    public static int partition(int [] arr,int low,int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static int kthmin(int []arr,int n,int k){
        int m=0;
        int l=n-1;
        while (m<=n){
            int p=partition(arr,m,l);
            if(p==k-1){
                return arr[p];
            } else if (p > k - 1) {
                l=p-1;
            }else
                m=p+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,9,5,2,-1, 0};
        System.out.println( partition(arr,0,arr.length-1));
        //System.out.println(Arrays.toString(arr));
      //  kthmin(arr, arr.length, 3);
       System.out.println(kthmin(arr,arr.length,2));
    }
}
