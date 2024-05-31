package Pertemuan7;

public class ListMatakuliah {
	private Node HEAD;

    public ListMatakuliah() {
        HEAD = null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(Matakuliah data, int position) {
        if (position <= 0) {
            addHead(data);
        } else {
            Node newNode = new Node(data);
            Node current = HEAD;
            for (int i = 0; i < position - 1 && current.getNext() != null; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    
    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node temp = HEAD;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    
 

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah: " + curNode.getData().getKode() + ", " + curNode.getData().getNama() + ", " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }
}