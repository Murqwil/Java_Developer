package M_2C_M_C;

import M_2C_M_C.Visitor;
/*
Модуль оплаты (Payment Service): Обрабатывает платежи от клиентов, взаимодействует с платежными системами для проведения
транзакций и уведомляет модуль заказов о статусе оплаты.
*/

public class PaymentService {
     private boolean setPay = false;

    public void setPay(boolean setPay) {
        this.setPay = setPay;
    }

    public boolean isPay() {
        return setPay;
    }

    void visitorPay(Visitor visitor, double amount) {
        if (visitor.getMoney() >= amount) {
            // Вычитаем сумму из текущего баланса посетителя
            double newBalance = visitor.getMoney() - amount;
            visitor.setMoney(newBalance);
            setPay(true); // Устанавливаем флаг оплаты в true
            System.out.println("Оплата прошла успешно. Новый баланс: " + newBalance);
        } else {
            System.out.println("Недостаточно средств для оплаты.");
        }cd
    }
}

