 package Latihan1;

public class NodeMain {

    public static void main(String[] args) {
        // Membuat urutan Node: 5, 7, 9, 8
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        // Membuat relasi antar Node
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // Menampilkan urutan Node
        Node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
