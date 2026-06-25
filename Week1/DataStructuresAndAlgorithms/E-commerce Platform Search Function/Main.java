public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop"),
                new Product(102, "Mouse"),
                new Product(103, "Keyboard"),
                new Product(104, "Banana"),
                new Product(105, "Dumbells")

        };

        Product linear = LinearSearch.search(products, "Dumbells");

        System.out.println("Found (Linear): " + linear.name);

        Product binary = BinarySearch.search(products, "Banana");

        System.out.println("Found (Binary): " + binary.name);

    }

}