package Cognizant;

public class ArrayRotation {
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6,7};
       // int resultArr[]=rotateArray1(arr,2);
        int resultArr[]=rotateArray(arr,1);
        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");

        }
    }


    public static int[] rotateArray(int arr[],int k){

        k=k%arr.length;
        arr=reverse(arr,0,arr.length-1);
        arr=reverse(arr,0,k-1);
        arr=reverse(arr,k,arr.length-1);

        return arr;
    }

    public static int[] reverse(int[] arr,int start, int end){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] rotateArray1(int arr[], int k)// Not the right solution
    {
        int index=0;
        int resultarr[] = new int[arr.length];
        for(int i=k;i<arr.length;i++){
            resultarr[index]=arr[i];
            index++;
        }
        for(int i=0;i<k;i++){
            resultarr[index]=arr[i];
            index++;
        }
        return resultarr;
    }
}
