import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name))
                return p;
        }
        return null;
    }

    static Product binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Phone", "Mobiles")
        };

        System.out.println("Linear Search:");
        System.out.println(linearSearch(products, "Mouse"));

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search:");
        System.out.println(binarySearch(products, "Mouse"));
    }
}