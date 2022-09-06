import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flyodsTriangle {
    public static void main(String[] args) throws IOException {
        int n,a=1;
        System.out.print("Enter Number of Rows:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(in.readLine());

        for(int i =1;i<=n;i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
