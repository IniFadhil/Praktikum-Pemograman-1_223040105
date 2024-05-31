package Tugas2;

public class Tes1A {
	public static void main (String [] args) {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(2);
		list.addTail(1);
		
		System.out.println("Elemen: ");
		list.displayElement();
			
	}
}