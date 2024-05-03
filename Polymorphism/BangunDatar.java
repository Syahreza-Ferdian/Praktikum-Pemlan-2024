package Polymorphism;

public abstract class BangunDatar {
    public abstract void create();
    public abstract void hitungLuas();
}

class Persegi extends BangunDatar {
    @Override
    public void create() {
        System.out.println("Membuat Persegi");
    }

    @Override
    public void hitungLuas() {
        int sisi = 5;
        System.out.printf("Luas persegi: %d\n", sisi * sisi);
    }
}

class Lingkaran extends BangunDatar {
    @Override
    public void create() {
        System.out.println("Membuat Lingkaran");
    }

    @Override
    public void hitungLuas() {
        int r = 7;
        System.out.printf("Luas lingkaran: %.2f\n", Math.PI * r * r);
    }
}
