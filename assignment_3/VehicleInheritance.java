class Vehicle {

    String brand;
    int speed;
    static int count = 0;   // static variable
    final int maxSpeed = 200;  // final variable

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        count++;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {

    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);   // parent constructor calll
        this.doors = doors;
    }

    void showCar() {
        super.display();   // parent method callde
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {

    int cc;

    Bike(String brand, int speed, int cc) {
        super(brand, speed);
        this.cc = cc;
    }

    void showBike() {
        super.display();
        System.out.println("Engine CC: " + cc);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {

        Car c = new Car("Toyota", 120, 4);
        Bike b = new Bike("Yamaha", 100, 150);

        System.out.println("Car Details:");
        c.showCar();

        System.out.println("\nBike Details:");
        b.showBike();

        System.out.println("\nTotal Vehicles: " + Vehicle.count);
    }
}