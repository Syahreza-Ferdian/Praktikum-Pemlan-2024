package Polymorphism;

public class Main {
    public static void main(String[] args) {
        BangunDatar obj1 = new Persegi();
        obj1.create(); // Output: Membuat Persegi
        obj1.hitungLuas();

        BangunDatar obj2 = new Lingkaran();
        obj2.create(); // Output: Membuat Lingkaran
    }
}
