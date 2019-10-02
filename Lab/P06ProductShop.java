package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input;

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!"Revision".equals(input = reader.readLine())) {

            String[] data = input.split(",\\s+");

            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            if (!shops.containsKey(shop)) {
                shops.put(shop, new LinkedHashMap<>());
                shops.get(shop).put(product, price);
            } else {
                shops.get(shop).putIfAbsent(product, price);
            }
        }

        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {

            System.out.println(entry.getKey() + "->");

            Map<String, Double> produktAndPrice = entry.getValue();

            for (Map.Entry<String, Double> product : produktAndPrice.entrySet()) {
                System.out.println(String.format("Product: %s, Price: %.1f",
                        product.getKey(), product.getValue()));
            }
        }

        /*
        Може да бъде принтирано и функционално, по следния начин:

        shops.forEach((shopName, products) -> {
            System.out.println(shopName + "->");
            products.forEach((productName, productPrice) -> {
                System.out.println(String.format(
                        "Product: %s, Price: %.1f",
                        productName,
                        productPrice
                ));
            });
        });

         */

    }
}
