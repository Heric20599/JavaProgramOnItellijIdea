package DAAASSIGNMENT;

public class Kthmax {
    public static int partition(int [] arr,int low,int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) {
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
    public static int km(int []arr,int n,int k){
        int m=0;
        int l=n-1;
        while (m<=n) {
              int p = partition(arr, m, l);
            if(p==k-1){
                return arr[p];
            } else if (p < k - 1) {
                l=p-1;
            }else
                m=p+1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int []arr={1,0,6,-1,64};
      //  partition(arr,0,arr.length-1);
        System.out.println(km(arr,arr.length,2));

    }
}

//static void sort(int []arr){                     // sortcut way to print k max
//        Arrays.sort(arr);
//    }
//    public static void km(int [] arr,int n,int k){
//        System.out.println(arr[n-k]);
//    }

//    public static int partition(int [] arr,int low,int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//        for (int j = low; j < high; j++) {
//            if (arr[j] > pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//        return i + 1;
//
//    }
//    public static int km(int []arr,int n,int k){
//        int m=0;
//        int l=n-1;
//        while (m<=n) {
//            int p = partition(arr, m, l);
//            if(p==k-1){
//                return arr[p];
//            } else if (p < k - 1) {
//                l=p-1;
//            }else
//                m=p+1;
//        }
//        return -1;
//    }
//
