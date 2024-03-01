package Procedural_vs_OOP.Procedural;

public class Procedural {
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;

        int luas = hitungLuas(panjang, lebar);
        int keliling = hitungKeliling(panjang, lebar);

        display(panjang, lebar, luas, keliling);
    }

    private static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    private static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    private static void display(int panjang, int lebar, int luas, int keliling) {
        System.out.println("===========[PROCEDURAL]==========");
        System.out.printf("Panjang persegi panjang\t\t: %d\n", panjang);
        System.out.printf("Lebar persegi panjang\t\t: %d\n", lebar);
        System.out.printf("Luas persegi panjang\t\t: %d\n", luas);
        System.out.printf("Keliling persegi panjang\t: %d\n", keliling);
    }
}
