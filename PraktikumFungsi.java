public class PraktikumFungsi {

    // Fungsi untuk menghitung pendapatan cabang
    public static int hitungPendapatan(int[] stokCabang, int[] harga) {
        int total = 0;
        for (int i = 0; i < stokCabang.length; i++) {
            total += stokCabang[i] * harga[i];
        }
        return total;
    }

    // Fungsi untuk menentukan status cabang
    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] harga = {75000, 50000, 60000, 10000};

        int[][] stok = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok[i], harga);
            String status = cekStatus(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-----------------------------------");
        }
    }
}
