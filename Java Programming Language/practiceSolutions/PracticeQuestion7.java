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

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
                
        //sorting method call
        bubbleSort(arr);

        
    }
}
