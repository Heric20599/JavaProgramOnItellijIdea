package DAAASSIGNMENT;

import java.util.Arrays;

public class CountingSort {
    public static int maxt(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void cs(int []nums,int n) {
        int M = maxt(nums, nums.length);
        int count[] = new int[M + 1];
        for (int i = 0; i <= M; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            count[i] = count[i - 1] + count[i];
        }
        int output[] = new int[n];
        for (int i = n - 1; i>= 0; i--) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 5, 9, 2, 3, 4};
        System.out.println(maxt(arr, arr.length));
        cs(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
//    int M= max(nums,nums.length);
//    int []counting=new int [M+1];
//        for (int i = 0; i <=M; i++) {
//        counting[i]=0;
//    }
//        for (int i = 0; i <n ; i++) {
//        counting[nums[i]]++;
//    }
//        for (int i = 1; i <=M; i++) {
//        counting[i]=counting[i-1]+counting[i];
//    }
//    int output[]=new int[n];
//        for (int i=n-1; i>=0; i--) {
//        output[counting[nums[i]]-1]=nums[i];
//        counting[nums[i]]--;
//    }
//        for (int i = 0; i <n ; i++) {
//        nums[i]=output[i];
//    }
//}

