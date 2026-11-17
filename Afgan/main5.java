import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sisi pertama: ");
        int sisi1 = input.nextInt();
        
        System.out.print("Masukkan sisi kedua: ");
        int sisi2 = input.nextInt();
        
        System.out.print("Masukkan sisi ketiga: ");
        int sisi3 = input.nextInt();
        
        // 1. Validasi nilai sisi tidak boleh nol atau negatif
        if (sisi1 <= 0 || sisi2 <= 0 || sisi3 <= 0) {
            System.out.println("Bukan Segitiga");
        }
        // 2. Validasi ketaksamaan segitiga (jumlah dua sisi harus lebih besar dari sisi ketiga)
        else if (sisi1 + sisi2 <= sisi3 || sisi1 + sisi3 <= sisi2 || sisi2 + sisi3 <= sisi1) {
            System.out.println("Bukan Segitiga");
        }
        // 3. Cek Segitiga Sama Sisi (semua sisi sama)
        else if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga Sama Sisi");
        }
        // 4. Cek Segitiga Sama Kaki (dua sisi sama panjang)
        else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
            System.out.println("Segitiga Sama Kaki");
        }
        // 5. Jika tidak ada yang terpenuhi, maka Segitiga Sembarang
        else {
            System.out.println("Segitiga Sembarang");
        }
        
        input.close(); // Menutup scanner
    }
}