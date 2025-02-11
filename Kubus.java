import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner sil = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4): ");
            pilihan = sil.nextInt();
            if (pilihan>=1 && pilihan<=3) {
                System.out.print("Masukkan panjang sisi: ");
                int sisi = sil.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println("Volume Kubus: "+ hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: "+ hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: "+ hitungKeliling(sisi));
                        break;
                }
            }else if (pilihan!=4) {
                System.out.println("Pilihan tidak valid");
            }
        } while (pilihan!=4);
    }
    public static int hitungVolume(int sisi){
        return sisi*sisi*sisi;
    }
    public static int hitungLuasPermukaan(int sisi){
        return 6*(sisi*sisi);
    }
    public static int hitungKeliling(int sisi){
        return 12*sisi;
    }
}
