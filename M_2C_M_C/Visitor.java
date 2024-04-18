package M_2C_M_C;
//Данный класс реализует поситителя

public class Visitor {
    private double money;

    public Visitor(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
