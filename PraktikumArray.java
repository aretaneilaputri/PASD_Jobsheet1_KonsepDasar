import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2}; 
        double[] nilaiAngka = new double[namaMK.length];

        double totalNilaiSks = 0;
        int totalSks = 0;

        System.out.println("Program Menghitung IP Semester\n");
        System.out.println("==============================================================");

        // Input nilai
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        System.out.println("\n==============================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < namaMK.length; i++) {

            String nilaiHuruf;
            double nilaiSetara;

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf = "A";
                nilaiSetara = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf = "B";
                nilaiSetara = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf = "C";
                nilaiSetara = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf = "D";
                nilaiSetara = 1;
            } else {
                nilaiHuruf = "E";
                nilaiSetara = 0;
            }

            totalNilaiSks += nilaiSetara * sks[i];
            totalSks += sks[i];

            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    namaMK[i], nilaiAngka[i], nilaiHuruf, nilaiSetara);
        }

        double ip = totalNilaiSks / totalSks;

        System.out.println("--------------------------------------------------------------");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }
}
