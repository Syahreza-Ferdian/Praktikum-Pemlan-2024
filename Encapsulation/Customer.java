package Encapsulation;

import java.util.Scanner;

public class Customer {
    private String name;
    private String accountNumber;
    private String PINNumber;
    private Scanner sc = new Scanner(System.in);

    // setter (mutator)
    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setPINNumber(String pINNumber) {
        // menambahkan logic pengecekan pada setter
        int jmlDigit = pINNumber.length();

        if (jmlDigit != 4) {
            System.out.println("ERROR: PIN harus terdiri dari 4 digit");
        } else {
            this.PINNumber = pINNumber;
            System.out.println("SUCCESS: PIN berhasil ditambahkan");
        }
    }
    
    // method overloading
    public void setPINNumber() {
        boolean stopLoop = false;
        while (!stopLoop) {
            System.out.print("Masukkan nomor PIN anda: ");
            String PINNumber = sc.nextLine();
            int jmlDigit = PINNumber.length();

            if (jmlDigit != 4) {
                System.out.println("ERROR: PIN harus terdiri dari 4 digit\n");
                continue;
            }

            this.PINNumber = PINNumber;
            System.out.println("SUCCESS: PIN berhasil ditambahkan\n");
            stopLoop = true;
        }
    }

    // Getter (accessor)
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPINNumber() {
        return PINNumber;
    }
}
