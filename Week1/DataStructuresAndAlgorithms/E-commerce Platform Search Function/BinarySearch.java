import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    static Product search(Product[] products, String key) {

        Arrays.sort(products, Comparator.comparing(a -> a.name));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].name.compareToIgnoreCase(key);

            if (compare == 0)
                return products[mid];

            if (compare < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }

}