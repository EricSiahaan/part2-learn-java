public class PolyOverloading {
    // Overloading adalah kemampuan untuk mendefinisikan beberaa method dengan nama
    // yang sama di dalam satu class
    // java akan memutuskan metode mana yang akan di panggil erdasarkan jumlah atau
    // tipe argumen yang di berikan

    // Method dengan satu parameter
    public void cetak(String pesan) {
        System.out.println("pesan: " + pesan);
    }

    // Method dengan 2 parameter

    public void cetak(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan " + hasil);
    }

    public static void main(String[] args) {
        PolyOverloading contoh = new PolyOverloading();
        contoh.cetak(10, 20); // Memanggil method dengan 1 parameter
        contoh.cetak("Hello World"); // Memanggil method dengan 2 parameter
    }

    /*
     * PolyMorphism dengan Overriding ????
     * Buat sebuah parent class dengan child class
     * beserta field
     */

}