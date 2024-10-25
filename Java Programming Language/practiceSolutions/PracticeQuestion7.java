public class PracticeQuestion7 {

    //print ordered array
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //bubble sort
    public static void bubbleSort(int arr[]){
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                //check for descending
                if(arr[j] < arr[j+1]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    //Selection Sort
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int max_id = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > arr[max_id]){
                    max_id = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_id];
            arr[max_id] = temp;
        }
        printArray(arr);
    }

    //insertion sort
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            
            while(j >= 0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
        //print original array
        System.out.print("print array before sorting: ");
        printArray(arr);
        
        //space
        System.out.println();
        
        //print sorted array
        System.out.print("print sorted array: ");
        //sorting method call
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
    }
}
