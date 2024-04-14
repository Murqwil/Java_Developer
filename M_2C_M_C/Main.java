package M_2C_M_C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
