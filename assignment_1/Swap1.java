public class Swap1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}