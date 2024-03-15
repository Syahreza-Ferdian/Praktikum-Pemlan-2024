package Overloading;


public class Mobil {
    public String merk;
    public String platNomor;
    public int tahun;
    public String transmisi;

    // constructor 1
    public Mobil(String merk, String platNomor, int tahun, String transmisi) {
        this.merk = merk;
        this.platNomor = platNomor;
        this.tahun = tahun;
        this.transmisi = transmisi;
    }
    
    // constructor overloading
    // constructor 2
    public Mobil() {
        
    }

    // constructor 3
    public Mobil(String merk, String platNomor) {
        this.merk = merk;
        this.platNomor = platNomor;
    }

    // methods (behaviour)
    public void Maju() {
        System.out.printf("%s bergerak maju\n", this.merk);
    }

    // method overloading
    public void Maju(int kecepatan) {
        System.out.printf("%s bergerak maju dengan kecepatan %d km/jam\n", this.merk, kecepatan);
    }

    public void Mundur() {
        System.out.printf("%s bergerak mundur\n", this.merk);
    }

    public void Belok() {
        System.out.printf("%s berbelok\n", this.merk);
    }

    public void Belok(String direction) {
        System.out.printf("%s berbelok ke arah %s\n", this.merk, direction);
    }

    public void Berhenti() {
        System.out.printf("%s berhenti\n", this.merk);
    }
    

    @Override
    public String toString() {
        return String.format("Nama\t\t: %s\nPlatNomor\t: %s\nTahun\t\t: %d\nTransmisi\t: %s\n", merk, platNomor, tahun, transmisi);
    }

    public Mobil copy(Mobil mobilLain) {
        return new Mobil(mobilLain.merk, mobilLain.platNomor, mobilLain.tahun, mobilLain.transmisi);
    }

    public int cekKesamaan(Mobil mobilLain) {
        int similarity = 0;

        if (mobilLain.merk.equalsIgnoreCase(this.merk)) {
            similarity++;
        }

        if (mobilLain.platNomor.equals(this.platNomor)) {
            similarity++;
        }

        if (mobilLain.tahun == this.tahun) {
            similarity++;
        }

        if (mobilLain.transmisi.equalsIgnoreCase(this.transmisi)) {
            similarity++;
        }

        return (int)(similarity / 4.0) * 100;
    }
}
