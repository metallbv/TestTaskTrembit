
import java.util.Arrays;
import java.util.Comparator;

// Создайте функцию которая сортирует массив объектов, задавая поле для сортировки.

public class ArraysComparator {

    static class SortedByPrice implements Comparator<Product> {

        public int compare(Product obj1, Product obj2) {

            double price1 = obj1.getPrice();
            double price2 = obj2.getPrice();

            if(price1 > price2) {
                return 1;
            }
            else if(price1 < price2) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }

    static class SortedByName implements Comparator<Product> {

        public int compare(Product obj1, Product obj2) {

            String str1 = obj1.getName();
            String str2 = obj2.getName();

            return str1.compareTo(str2);
        }
    }

    public static void main(String[] args) {

        // Create the array
        Product[] products = new Product[3];

        // Fill the array
        products[0] = new Product("Milk", 18.0, 30);
        products[1] = new Product("Coffee", 180.0, 35);
        products[2] = new Product("Tea", 80.0, 40);

        // no sorted
        System.out.println("no sorted");
        printArray(products);

        // sorted by price
        System.out.println("sorted by price");
        Arrays.sort(products, new SortedByPrice());
        printArray(products);

        // sorted by name
        System.out.println("sorted by name");
        Arrays.sort(products, new SortedByName());
        printArray(products);

    }

    public static void printArray(Product[] products) {
        for (Product product: products) {
            System.out.println(product);
        }
    }

}
