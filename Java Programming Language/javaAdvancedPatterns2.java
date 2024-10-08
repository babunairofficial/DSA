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

    //Inverted Half Pyramid with numbers
    public static void inverted_half_pyramid_with_numbers(int x){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= x-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    //Floyd's triangle
    public static void floyds_triangle(int row){
        int c = 1;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(5,10);
        inverted_rotated_half_pyramid(5);
        inverted_half_pyramid_with_numbers(5);
        floyds_triangle(5);
    }
    
}
