public class LinearSearch {

    static Product search(Product[] products, String key) {

        for (Product p : products) {

            if (p.name.equalsIgnoreCase(key))

                return p;
        }

        return null;
    }

}