import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("==============================");

        if (tugas < 0) {
            System.out.println("nilai tidak valid");
        } else if (tugas > 100) {
            System.out.println("nilai tidak valid");
        } else if (kuis < 0) {
            System.out.println("nilai tidak valid");
        } else if (kuis > 100) {
            System.out.println("nilai tidak valid");
        } else if (uts < 0) {
            System.out.println("nilai tidak valid");
        } else if (uts > 100) {
            System.out.println("nilai tidak valid");
        } else if (uas < 0) {
            System.out.println("nilai tidak valid");
        } else if (uas > 100) {
            System.out.println("nilai tidak valid");
        } else {

            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            String nilaiHuruf;

            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 40) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");

            if (nilaiHuruf.equals("A")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiHuruf.equals("B+")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiHuruf.equals("B")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiHuruf.equals("C+")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("MAAF ANDA TIDAK LULUS");
            }
        }

        System.out.println("==============================");
    }
}
