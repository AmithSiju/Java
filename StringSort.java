import java.util.*;

public class StringSort {
    Scanner sc = new Scanner(System.in); 
    int n;
    String s[];
    StringSort(){
        System.out.print("Enter the number of string : ");
        n = sc.nextInt();
        s = new String[n];
        System.out.print("Enter " + n + " strings : " );
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
    }
    void sort(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(s[j].compareTo(s[j+1])>0){
                    String temp = s[j];
                    s[j]= s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }
    void display(){
        for (int i = 0; i < n; i++) {
            System.out.print(s[i] +" ");
        }
    }
    public static void main(String[] args) {
        StringSort s1 = new StringSort();
        System.out.println("String before sorting : ");
        s1.display();
        s1.sort();
        System.out.println("\nString after sorting");
        s1.display();
    }
}