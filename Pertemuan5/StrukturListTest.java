package Pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
        // Urutan Instruksi
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen sehingga elemenlist berisi (2, 6, 3, 5, 1)
        myList.addTail(2);
        myList.addTail(6);
        myList.addTail(3);
        myList.addTail(5);
        myList.addTail(1);

        // Tampilkan elemen list
        System.out.print("Elemen list: ");
        myList.printList();

        // Hapus elemen 3 di tengah list
        myList.removeMid(3);

        // Tampilkan elemen list
        System.out.print("Elemen list setelah penghapusan: ");
        myList.printList();
        
        // Hapus elemen 3 di tengah list
        myList.removeMid(6);
        
        // Hapus elemen 3 di tengah list
        myList.removeMid(5);
        
        // Tampilkan elemen list
        System.out.print("Elemen list setelah penghapusan: ");
        myList.printList();
    }
}