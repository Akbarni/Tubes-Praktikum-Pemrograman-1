package pertemuan3;
public class Pattern {
    public static void main(String[] args) {
        int rows = 4; // jumlah baris, sesuaikan dengan pola yang diinginkan

        // loop untuk setiap baris
        for (int i = 0; i < rows; i++) {
            // loop untuk setiap kolom pada setiap baris
            for (int j = rows; j > i; j--) {
                System.out.print("*");
            }
            // pindah ke baris baru setelah setiap baris selesai di-print
            System.out.println();
        }
    }
}