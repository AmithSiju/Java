import java.util.*;
public class Mensuration {
    void area(double r){
        System.out.print("Area : " + (3.14*r*r));
    }
    void area(float a){
        System.out.print("Area : " + (a*a));        
    }
    void area(double l, double b){
        System.out.print("Area : " + (l*b));
    }
    void area(float h, double b){
        System.out.print("Area : " + (0.5*h*b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mensuration s = new Mensuration();
        System.out.println("Enter radius of circle : ");
        s.area(sc.nextDouble());

        System.out.println("Enter radius of square : ");
        s.area(sc.nextFloat());

        System.out.println("Enter radius of rectangle : ");
        s.area(sc.nextDouble(),sc.nextDouble());

        System.out.println("Enter radius of triangle : ");
        s.area(sc.nextFloat(),sc.nextDouble());
    }
}
