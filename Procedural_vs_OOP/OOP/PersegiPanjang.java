package Procedural_vs_OOP.OOP;

public class PersegiPanjang {
    //instance variable
    private int panjang;
    private int lebar;

    // mutator (setter)
    public void setPanjang(int panjang) {
        this.panjang = panjang;
        // panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // accessor (getter)
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // methods
    public int hitungLuas() {
        return this.panjang * this.lebar;
    }

    public int hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public void display() {
        System.out.println("===========[OOP]==========");
        System.out.printf("Panjang persegi panjang\t\t: %d\n", this.panjang);
        System.out.printf("Lebar persegi panjang\t\t: %d\n", this.lebar);
        System.out.printf("Luas persegi panjang\t\t: %d\n", this.hitungLuas());
        System.out.printf("Keliling persegi panjang\t: %d\n", this.hitungKeliling());
    }
}
