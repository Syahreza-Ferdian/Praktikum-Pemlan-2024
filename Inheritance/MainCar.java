package Inheritance;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Honda NSX", "270");
        car1.turnOn();
        car1.drive();
        car1.turnOff();

        // print out object car1 akan memanggil method toString() yang ada di class Car
        System.out.println(car1);

        // System.out.println("\n\n");

        ElectricCar car2 = new ElectricCar("Hyundai Ioniq 5", "200", 75);
        // object Car 2 yang merupakan object dari class ElectricCar dapat mengakses semua method dari class Car
        car2.turnOn();
        car2.drive();
        car2.turnOff();

        // namun, terdapat method charge() yang secara eksklusif hanya ada di class ElectricCar
        car2.charge();

        // print out object car2 akan memanggil method toString() yang ada di class ElectricCar.
        // method toString() yang ada di class ElectricCar akan memanggil method toString() yang ada di class Car ditambah
        // dengan informasi atribut 'batteryCapacity' yang ada di class ElectricCar
        System.out.println(car2);
    }
}
