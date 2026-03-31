public class Swap2 {
    public static void main(String[] args) {

        int a = 6;
        int b = 8;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}