package pertemuan7;
public class ListMkTest {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.displayElement();
    }
}