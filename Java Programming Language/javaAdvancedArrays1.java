public class javaAdvancedArrays1 {
    /* 
    //arrays as function arguments - pass by reference property
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] ++;
        }
    }
    public static void main(String[] args) {
        int marks[] = {99,95,97,98};
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        update(marks);
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }        
    }
    */
    
    /* 
    //linear search
    
    public static int linear_search(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 7, 9, 11, 13, 150};
        int key = 11; 
        int index = linear_search(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index "+index);
        }
    }
    */

    /* 
    //largest number
    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]> largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {7,65,21,71,23,52,16,0,45};
        int largest = largestNumber(numbers);
        System.out.println("largest number is "+largest);
    }
    */

    /* 
    //binary search (when arrays are sorted)
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(key == numbers[mid]){
                return mid;
            }
            if(key < numbers[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }            
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 18;
        int search = binarySearch(numbers, key); 
        if(search == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at position = "+search);
        }

    }
    */

    /* 
    //Reverse an array
    public static void reverseArray(int array[]){
        int first = 0; 
        int last = array.length - 1;
        
        while(first<last){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first ++;
            last --;
        }
    }
    public static void main(String[] args) {
        int array[] = {12, 15, 18, 9, 3, 45};
        reverseArray(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        
    }
    */

    //Forming Pairs in array
    public static void pairs(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {0, 2, 4, 6, 8, 10};
        pairs(numbers);
    }
}
