package M_2C_M_C;

import java.util.Map;

public class PreparationService {
    public void makeCoffee(Visitor visitor, CoffeeMenu coffeeType, Map<String, Double> inventory) {
        double milk = coffeeType.getMilk();
        double sugar = coffeeType.getSugar();
        double caramelTopping = coffeeType.getCaramelTopping();
        double chocolateTopping = coffeeType.getChocolateTopping();
        double strawberryTopping = coffeeType.getStrawberryTopping();
        double ice = coffeeType.getIce();

        if (inventory.get("milk") >= milk && inventory.get("sugar") >= sugar &&
                inventory.get("caramelTopping") >= caramelTopping && inventory.get("chocolateTopping") >= chocolateTopping &&
                inventory.get("strawberryTopping") >= strawberryTopping && inventory.get("ice") >= ice) {
            // Вычитаем ингредиенты из инвентаря
            inventory.put("milk", inventory.get("milk") - milk);
            inventory.put("sugar", inventory.get("sugar") - sugar);
            inventory.put("caramelTopping", inventory.get("caramelTopping") - caramelTopping);
            inventory.put("chocolateTopping", inventory.get("chocolateTopping") - chocolateTopping);
            inventory.put("strawberryTopping", inventory.get("strawberryTopping") - strawberryTopping);
            inventory.put("ice", inventory.get("ice") - ice);

            System.out.println("Кофе готово! Приятного кофепития, " + visitor.getName() + "!");
        } else {
            System.out.println("Извините, не хватает ингредиентов для приготовления кофе.");
        }
    }
}


