import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double nilaiAkhir, totalNilai;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextInt();
        if (tugas/kuis/uts/uas <0 && tugas/kuis/uts/uas >100) {
            System.out.println("Nilai tidak valid");
        }
        System.out.println("==============================");
        System.out.println("==============================");
        
        
        //totalNilai = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
        nilaiAkhir = (tugas + kuis + uts + uas) / 4;

        if (nilaiAkhir >80 && nilaiAkhir <=100) {
            nilaiHuruf = "A";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiHuruf = "B+";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiHuruf = "C+";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            nilaiHuruf = "C";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiHuruf = "D";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else if (nilaiAkhir <=39) {
            nilaiHuruf = "E";
            //System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        }
        System.out.println("==============================");
        System.out.println("==============================");
        
        
    }
}
