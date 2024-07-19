import java.util.*;
import java.io.*;

public class Read {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String fileName = sc.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName);
        System.out.println("Insert values : ");
        String text = sc.next();
        fos.write(text.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        fis.close();

        String fileContent = new String(b);
        System.out.println("Content of " + fileName + " is : \n" + fileContent);



    }
}
