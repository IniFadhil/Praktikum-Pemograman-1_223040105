package Latihan8_queue;
public class Tugas {
    private Node FRONT;
    private Node REAR;

    public Tugas() {
        FRONT = null;
        REAR = null;
    }

    public boolean isEmpty() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak dapat melakukan dequeue");
            return -1;
        }
        int removedData = FRONT.getData();
        FRONT = FRONT.getNext();
        if (FRONT == null) {
            REAR = null;
        }
        return removedData;
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }
        Node current = FRONT;
        System.out.print("Elemen Queue: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int ukuran() {
        int ukuran = 0;
        Node current = FRONT;
        while (current != null) {
            ukuran++;
            current = current.getNext();
        }
        return ukuran;
    }

    public int front() {
        return isEmpty() ? -1 : FRONT.getData();
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
