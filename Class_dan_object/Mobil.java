package Class_dan_object;

public class Mobil {
    public String merk;
    public String platNomor;
    public int tahun;
    public String transmisi;


    // methods (behaviour)
    public void maju() {
        System.out.printf("Mobil %s dengan plat nomor %s bergerak maju\n", merk, platNomor);
    }

    public void mundur() {
        System.out.printf("Mobil %s dengan plat nomor %s bergerak mundur\n", this.merk, this.platNomor);
    }
}
