package TugasSorting;

public class Loop3 {
    public static void main(String[] args) {
        int rows = 4;

        // Pengulangan untuk setiap baris
        for (int i = 0; i < rows; i++) {
            // Pengulangan untuk menggambar bintang pada setiap kolom
            for (int j = rows; j > i; j--) {
                System.out.print("*");
            }
            // Pindah ke baris baru setelah menggambar bintang
            System.out.println();
        }
    }
}