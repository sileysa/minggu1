import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n;

        System.out.print("Masukkan NIM: ");
        n = input.nextLong();

        n%=100;
        System.out.println(n);

        if (n<10) {
            n+=10;
        }
        for (int i = 1; i <= n; i++) {
            if (i==6 || i==10) {
                continue;
            }
            if (i%2==0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
    }
}
