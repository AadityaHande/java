public class FooCorporation {
    public static void calculatePay(double basePay, int hours) {
        if (basePay < 8.0) {
            System.out.println("Error: Base pay is less than minimum wage");
            return;
        }
        if (hours > 60) {
            System.out.println("Error: Hours exceed 60 per week");
            return;
        }
        double totalPay;
        if (hours <= 40) {
            totalPay = basePay * hours;
        } else {
            int overtime = hours - 40;
            totalPay = (40 * basePay) + (overtime * basePay * 1.5);
        }
        System.out.println("Total Pay: " + totalPay);
    }
    public static void main(String[] args) {
        System.out.println("Employee 1");
        calculatePay(7.50, 35);
        System.out.println("Employee 2");
        calculatePay(8.20, 47);
        System.out.println("Employee 3");
        calculatePay(10.00, 73);
    }
}