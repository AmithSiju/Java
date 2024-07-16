import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of rows and columns of matrices : ");
       int rows = scanner.nextInt();
       int cols = scanner.nextInt();
       int matrix1[][]=new int[rows][cols];
       int matrix2[][]=new int[rows][cols];
       int sum[][]=new int[rows][cols];

       System.out.println("Enter First Matrix");
       for (int i=0;i<cols;i++){
        for(int j=0;j<rows;j++){
            matrix1[i][j] = scanner.nextInt();
        }
       }
       System.out.println("Enter Second Matrix");
       for (int i=0;i<cols;i++){
        for(int j=0;j<rows;j++){
            matrix2[i][j] = scanner.nextInt();
        }
       }
       for (int i=0;i<cols;i++){
        for(int j=0;j<rows;j++){
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
        }
       }
       System.out.println("Sum of Matrices : ");
       for (int i=0;i<cols;i++){
        for(int j=0;j<rows;j++){
            System.out.print(" "+sum[i][j]);
        }
        System.out.println("");
    }
    }
    
}
