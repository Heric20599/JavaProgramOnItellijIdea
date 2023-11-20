package DAAASSIGNMENT;

public class RadixSort {
   public static void radixSort(int []arr){
       int max =arr[0];
       for (int i = 1; i < arr.length; i++) {
          if(arr[i]>max){
              max=arr[i];
          }
       }
       for (int ex = 1; max/ex>0 ; ex=ex*10) {
           cs(arr,ex);

       }

   }
   public static void cs(int []arr,int ex){
       int counting []=new int [10];
       for (int i = 0; i <10; i++) {
           counting[i]=0;
       }
       for (int i = 0; i <arr.length ; i++) {
           counting[(arr[i]/ex)%10]++;
       }
       for (int i = 1; i <10; i++) {
           counting[i]=counting[i-1]+counting[i];
       }
       int output[]=new int[arr.length];
       for (int i=arr.length-1;i>=0;i--) {
           output[counting[(arr[i]/ex)%10]-1]=arr[i];
           counting[(arr[i]/ex)%10]--;
       }
       for (int i=0;i<arr.length;i++){
           arr[i]=output[i];
       }
   }
    public static void main(String[] args) {
        int[] nums={334,115,54,253,109};

        System.out.println("Before sorting :");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
        radixSort(nums);
        System.out.println();
        System.out.println("After Sorting :-");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] +" ");
        }
    }

}


//    public static void radixSort(int[] arr)
//    {
//        int max=arr[0];
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//            }
//        }
//        for(int exp=1;max/exp>0;exp=exp*10)
//        {
//            countingSort(arr,exp);
//        }
//
//    }
////    public static void countingSort(int[] arr,int exp)
//    {
//
//        int[] count = new int[10];
//        for(int i=0;i<10;i++)
//        {
//            count[i]=0;
//        }
//        for(int j=0;j<arr.length;j++)
//        {
//            count[( arr[j]/exp)%10]++;
//        }
//        for(int i=1;i<10;i++)
//        {
//            count[i]=count[i]+count[i-1];
//        }
//        int[] ans=new int[arr.length];
//        for(int j=arr.length-1;j>=0;j--)
//        {
//            ans[count[(arr[j]/exp)%10]-1]=arr[j];
//            count[(arr[j]/exp)%10]--;
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]=ans[i];
//        }
//
//    }
