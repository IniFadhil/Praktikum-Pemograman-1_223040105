package Tubes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankQueue {
    private Queue<String> queue;

    public BankQueue() {
        this.queue = new LinkedList<>();
    }

    public void addCustomers(String customerNames) {
        String[] names = customerNames.split(",");
        for (String name : names) {
            queue.add(name.trim());
            System.out.println("Nasabah " + name.trim() + " telah ditambahkan ke dalam antrian.");
        }
    }

    public void serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("Tidak ada nasabah yang menunggu.");
        } else {
            String servedCustomer = queue.poll();
            System.out.println("Nasabah " + servedCustomer + " telah dilayani.");
        }
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Tidak ada nasabah dalam antrian.");
        } else {
            System.out.println("Antrian nasabah saat ini:");
            int idx = 1;
            for (String customer : queue) {
                System.out.println(idx + ". " + customer);
                idx++;
            }
        }
    }

    public void removeCustomerByName(String customerName) {
        if (queue.isEmpty()) {
            System.out.println("Tidak ada nasabah dalam antrian.");
            return;
        }

        LinkedList<String> tempList = new LinkedList<>(queue);
        if (tempList.remove(customerName.trim())) {
            queue = new LinkedList<>(tempList);
            System.out.println("Nasabah " + customerName.trim() + " telah dihapus dari antrian.");
        } else {
            System.out.println("Nasabah " + customerName.trim() + " tidak ditemukan dalam antrian.");
        }
    }

    public static void main(String[] args) {
        BankQueue bankQueue = new BankQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu Antrian Bank ===");
            System.out.println("1. Tambah nasabah ke antrian");
            System.out.println("2. Layani nasabah");
            System.out.println("3. Tampilkan antrian");
            System.out.println("4. Hapus nasabah berdasarkan nama");
            System.out.println("5. Keluar");

            System.out.print("Pilih opsi (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Masukkan nama nasabah (pisahkan dengan koma jika lebih dari satu): ");
                    String customerNames = scanner.nextLine();
                    bankQueue.addCustomers(customerNames);
                    break;
                case "2":
                    bankQueue.serveCustomer();
                    break;
                case "3":
                    bankQueue.displayQueue();
                    break;
                case "4":
                    System.out.print("Masukkan nama nasabah yang ingin dihapus: ");
                    String customerName = scanner.nextLine();
                    bankQueue.removeCustomerByName(customerName);
                    break;
                case "5":
                    System.out.println("Terima kasih telah menggunakan layanan antrian bank.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi yang tersedia.");
            }
        }
    }
}
