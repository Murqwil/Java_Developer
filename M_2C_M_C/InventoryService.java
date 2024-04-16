package M_2C_M_C;
/*
Модуль инвентаризации (Inventory Service): Отвечает за учет и управление запасами ингредиентов для приготовления кофе,
уведомляет о необходимости пополнения запасов.
*/

import java.util.HashMap;
import java.util.function.DoubleBinaryOperator;

public class InventoryService {
    //коллекция для понимания,что есть на складе.
    static HashMap<String, Double> inventory = new HashMap<>();

    //Метод добавления в коллекцию новой продукции.
    public static void deliveryNewProduct(String item, double quantity) {
        inventory.put(item, quantity);
    }

    //Метод,что будет отслеживать кол-во продукции,в случае чего мы должны добавить больше
    public static void goingEndSoon() {
        for (String product : inventory.keySet()) {
            double quantity = inventory.get(product);
            if (quantity < 3) {
                System.out.println("Внимание! Заканчивается " + product + ". Текущий запас: " + quantity);
                deliveryNewProduct(product,5);
            }
        }
    }
}
