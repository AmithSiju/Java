import java.util.Scanner;
class Complex {
    double real,imaginary;
    Complex(double r,double i){
        real = r;
        imaginary = i;
    }
    Complex add(Complex c){
        double realPart = this.real + c.real;
        double imaginaryPart = this.imaginary + c.imaginary; 
        return new Complex(realPart,imaginaryPart);
    }
    void display() {
        System.out.print("(" + real + " + " + imaginary + "i )");
        }

}
public class ComplexAddition{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of First number : ");
        double R1 = sc.nextDouble();
        System.out.println("Enter imaginary part of First number : ");
        double I1 = sc.nextDouble();
        Complex num1 = new Complex(R1,I1);
        System.out.println("Enter real part of Second number : ");
        double R2 = sc.nextDouble();
        System.out.println("Enter imaginary part of Second number : ");
        double I2 = sc.nextDouble();
        Complex num2 = new Complex(R2,I2);

        Complex sum = num1.add(num2);
        
        num1.display();
        System.out.print( " + " );
        num1.display();
        System.out.print( " = " );
        sum.display();
    }
}
