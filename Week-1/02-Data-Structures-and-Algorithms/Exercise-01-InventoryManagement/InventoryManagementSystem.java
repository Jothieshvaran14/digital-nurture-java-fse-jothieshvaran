import java.util.HashMap;

public class InventoryManagementSystem {

    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int id, int quantity, double price) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayProducts() {
        inventory.values().forEach(System.out::println);
    }

    public static void main(String[] args) {

        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addProduct(new Product(101, "Laptop", 10, 65000));
        ims.addProduct(new Product(102, "Mouse", 25, 500));

        ims.displayProducts();

        ims.updateProduct(102, 30, 550);

        System.out.println("\nAfter Update");

        ims.displayProducts();

        ims.deleteProduct(101);

        System.out.println("\nAfter Delete");

        ims.displayProducts();
    }
}