package Latihan1;

public class Node {
    private int nilai;
    private Node next;

    // inisialisasi
    public Node(int nilai) {
        this.nilai = nilai;
    }

    // Setter untuk nilai
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    // Getter untuk nilai
    public int getNilai() {
        return nilai;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
}