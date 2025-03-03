import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String [] kota = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL",
        };

        System.out.print("Kode plat nomor: ");
        char kodeNomor = sc.next().toUpperCase().charAt(0);

        boolean pilihan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == kodeNomor) {
                System.out.println("Nama kota: " + kota[i]);
                pilihan = true;
                break;
            } 
        }
        if (!pilihan) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}
