package Class_dan_object;

public class MainMobil {
    public static void main(String[] args) {
        // instansiasi object mobil1
        Mobil mobil1 = new Mobil();

        // assign atributes untuk object mobil1
        mobil1.merk = "Innova Reborn";
        mobil1.platNomor = "N 1987 GH";
        mobil1.tahun = 2016;
        mobil1.transmisi = "Automatic";

        // pemanggilan methods object mobil1
        mobil1.maju();
        mobil1.mundur();

        System.out.println();

        // instansiasi object mobil2
        Mobil mobil2 = new Mobil();
        mobil2.merk = "Toyota Avanza";
        mobil2.platNomor = "K 7812 SH";
        mobil2.tahun = 2015;
        mobil2.transmisi = "Manual";

        mobil2.maju();
        mobil2.mundur();
    }
}
