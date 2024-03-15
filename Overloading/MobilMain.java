package Overloading;

@SuppressWarnings("unused")

public class MobilMain {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Xenia", "N 8790 SH", 2017, "Automatic");

        // instansiasi object dengan memanggil constructor 2
        Mobil mobil2 = new Mobil();

        // instansiasi object dengan memanggil constructor 3
        Mobil mobil3 = new Mobil("Innova Diesel", "K 7812 AB");

        mobil3.Maju(160);
        mobil3.Belok("kanan");
    }
}
