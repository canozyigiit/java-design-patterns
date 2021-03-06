package structural.flyweight;

public class Coffee {
    protected final CoffeeFlavour flavourName; // intrinsic attribute
    protected Coffee(CoffeeFlavour flavourName) {

        super();

        this.flavourName = flavourName;

    }

    public CoffeeFlavour getFlavourName() {

        return flavourName;

    }

    protected CoffeeLatteArt applyLatteArt(CoffeeLatteArt latteArt) {

        return latteArt;

    }

}
