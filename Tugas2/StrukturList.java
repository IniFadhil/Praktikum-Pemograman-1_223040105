package Tugas2;

public class StrukturList {
	private int data;
	Node head;
	
// function isEmpty() mengecek apakah list kosong atau tidak
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addTail (int data) {
		Node posNode=null, curNode=null;
		
		Node newNode=new Node(data);
		if(isEmpty()) {
			head = newNode;
		}else {
			curNode = head;
			while (curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();			
			}
			posNode.setNext(newNode);
		}

	}
	
	
	public void addHead(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head =newNode;
		}
		
	}
	
	public void displayElement() {
		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}


}