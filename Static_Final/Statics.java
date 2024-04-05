package Static_Final;

public class Statics {

    // Static variable
    static final int max_player = 20;
    static String b = "Hello World";

    // Static method
    static void thisIsStaticMethod() {
        System.out.printf("Hello From Static Method\n");
    }

    // non static method
    void thisIsNonStaticMethod() {
        System.out.printf("Hello From Non Static Method\n");
    }

    // Static block
    static {
        System.out.printf("Hello From Static Block\n");
    }

    // contoh apabila method main berada di class yang sama. Perhatikan cara pemanggilan variabel dan method static
    // pada class Statics, variabel dan method static dipanggil dengan cara langsung memanggil variabel atau method tersebut
    // sedangkan variabel dan method non static dipanggil dengan cara membuat object dari class Statics tersebut

    // public static void main(String[] args) {
    //     System.out.printf("Nilai max_player: %d\n", max_player);

    //     thisIsStaticMethod(); // method static bisa langsung dipanggil tanpa perlu membuat object

    //     Statics obj = new Statics();
    //     obj.thisIsNonStaticMethod(); // method non static harus dipanggil melalui object
    // }
}

// contoh apabila method main berada di class yang berbeda. Perhatikan cara pemanggilan variabel dan method static
// pada class Main, variabel dan method static dipanggil dengan cara Statics.variabel atau Statics.method
// sedangkan variabel dan method non static dipanggil dengan cara membuat object dari class Statics tersebut
class Main {
    public static void main(String[] args) {
        System.out.printf("Nilai variabel max_player: %d\n", Statics.max_player);

        Statics.thisIsStaticMethod(); // method static bisa langsung dipanggil tanpa perlu membuat object

        Statics obj = new Statics();
        obj.thisIsNonStaticMethod(); // method non static harus dipanggil melalui object
    }
}