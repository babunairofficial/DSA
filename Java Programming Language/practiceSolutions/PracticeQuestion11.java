
import java.util.*;

public class PracticeQuestion11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)        ;

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex result = new Complex();

        System.out.println("Enter first complex number");
        c1.read(sc);

        System.out.println("Enter second complex number");
        c2.read(sc);

        result.sum(c1, c2);
        result.difference(c1,c2);
        result.product(c1, c2);

        sc.close();
    }
}

class Complex {
    int real;
    int imag;

    void read(Scanner sc) {
        System.out.println("Enter real part: ");
        real = sc.nextInt();
        System.out.println("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    void sum(Complex c1, Complex c2) {
        int r = c1.real + c2.real;
        int i = c1.imag + c2.imag;
        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void difference(Complex c1, Complex c2) {
        int r = c1.real - c2.real;
        int i = c1.imag - c2.imag;
        System.out.println("Difference = " + r + " + " + i + "i");
    }

     void product(Complex c1, Complex c2) {
        int r = (c1.real * c2.real) - (c1.imag * c2.imag);
        int i = (c1.real * c2.imag) + (c1.imag * c2.real);
        System.out.println("Product = " + r + " + " + i + "i");
    }

}
