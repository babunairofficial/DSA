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
}
