package Pertemuan7;

public class MatakuliahMain {
	
	    public static void main(String[] args) {
	        ListMatakuliah list = new ListMatakuliah();

	       list.addHead(new Matakuliah("IF003", "Pemrograman Web", 3));
	       list.addMid(new Matakuliah("IF004", "Dasar Pemrograman", 3),0);
	       list.addTail(new Matakuliah("IF002", "Struktur Diskrit", 3));
	       list.addTail(new Matakuliah("IF001", "Konstruksi PL Berorientasi Objek", 3));
		      
	       list.displayElement();
	    }
	}