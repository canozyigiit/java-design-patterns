package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String name;
    private List<Priceable> priceables;

    public Basket(String name) {
        this.name = name;
        this.priceables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Priceable> getPriceables() {
        return priceables;
    }

    public void setPriceables(List<Priceable> priceables) {
        this.priceables = priceables;
    }

    public BigDecimal getTotalPrice(){
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Priceable priceable : priceables){
            totalPrice = totalPrice.add(priceable.getPrice());
        }
        return  totalPrice;
    }
}
