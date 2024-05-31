package Pertemuan5;

public class StrukturList {
    private Node HEAD;

    public class Node {
        private double data;
        private Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMiddle(double data, int index) {
        Node newNode = new Node(data);
        Node current = HEAD;
        Node previous = null;
        int count = 0;

        if (isEmpty() || index == 0) {
            addHead(data);
            return;
        }

        while (current != null && count < index) {
            previous = current;
            current = current.getNext();
            count++;
        }

        if (current == null && count == index) {
            addTail(data);
        } else if (current != null) {
            previous.setNext(newNode);
            newNode.setNext(current);
        }
    }

    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node current = HEAD;
            while (current != null) {
                System.out.print((int) current.getData() + " ");  // Mengubah ke integer untuk menghilangkan desimal
                current = current.getNext();
            }
            System.out.println();
        }
    }

    public Node getHEAD() {
        return HEAD;
    }

    public void displayElement() {
        Node current = HEAD;
        while (current != null) {
            System.out.printf("%.0f ", current.getData());
            current = current.getNext();
        }
        System.out.println();
    }

    public void removeMid(int e) {
        Node preNode = null;
        Node tempNode;
        int i = 1;
        boolean ketemu = false;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            tempNode = HEAD;
            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = HEAD.getNext();
                } else {
                    preNode.setNext(tempNode.getNext());
                }
            }
        }
    }

}