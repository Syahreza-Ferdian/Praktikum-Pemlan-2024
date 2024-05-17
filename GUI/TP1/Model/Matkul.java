package GUI.TP1.Model;

public abstract class Matkul {
    protected int tugas, kuis, uts, uas;
    protected double nilaiAkhir;

    public abstract void hitungNilaiAkhir(int tugas, int kuis, int uts, int uas);
}
