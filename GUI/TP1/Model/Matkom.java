package GUI.TP1.Model;

public class Matkom extends Matkul {
    public Matkom(int tugas, int kuis, int uts, int uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
        hitungNilaiAkhir(tugas, kuis, uts, uas);
    }

    // rumus perhitungan nilai akhir Matkom:
    // 30% tugas + 20% kuis + 30% uts + 20% uas
    @Override
    public void hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        this.nilaiAkhir = 0.3 * tugas + 0.2 * kuis + 0.3 * uts + 0.2 * uas;
    }

    public double getNilaiAkhir() {
        return this.nilaiAkhir;
    }
}
