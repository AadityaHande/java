import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int rev[] = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < 10; i++)
            rev[i] = arr[9 - i];

        System.out.println("Reversed array:");
        for (int i = 0; i < 10; i++) 
            System.out.print(rev[i] + " ");
        
        sc.close();
    }
}