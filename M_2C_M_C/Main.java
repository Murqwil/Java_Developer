package M_2C_M_C;

import java.util.Scanner;
import M_2C_M_C.*;
public class Main {
    public static void main(String[] args) {
        Visitor visitor = new Visitor("Иван", 10.0);
        InventoryService inventoryService = new InventoryService();
        DeliveryNewProduct deliveryNewProduct = new DeliveryNewProduct();
        NotificationService notificationService = new NotificationService();
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService();
        PreparationService preparationService = new PreparationService();

        // Пример добавления продукции в инвентарь
        inventoryService.deliveryNewProduct("Кофе Арабика", 10);
        inventoryService.deliveryNewProduct("Молоко", 20);
        inventoryService.deliveryNewProduct("Сахар", 15);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш кофейный магазин!");
        boolean shopping = true;
        while (shopping) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить кофе в корзину");
            System.out.println("2. Посмотреть корзину и оформить заказ");
            System.out.println("3. Выйти из магазина");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Доступные виды кофе:");
                    for (CoffeeMenu coffee : CoffeeMenu.values()) {
                        System.out.println(coffee.name() + " - Цена: " + coffee.getPrice());
                    }
                    System.out.println("Выберите вид кофе:");
                    CoffeeMenu selectedCoffee = CoffeeMenu.valueOf(scanner.next());
                    orderService.addItemToCart(selectedCoffee);
                    break;
                case 2:
                    double total = orderService.calculateTotal();
                    System.out.println("Общая стоимость заказа: " + total);
                    System.out.println("Оплатить заказ? (да/нет)");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("да")) {
                        paymentService.processPayment(visitor, total);
                        if (paymentService.isPay()) {
                            System.out.println("Заказ успешно оплачен. Готовим кофе!");
                            for (CoffeeMenu coffee : orderService.getCart()) {
                                preparationService.makeCoffee(visitor, coffee, inventoryService.getInventory());
                            }
                            orderService.getCart().clear();
                            notificationService.sendNotification("Ваш заказ готов!", visitor);
                        } else {
                            System.out.println("Ошибка оплаты. Заказ не может быть обработан.");
                        }
                    } else {
                        System.out.println("Заказ не оплачен. Продолжаем покупки.");
                    }
                    break;
                case 3:
                    shopping = false;
                    System.out.println("Спасибо за покупки! До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
