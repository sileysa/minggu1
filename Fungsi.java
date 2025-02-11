public class Fungsi {
    int [][] stokBunga = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };
    int [] hargaBunga = {75000,50000,60000,10000};

    public static void hitungPendapatan() {
        int [][] stokBunga = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        int [] hargaBunga = {75000,50000,60000,10000};
        System.out.println("Pendapatan jika semua bunga habis terjual: ");    
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan=0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan+=stokBunga[i][j] * hargaBunga[j]; 
            }
            System.out.println("Royal Garden " + (i+1)+": Rp " + pendapatan);
        }
    }
    public static void tampilkanStok(){
        int [][] stokBunga = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        String [] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("Stok bunga di setiap cabang: ");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println("Royal Garden " + (i+1)+ ":");
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.println("  "+namaBunga[j]+": "+stokBunga[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        hitungPendapatan();
        tampilkanStok();
    }
}
