//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferReaderVsScanner {
    public static void main(String[] args) throws IOException {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Integer:");
        int i = Integer.parseInt(in.nextLine());
        System.out.print("\nEnter the String:");
        String str=in.nextLine();//This line will be skipped because Scanner skips the nextline which after the nextInt, nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
        System.out.println(i +"-"+str);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter Integer:");
//        int ii= Integer.parseInt(br.readLine());
//        System.out.print("\nEnter the String:");
//        String b = br.readLine();
//        System.out.println(ii +"-"+b);
    }
}
