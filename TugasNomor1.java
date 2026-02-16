import java.util.Scanner;

public class TugasNomor1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        char[][] KOTA = {
            {'B','A','N','T','E','N','\0','\0','\0','\0','\0','\0'},
            {'J','A','K','A','R','T','A','\0','\0','\0','\0','\0'},
            {'B','A','N','D','U','N','G','\0','\0','\0','\0','\0'},
            {'C','I','R','E','B','O','N','\0','\0','\0','\0','\0'},
            {'B','O','G','O','R','\0','\0','\0','\0','\0','\0','\0'},
            {'P','E','K','A','L','O','N','G','A','N','\0','\0'},
            {'S','E','M','A','R','A','N','G','\0','\0','\0','\0'},
            {'S','U','R','A','B','A','Y','A','\0','\0','\0','\0'},
            {'M','A','L','A','N','G','\0','\0','\0','\0','\0','\0'},
            {'T','E','G','A','L','\0','\0','\0','\0','\0','\0','\0'}
        };

        System.out.print("Masukkan kode plat nomor: ");
        char kodeInput = sc.next().toUpperCase().charAt(0);

        int posisi = -1;

        for (int i = 0; i < KODE.length; i++) {
            if (kodeInput == KODE[i]) {
                posisi = i;
            }
        }

        
        if (posisi != -1) {
            System.out.print("Kode " + kodeInput + " berasal dari kota: ");

            for (int j = 0; j < 12; j++) {
                if (KOTA[posisi][j] == '\0') {
                    break;
                }
                System.out.print(KOTA[posisi][j]);
            }

            System.out.println();
        } else {
            System.out.println("Kode plat tidak terdaftar!!");
        }

        sc.close();
    }
}
