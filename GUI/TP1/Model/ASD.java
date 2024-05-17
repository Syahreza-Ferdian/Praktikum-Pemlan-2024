package GUI.TP1.Model;

public class ASD extends Matkul {
    public ASD(int tugas, int kuis, int uts, int uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
        hitungNilaiAkhir(tugas, kuis, uts, uas);
    }

    // rumus perhitungan nilai akhir ASD:
    // 25% tugas + 25% kuis + 25% uts + 25% uas
    @Override
    public void hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        this.nilaiAkhir = 0.25 * tugas + 0.25 * kuis + 0.25 * uts + 0.25 * uas;
    }

    public double getNilaiAkhir() {
        return this.nilaiAkhir;
    }
}

