package structural.composite;

import java.math.BigDecimal;
import java.util.List;

public class CalculatePrice {

    public static BigDecimal getTotalProductPrice(List<Product> productList){
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product: productList){
            totalPrice = totalPrice.add( product.getPrice());
        }

        return totalPrice;
    }


    public static BigDecimal getTotalPackagePrice(List<Package> packageList){
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Package aPackage: packageList){
            totalPrice = totalPrice.add(aPackage.getPrice());
        }

        return totalPrice;
    }
}
