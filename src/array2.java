// Rotate an Array

import java.util.Scanner;

public class array2 {
     static int[] RotateArray(int[] arr, int d,int n) {
        int[] temp = new int[n];
        int k=0;
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        return arr;
     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Elements:");
        int n= scan.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter to rotate from Index: ");
        int d=scan.nextInt();

        System.out.println("Rotated Array: ");
        int rotArr[] = new int[n];
        rotArr=RotateArray(arr,d,n);
        int i=0;
        while(i<n){
            System.out.print(rotArr[i]+" ");
            i++;
        }
    }
}
