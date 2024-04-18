package M_2C_M_C;

import M_2C_M_C.Main;
import M_2C_M_C.InventoryService;
import java.util.Scanner;

import static M_2C_M_C.InventoryService.inventory;

/*
Модуль приготовления (Preparation Service): Управляет процессом приготовления кофе, включая взаимодействие
с инвентаризацией для списания ингредиентов ++

*/
public class PreparationService {
    public static void makeCoffeeFromOrder(Scanner visitorOrder) {
        String order = visitorOrder.nextLine();

        CoffeeMenu coffeeType = CoffeeMenu.valueOf(order); // Предполагается, что введенная строка соответствует именам enum
        double milk = coffeeType.getMilk();
        double sugar = coffeeType.getSugar();
        double caramelTopping = coffeeType.getCaramelTopping();
        double chocolateTopping = coffeeType.getChocolateTopping();
        double strawberryTopping = coffeeType.getStrawberryTopping();
        double ice = coffeeType.getIce();

        // Обновление inventory на основе заказа
        inventory.put("milk", inventory.get("milk") - milk);
        inventory.put("sugar", inventory.get("sugar") - sugar);
        inventory.put("caramelTopping", inventory.get("caramelTopping") - caramelTopping);
        inventory.put("chocolateTopping", inventory.get("chocolateTopping") - chocolateTopping);
        inventory.put("strawberryTopping", inventory.get("strawberryTopping") - strawberryTopping);
        inventory.put("ice", inventory.get("ice") - ice);
    }
}

