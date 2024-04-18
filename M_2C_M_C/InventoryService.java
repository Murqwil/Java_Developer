package M_2C_M_C;
/*
Модуль инвентаризации (Inventory Service): Отвечает за учет и управление запасами ингредиентов для приготовления кофе,
уведомляет о необходимости пополнения запасов. ++
*/

import java.util.HashMap;
import java.util.Map;


public class InventoryService {
    private Map<String, Double> inventory;

    public InventoryService() {
        this.inventory = new HashMap<>();
    }

    public Map<String, Double> getInventory() {
        return inventory;
    }

    public void deliveryNewProduct(String item, double quantity) {
        if (inventory.containsKey(item)) {
            double currentQuantity = inventory.get(item);
            inventory.put(item, currentQuantity + quantity);
        } else {
            inventory.put(item, quantity);
        }
    }

    public void goingEndSoon() {
        for (String product : inventory.keySet()) {
            double quantity = inventory.get(product);
            if (quantity < 3) {
                System.out.println("Внимание! Заканчивается " + product + ". Текущий запас: " + quantity);
                deliveryNewProduct(product, 5);
                System.out.println("Ваши запасы были пополнены: " + product + "Текущий запас: " + quantity);
            }
        }
    }
}

