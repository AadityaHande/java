interface Device {

    int power = 100;   // variable (public static final by default)

    void start();
}

interface Connectivity {

    String type = "Wireless";

    void connect();
}

interface SmartDevice extends Device, Connectivity {

    void smartFeature();
}

class Phone implements SmartDevice {

    public void start() {
        System.out.println("Device started with power: " + power);
    }

    public void connect() {
        System.out.println("Connected via " + type);
    }

    public void smartFeature() {
        System.out.println("Using smart features");
    }
}

// Functional interface for lambda
interface Operation {
    int operate(int a, int b);
}

public class SmartDeviceDemo {
    public static void main(String[] args) {

        Phone p = new Phone();

        p.start();
        p.connect();
        p.smartFeature();

        // Lambda expression
        Operation add = (a, b) -> a + b;

        System.out.println("Lambda Result: " + add.operate(5, 3));
    }
}