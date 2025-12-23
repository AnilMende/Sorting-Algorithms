import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {-1,-32,0,7,34};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[]){

        boolean swapped;
        //run the steps n-1 steps
        for(int i=0;i < arr.length;i++){
            swapped = false;
            // for each step, max item will come at the respective index
            for(int j=1;j <= arr.length - i -1;j++){
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, that mean the array is already sorted
            if(!swapped){
                break;
            }
        }
    }
}
