package structural.composite;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        Product product = new Product("Casper Laptop", BigDecimal.valueOf(7500));
        Product product1 = new Product("Asus Laptop", BigDecimal.valueOf(10500));
        Product product2 = new Product("İphone 8 Plus", BigDecimal.valueOf(5500));
        Product product3 = new Product("Airpods",BigDecimal.valueOf(2500));

        Package technologyPackage = new Package("Technology Package");
        technologyPackage.getProductList().add(product2);
        technologyPackage.getProductList().add(product3);





        Basket basket = new Basket("MyBasket");
        basket.getPriceables().add(technologyPackage);
        basket.getPriceables().add(product);
        basket.getPriceables().add(product1);

        System.out.println("Total Price : " + basket.getTotalPrice());
    }
}
