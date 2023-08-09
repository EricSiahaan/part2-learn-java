package AccesLevel.Data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Laptop Asus", 100000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
