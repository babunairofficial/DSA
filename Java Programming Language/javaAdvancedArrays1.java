public class javaAdvancedArrays1 {
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
}
