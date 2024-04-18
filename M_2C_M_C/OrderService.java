package M_2C_M_C;
/*
Модуль заказов (Order Service): Отвечает за обработку заказов от клиентов, управление корзиной покупок,
расчет стоимости заказа и его передачу модулю оплаты.
*/


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<CoffeeMenu> cart;

    public OrderService() {
        this.cart = new ArrayList<>();
    }

    public void addItemToCart(CoffeeMenu coffeeType) {
        cart.add(coffeeType);
    }

    public double calculateTotal() {
        double total = 0;
        for (CoffeeMenu coffee : cart) {
            total += coffee.getPrice();
        }
        return total;
    }

    public List<CoffeeMenu> getCart() {
        return cart;
    }
}



