package AccesLevel.Data;

public class Product {
    protected String name;
    protected int price;

    // jika memnggunakan private akan error

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
