import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input NIM 
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();

        // Ambil 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n = n + 10;
        }

        // Tampilkan nilai n
        System.out.println("maka n=" + n);
        System.out.println("Output: ");

        // Cetak deret
        for (int i = 1; i <= n; i++) {

            // 10 dan 15 tidak dicetak
            if (i == 10) {
                continue;
            }
            if (i == 15) {
                continue;
            }

            // Kelipatan 3
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            // Bilangan genap (bukan kelipatan 3)
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            // Bilangan ganjil
            else {
                System.out.print("* ");
            }
        }
    }
}
