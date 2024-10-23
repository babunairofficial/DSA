// import java.util.*;
public class javaAdvancedSorting {
    /**
     * Sorts an array using the bubble sort algorithm.
     * Time complexity: O(n^2), where n is the length of the array.
     * Space complexity: O(1)
     */
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //selection sort
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int minimumPos = i ;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minimumPos] > arr[j]){
                    minimumPos = j;
                }
            }
            //swap
            int temp = arr[minimumPos];
            arr[minimumPos] = arr[i];
            arr[i] = temp;
        }
    }

    //insertion sort
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding the position to insert
            while(prev >= 0 && arr[prev] > curr){ 
                arr[prev+1] = arr[prev];
                prev--;
            }
            //inserting
            arr[prev + 1] = curr;
        }
    }

    //counting sort
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i = 0; i <arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,9,7,4,2,8,3,2,6};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        countingSort(arr);
        printArr(arr);
    }
}
