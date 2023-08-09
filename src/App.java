public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    /*
     * Method Overiding => kemampuan mendeklarasikan ulang method di child class
     * yang sudah ada di parent claass
     * saat kita melakukan overidding, secara otomatis ketika kita membuat object
     * dari class child
     * method yang sudah ada tidak bisa di baca lagi misal pada class manager dan
     * vice presiden
     */

    /*
     * Super Keyword => Kadang kita ingin mengakses method yang terdapat di class
     * parent yang sudah di buat dan di overide di class child
     * kata kunci super
     * super di gunakan untuk mengakses class parent. tidak hanya method, field.
     */

    /*
     * Object Class => Setiap class yang kita buat secara otomatis adalah turunan
     * class object
     * walaupun tidak secara langsung kita eksplisitkan menyebut extends object
     * tapi secara otomatis java akan membuat class kita extends Object
     * class object adalah superclass untuk semua class yang ada di java
     */

    /*
     * Polymorphism : Berasal dari yunani berarti banyak bentul
     * Dalaam OOP, Polymorpishm adalah kemampuan sebuah object berubah bentuk untuk
     * menjadi bentuk lain erat hubungannya dengan inhertitance
     * 
     * Konsep "Overloading dan Overriding"
     */

    /*
     * Variable HidDing : Dalam java terjadi ketika sebuah variable lokal di dalam
     * suatu blok kode yang memiliki nama yang sama dengan variable
     * instance(variable anggota), ketika hal ini terjadi, variable lokal akan
     * menyembunyikan variable instance tidak dapat di akses secara langsung dalam
     * blok kode tersebut
     */

    /*
     * Package =>cara untuk mengorganisasi clas-class kedalam kelompok- kelompok
     * terkait
     * membantu untuh mencegah konflik nama classs dan memungkinkan pemisahan
     * fungsionalitas yang berbeda
     * Setiap class yang ada dalam java beradas di dalam 1 package, kecuali tidak di
     * nyatakan sebaliknya
     */

    /*
     * acess Modifier => Kemampuan membuat class. field, method, dan constructor
     * ysng dapat di aksses dari mana saja
     * 
     * Acsess Level :
     * public : Class, Pacakge, Subclass, World
     * private : Class
     * protected : class. package, subclass
     * no modifier :classs, package
     * 
     * public classs : hanya bisa di buat 1 public class di 1 file java. dan nama
     * class harus sama dengan nama file
     * 
     */
}
