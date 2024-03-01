package Procedural_vs_OOP.OOP;

// import java.util.*;

public class MainOOP {
    public static void main(String[] args) {
        // instansiasi --> keyword 'new'
        PersegiPanjang pp1 = new PersegiPanjang();
            // class: 'PersegiPanjang'
            // nama object: 'pp1'

        // assign atribut pada object 'pp1' dan pemanggilan method 'display' untuk menampilkan printout dari setiap atribut
        pp1.setLebar(5);
        pp1.setPanjang(10);
        pp1.display();

        System.out.println();
        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.setLebar(18);
        pp2.setPanjang(20);
        pp2.display();
    }
}
