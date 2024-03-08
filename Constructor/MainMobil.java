package Constructor;

public class MainMobil {
    public static void main(String[] args) {
        // instansiasi object dengan memanggil constructor 1
        Mobil mobil1 = new Mobil("Xenia", "N 8790 SH", 2017, "Automatic");

        // instansiasi object dengan memanggil constructor 2
        Mobil mobil2 = new Mobil();

        // instansiasi object dengan memanggil constructor 3
        Mobil mobil3 = new Mobil("Innova Diesel", "K 7812 AB");
        // mobil3.tahun = 2018;

        Mobil copyOfMobil1 = mobil1.copy(mobil1);

        System.out.println(mobil1 + "\n");
        System.out.println(mobil2 + "\n");
        System.out.println(mobil3 + "\n");
        System.out.println(copyOfMobil1 + "\n");

        // instance method
        mobil1.Maju();
        mobil1.Mundur();
        mobil1.Belok();
        mobil1.Berhenti();
    }
}
