package Encapsulation;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Budi");
        customer1.setAccountNumber("123018208136");
        
        // pemanggilan method 'setPINNumber' yang pertama --> menggunakan parameter string
        // customer1.setPINNumber("1283");

        // pemanggilan method 'setPINNumber' yang kedua --> user bisa meng-input PIN melalui scanner
        customer1.setPINNumber();

        System.out.println(customer1.getPINNumber());

        // System.out.println("Nama\t\t: " + customer1.getName());
        // System.out.println("No. Rekening\t: " + customer1.getAccountNumber());
        // System.out.println("PIN\t\t: " + customer1.getPINNumber());
    }
}
