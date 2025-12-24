import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] ={4,5,1,2,3};

        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for(int i=0;i < arr.length;i++){

            int lastIndex = arr.length - 1 - i;
            //find the max element index in the range of 0 to lastIndex
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);

        }
    }

    //finding the max elements index
    static int getMaxIndex(int arr[], int start, int end){

        int max = start;

        for(int i = start;i <= end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    //here we swap the max element to it's original position
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
