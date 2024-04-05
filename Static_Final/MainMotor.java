package Static_Final;

public class MainMotor {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Honda Vario 150");
        System.out.printf("Jumlah motor sekarang %d\n", motor1.getJumlahMotor());

        Motor motor2 = new Motor("Honda PCX");
        System.out.printf("Jumlah motor sekarang %d\n", motor2.getJumlahMotor());

        Motor motor3 = new Motor("Vario 160");
        System.out.printf("Jumlah motor sekarang %d\n", motor3.getJumlahMotor());
    }
}
