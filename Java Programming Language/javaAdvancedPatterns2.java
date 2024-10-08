public class javaAdvancedPatterns2 {
    
    //Hollow Rectangle Pattern
    public static void hollow_Rectangle(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<=cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    //Inverted & Rotated Half Pyramid
    public static void inverted_rotated_half_pyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(5,10);
        inverted_rotated_half_pyramid(5);
    }
    
}
