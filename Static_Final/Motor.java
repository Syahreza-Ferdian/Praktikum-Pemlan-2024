package Static_Final;

public class Motor {
    private String merk;
    private static int jumlahMotor;

    public Motor(String merk) {
        this.merk = merk;
        jumlahMotor++;
    }

    public void ride() {
        System.out.printf("Riding %s\n", merk);
    }

    public int getJumlahMotor() {
        return jumlahMotor;
    }

    public String getMerk() {
        return merk;
    }
}
