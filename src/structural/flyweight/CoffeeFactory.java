package structural.flyweight;

import java.util.WeakHashMap;

public class CoffeeFactory {
    protected static WeakHashMap<CoffeeLatteArt, Coffee> coffeeMap = new WeakHashMap<CoffeeLatteArt, Coffee>();
//Referans artık programda kullanılmıyorsa, zayıf bir referans türünün nesnesi Java'da çöp olarak toplanabilir.
    public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
        Coffee coffee = coffeeMap.get(latteArt);
        if (coffee == null) {
            coffee = new Coffee(flavourName);
            coffeeMap.put(latteArt, coffee);
        }
        System.out.printf("Making '%s' with Latte Art '%s'.\n", coffee.getFlavourName(),
                coffee.applyLatteArt(latteArt));
        return coffee;
    }

    public static int getNumberOfCoffee() {
        return coffeeMap.size();
    }
}
