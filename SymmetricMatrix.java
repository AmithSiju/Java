import java.util.Scanner;
public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter number of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter number of cols : ");
        cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        boolean isSymmetry=true;
        if(rows!=cols){
            isSymmetry=false;
        }
        else{
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(matrix[i][j]!=matrix[j][i]){
                        isSymmetry=false;
                        break;
                    }else{
                        isSymmetry=true;
                        break;
                    }
                }
            }
        }    
        if(isSymmetry==true){
            System.out.println("Matrix is symmetric !!!");
        }else{
            System.out.println("Matrix is not symmetric !!!");
        }
        System.out.println("Symmetric matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
