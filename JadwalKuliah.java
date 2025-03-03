import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(System.in);

    System.out.print ("Jumlah Mata Kuliah: ");
    int n = sc.nextInt();

    String[] namaMatkul = new String[n];
    int[] sks = new int[n];
    int[] semester = new int[n];
    String[] hari = new String[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Data Mata Kuliah Ke-" + (i+1) + ": ");
        System.out.print("Nama Mata Kuliah: ");
        namaMatkul[i] = input.nextLine();
        System.out.print("Jumlah SKS: ");
        sks[i] = input.nextInt();
        System.out.print("Semester: ");
        semester[i] = input.nextInt();
        input.nextLine();
        System.out.print("Hari Kuliah: ");
        hari[i] = input.nextLine();
        System.out.println("===================================");
    }

    int pilihan;
    do {
        System.out.println("=================================================");
        System.out.println("1. Tampilkan seluruh jadwal kuliah");
        System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
        System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
        System.out.println("4. Cari mata kuliah berdasarkan nama mata kuliah");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Jadwal Kuliah: ");
                tampilkanJadwal(namaMatkul, sks, semester, hari);
                break;
            case 2:
                System.out.print("Hari yang Ingin Ditampilkan: ");
                String tampilHari = input.nextLine();
                tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hari, tampilHari);
                break;
            case 3:
                System.out.print("Semester yang Ingin Ditampilkan: ");
                int tampilSemester = input.nextInt();
                tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hari, tampilSemester);
                break;
            case 4:
                System.out.print("Nama Mata Kuliah yang Ingin Dicari: ");
                String cariMatkul = input.nextLine();
                cariMataKuliah(namaMatkul, sks, semester, hari, cariMatkul);
                break;
            case 5:
                System.out.println("Program selesai. Terimakasih!");
            default:
                break;
        }
    } while (pilihan != 5);
    }

    public static void tampilkanJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hari) {
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] hari, String cariHari) {
        boolean cari = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari: " + hari[i]);
                cari = true;
            }
        }
        if (!cari) {
            System.out.println("Tidak ada matkul tersebut");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] hari, int cariSemester) {
        boolean cari = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari: " + hari[i]);
                cari = true;
            }
        }
        if (!cari) {
            System.out.println("Tidak ada matkul tersebut");
        }
    }

    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hari, String matkul) {
        boolean cari = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(matkul)) {
                System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari: " + hari[i]);
                cari = true;
                break;
            }
        }
        if (!cari) {
            System.out.println("Tidak ada matkul tersebut");
        }
    }
}
