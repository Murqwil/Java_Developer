package M_2C_M_C;

import java.util.Map;
/*
В случае если мы понимаем,что в InventoryService заканчивается продукция,пополняем запасы. ++
*/
public class DeliveryNewProduct {
    public void deliveryNewProduct(Map<String, Double> inventory, String item, double quantity) {
        if (inventory.containsKey(item)) {
            double currentQuantity = inventory.get(item);
            inventory.put(item, currentQuantity + quantity);
        } else {
            inventory.put(item, quantity);
        }
    }
}

