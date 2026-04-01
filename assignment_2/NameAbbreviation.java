import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        String x[] = name.split(" ");
        for (int i = 0; i < x.length - 1; i++)
            System.out.print(x[i].charAt(0) + ".");
    
        System.out.print(x[x.length - 1]);
        sc.close();
    }
}