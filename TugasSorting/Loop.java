package TugasSorting;

public class Loop {
    public static void main(String[] args) {

        // Pengulangan untuk setiap baris
        for (int i = 0; i < 2; i++) 
            // Pengulangan untuk menggambar bintang pada setiap kolom
            for (int j = 5; j < 8; j++) 
                System.out.print("["+ i + ","+ j+ "]");
    }
}
