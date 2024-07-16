import java.util.Scanner;
public class Product{
    private double price;
    Scanner sc = new Scanner(System.in);
    
    public void readData(){
        System.out.println("Enter the product prize : ");
        price = sc.nextDouble();
    }
    public double getPrice()
    {
        return price;
    }
    public static Product comparePrices(Product product1,Product product2)
    {
    return product1.getPrice() < product2.getPrice() ? product1:product2;
    }
    public static void main (String[] args)
    {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.readData();
        product2.readData();
        product3.readData();


        Product leastProduct = Product.comparePrices(product1,Product.comparePrices(product2,product3));

        System.out.println("Least Product : " + leastProduct.getPrice());
    }
}