package M_2C_M_C;

import java.util.Scanner;
import M_2C_M_C.InventoryService;

public class Main {
    public static void main(String[] args) {
        //предположим что у нас изначально есть какой то запас продуктов для изготовления кофе.
        InventoryService.deliveryNewProduct("Кофе Арабика",10);
        InventoryService.deliveryNewProduct("Молоко",10);
        InventoryService.deliveryNewProduct("Сахар",10);
        InventoryService.deliveryNewProduct("Карамельный топинг",10);
        InventoryService.deliveryNewProduct("Клубничный топинг",10);
        Scanner visitorOrder = new Scanner(System.in);
        while (true) {
            System.out.print("Добрый день! Что желаете?");
            String answer = visitorOrder.nextLine();
            System.out.print("-- Что у вас есть в наличии?");
            System.out.print("-- Сколько стоит ... ?(позиция + цена)");
            System.out.print("-- Сколько будет делаться? (кол-во времени на изготовления)");
        }
    }
}
