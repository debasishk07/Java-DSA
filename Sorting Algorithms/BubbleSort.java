public class BubbleSort{

    public static void BubbleSorting(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-j;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }  
    }

    public static void printArr(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {7,3,5,1,9};
        BubbleSorting(arr);
        printArr(arr);
    }
}
