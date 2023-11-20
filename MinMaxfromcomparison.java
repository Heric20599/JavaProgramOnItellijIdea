package DAAASSIGNMENT;

public class MinMaxfromcomparison {
    public static void MM(int [] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("MAX"+"->"+max);
        System.out.println("MIN"+"->"+min);
    }

    public static void main(String[] args) {
        int []arr={1,4,3,2,76,8};
        MM(arr);
    }
}
