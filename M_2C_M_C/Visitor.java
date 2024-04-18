package M_2C_M_C;
//Данный класс реализует поситителя ++

public class Visitor {
    private String name;
    private double money;

    public Visitor(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
