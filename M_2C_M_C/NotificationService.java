package M_2C_M_C;

import java.util.Scanner;

import static M_2C_M_C.InventoryService.inventory;

/*
Модуль уведомлений (Notification Service): Отвечает за отправку уведомлений
клиентам о статусе заказа, оплаты и доставки.
*/
public class NotificationService {
    public static void sendStatusOrder_Price(Scanner visitorOrder) {
        String order = visitorOrder.nextLine();

        try {
            CoffeeMenu coffeeType = CoffeeMenu.valueOf(order); // Получаем тип кофе из введенного заказа
            double price = coffeeType.getPrice(); // Получаем стоимость кофе
            double time = coffeeType.getTime(); // Получаем время приготовления кофе

            // Выводим информацию о заказе
            System.out.println("Ваш заказ: " + order);
            System.out.println("Время приготовления: " + time + " минут");
            System.out.println("Цена данного кофе: " + price);
        } catch (IllegalArgumentException e) {
            System.out.println("Извините, такого напитка у нас нет.");
        }
    }
}
