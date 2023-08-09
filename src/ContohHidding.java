public class ContohHidding {
    private int angka = 10;// variable instance

    public void contohMetode() {
        int angka = 5;// variable lokal =/= variable instance

        System.out.println("angka lokal: " + angka);

        // jika ingin mengakses variable instance harus menggunakan kata kunci this
        System.out.println("angka instance: " + this.angka);
    }

    public static void main(String[] args) {
        ContohHidding contoh = new ContohHidding();
        contoh.contohMetode();
    }
}