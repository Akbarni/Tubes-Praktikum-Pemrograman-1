package LatihanTubes;

import java.util.Scanner;

public class BankGraph {
    private Graph bankGraph;
    private Scanner scanner;

    public BankGraph() {
        bankGraph = new Graph();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Cabang Bank");
            System.out.println("2. Tambah Jalur Komunikasi antara Cabang");
            System.out.println("3. Tampilkan Graf Jaringan Bank");
            System.out.println("4. Keluar");

            System.out.print("Pilih opsi: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                System.out.print("Masukkan nama cabang bank: ");
                String cabang = scanner.nextLine();
                bankGraph.addVertex(cabang);
            } else if (pilihan.equals("2")) {
                System.out.print("Masukkan nama cabang bank pertama: ");
                String cabang1 = scanner.nextLine();
                System.out.print("Masukkan nama cabang bank kedua: ");
                String cabang2 = scanner.nextLine();
                bankGraph.addEdge(cabang1, cabang2);
            } else if (pilihan.equals("3")) {
                bankGraph.displayGraph();
            } else if (pilihan.equals("4")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        scanner.close();
    }
}