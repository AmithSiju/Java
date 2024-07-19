import java.util.*;
interface Shape{
    public void area();
    public void peri();
}
class circle implements Shape{
    double r;
    circle(double r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of Circle : " + (3.14*r*r));
    }
    public void peri(){
        System.out.println("Perimeter of Circle : " + (2*3.14*r));
    }
}
class rectangle implements Shape{
    double l,b;
    rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("Area of Rectangle : " + (l*b));
    }
    public void peri(){
        System.out.println("Perimeter of Rectangle : " + (2*(l+b)));
    }
}
public class RectCircle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("1) Circle \n2) Rectangle \n3) Exit");
       System.out.println("Enter Choice: ");
       int ch = sc.nextInt();
       do{
        switch (ch) {
            case 1:
                System.out.println("Enter radius : ");
                double r = sc.nextDouble();
                circle c = new circle(r); 
                c.area();
                c.peri();
                break;
            case 2:
                System.out.println("Enter lenght : ");
                double l = sc.nextDouble();
                System.out.println("Enter breadth : ");
                double b = sc.nextDouble();
                rectangle r1 = new rectangle(l,b); 
                r1.area();
                r1.peri();
                break;
            case 3:
                System.out.println("Exiting....");
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
       }while(ch!=3);
     
    }
    
}
