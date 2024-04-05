package Inheritance;

public class Car {
    private String name;
    private String topSpeed;

    public Car(String name, String topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void turnOn() {
        System.out.printf("%s is turned on\n", name);
    }

    public void turnOff() {
        System.out.printf("%s is turned off\n", name);
    }

    public void drive() {
        System.out.printf("Driving %s at top speed of %s\n", name, topSpeed);
    }

    @Override
    public String toString() {
        return String.format("Nama\t\t: %s\nTop Speed\t: %s\n", name, topSpeed);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String name, String topSpeed, int batteryCapacity) {
        super(name, topSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void charge() {
        System.out.printf("%s is charging\n", getName());
        this.batteryCapacity = 100;
    }

    @Override
    public void drive() {
        System.out.printf("Driving %s at top speed of %s with battery capacity of %d %s\n", getName(), getTopSpeed(), batteryCapacity, "%");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Battery\t\t: %d\n", batteryCapacity);
    }
}

