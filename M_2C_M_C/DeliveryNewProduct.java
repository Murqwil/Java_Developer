package M_2C_M_C;

import M_2C_M_C.InventoryService;

import static M_2C_M_C.InventoryService.inventory;
/*
В случае если мы понимаем,что в InventoryService заканчивается продукция,пополняем запасы. ++

связи:

*/


public class DeliveryNewProduct {
    public static void deliveryNewProduct(String item, double quantity) {
        inventory.put(item, quantity);
    }

}
