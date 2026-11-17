public class main3 {
    public static void main(String[] args) {

        // Nomor 3: Type Casting
        double angka1 = 9.99;
        int hasil1 = (int) angka1;

        int angka2 = 65;
        char hasil2 = (char) angka2;

        char huruf = 'z';
        int hasil3 = (int) huruf;

        System.out.printf("9.99 menjadi int: %d%n", hasil1);
        System.out.printf("65 menjadi char: %c%n", hasil2);
        System.out.printf("'z' menjadi int: %d%n", hasil3);

        // Nomor 4: Memperbaiki int x = 3.5

        // Cara 1: Menggunakan double
        double x = 3.5;
        System.out.printf("Cara 1: x = %.1f%n", x);

        // Cara 2: Menggunakan casting
        int y = (int) 3.5;
        System.out.printf("Cara 2: y = %d%n", y);
    }
}

