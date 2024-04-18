package M_2C_M_C;
/*
Модуль инвентаризации (Inventory Service): Отвечает за учет и управление запасами ингредиентов для приготовления кофе,
уведомляет о необходимости пополнения запасов. ++
*/

import java.util.HashMap;
import java.util.function.DoubleBinaryOperator;
import M_2C_M_C.DeliveryNewProduct;

import static M_2C_M_C.DeliveryNewProduct.deliveryNewProduct;

public class InventoryService {
    //коллекция для понимания,что есть на складе.
    static HashMap<String, Double> inventory = new HashMap<>();

    //Метод добавления в коллекцию новой продукции.

    //Метод,что будет отслеживать кол-во продукции,в случае чего мы должны добавить больше
    public static void goingEndSoon() {
        for (String product : inventory.keySet()) {
            double quantity = inventory.get(product);
            if (quantity < 3) {
                System.out.println("Внимание! Заканчивается " + product + ". Текущий запас: " + quantity);

                //Тут должны вызывать метод из класс DeliveryNewProduct
                deliveryNewProduct(product,5);
                System.out.println("Ваши запасы были пополнены: " + product + "Текущий запас: " + quantity);
            }
        }
    }
}
