package M_2C_M_C;

import java.util.Scanner;
import M_2C_M_C.InventoryService;
import M_2C_M_C.DeliveryNewProduct;
import static M_2C_M_C.InventoryService.inventory;
import M_2C_M_C.Visitor;

public class Main {
    public static void main(String[] args) {
        Visitor Alexey_Sugar = new Visitor(30.95);
        //предположим что у нас изначально есть какой то запас продуктов для изготовления кофе.
        DeliveryNewProduct.deliveryNewProduct("Кофе Арабика",10);
        DeliveryNewProduct.deliveryNewProduct("Молоко",10);
        DeliveryNewProduct.deliveryNewProduct("Сахар",10);
        DeliveryNewProduct.deliveryNewProduct("Карамельный топинг",10);
        DeliveryNewProduct.deliveryNewProduct("Шоколадный топинг",10);
        DeliveryNewProduct.deliveryNewProduct("Клубничный топинг",10);
        DeliveryNewProduct.deliveryNewProduct("Лёд",10);
        Scanner visitorOrder = new Scanner(System.in);
        while (true) {
            System.out.print("Добрый день! Что желаете?");
            //здесь же используем наш список. как шаблон по изготовлению,и после изготовления убираем позиции в HashMap.
            String answer = visitorOrder.nextLine();
            System.out.print("-- Что у вас есть в наличии?");
            System.out.print("-- Сколько стоит ... ?(позиция + цена)");
            System.out.print("-- Сколько будет делаться? (кол-во времени на изготовления)");
        }
    }
}
