import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        String[] matkul = {"Pancasila","KTI","CTPS","MatDas","BIG","DasPro","PrakDasPro","K3"};
        int jmlMatkul = matkul.length;
        double [] nilaiAngka = new double[jmlMatkul];
        String [] nilaiHuruf = new String[jmlMatkul]; 
        double [] bobotNilai = new double[jmlMatkul];

        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan nilai angka untuk MK "+ matkul[i]+ ": ");
            nilaiAngka[i]= leli.nextDouble();
            nilaiHuruf[i]= konversiNilai(nilaiAngka[i]);
            bobotNilai[i]= konversiBobotNilai(nilaiHuruf[i]);
        }
        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");

        double totalBobot=0;
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf("%-20s %-15.2f %-15s %-15.2f%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot+=bobotNilai[i];
        }

        double ip= totalBobot/jmlMatkul;
        System.out.printf("\nIP: %.2f%n", ip);

    }
    public static String konversiNilai(double nilai){
        if (nilai>80 && nilai <=100) {
            return "A";
        } else if (nilai>73 && nilai<=80) {
            return "B+";
        } else if (nilai>65 && nilai<=73) {
            return "B";
        } else if (nilai>60 && nilai<=65) {
            return "C+";
        } else if (nilai>50 && nilai<=60) {
            return "C";
        } else if (nilai>39 && nilai<=50) {
            return "D";
        } else {
            return "E";
        }
    }
    public static double konversiBobotNilai (String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.00;
            case "B+":
                return 3.50;
            case "B":
                return 3.00;
            case "C+":
                return 2.50;
            case "C":
                return 2.00;
            case "D":
                return 1.00;
            default:
                return 0.00;
        }
    }
}
