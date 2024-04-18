package M_2C_M_C;

import M_2C_M_C.Visitor;
/*
Модуль оплаты (Payment Service): Обрабатывает платежи от клиентов, взаимодействует с платежными системами для проведения
транзакций и уведомляет модуль заказов о статусе оплаты. ++
*/

public class PaymentService {
    private boolean isPay = false;

    public boolean isPay() {
        return isPay;
    }

    public void processPayment(Visitor visitor, double amount) {
        if (visitor.getMoney() >= amount) {
            double newBalance = visitor.getMoney() - amount;
            visitor.setMoney(newBalance);
            isPay = true; // Устанавливаем статус оплаты в true
            System.out.println("Оплата прошла успешно. Новый баланс: " + newBalance);
        } else {
            System.out.println("Недостаточно средств для оплаты.");
        }
    }
}


