import java.io.*;
public class EvenOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter path of Input file : ");
        String inputFile = reader.readLine();
        String evenFile = "even.txt";
        String oddFile = "odd.txt";
        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFile));
        BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFile));
        String line;
        while ((line=fileReader.readLine())!=null) {
            int num=Integer.parseInt(line);
            if (num%2 == 0) {
                evenWriter.write(line);
                evenWriter.newLine();
            }else{
                oddWriter.write(line);
                oddWriter.newLine();
            }
        }
        reader.close();
        oddWriter.close();
        evenWriter.close();
        fileReader.close();
    }
}
