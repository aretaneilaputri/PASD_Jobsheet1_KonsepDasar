import java.util.Scanner;

public class TugasNomor2 {

    public static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n===== DAFTAR JADWAL KULIAH =====");
        System.out.printf("%-25s %-20s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n, Scanner sc) {
        System.out.print("Masukkan hari yang dicari: ");
        String hariCari = sc.nextLine();
        boolean ditemukan = false;

        System.out.println("\nJadwal pada hari " + hariCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println("- " + jadwal[i][0] +
                        " | " + jadwal[i][1] +
                        " | " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariMatkul(String[][] jadwal, int n, Scanner sc) {
        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String matkulCari = sc.nextLine();
        boolean ditemukan = false;

        System.out.println("\nHasil pencarian mata kuliah:");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkulCari)) {
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Cari berdasarkan hari");
            System.out.println("3. Cari berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    tampilSemua(jadwal, n);
                    break;
                case 2:
                    cariHari(jadwal, n, sc);
                    break;
                case 3:
                    cariMatkul(jadwal, n, sc);
                    break;
                case 4:
                    System.out.println("Program Selesai!!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        sc.close();
    }
}
