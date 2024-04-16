package M_2C_M_C;

public enum CoffeeMenu {
    //Молоко,сахар,Карамельный Топинг,Шоколадный топинг,Клубничный топинг,лёд.
    STANDARD_COFFEE(1.5, 2.0, 1.0, 0.0, 0.0, 0.0),
    CAPPUCCINO(1.0, 1.5, 0.5, 1.0, 0.0, 0.0),
    AMERICANO(0.0, 1.0, 0.0, 0.0, 0.0, 0.0),
    ICE_COFFEE(1.0, 2.0, 0.0, 0.0, 0.0, 1.5),
    LATTE(2.0, 2.5, 0.0, 0.0, 0.0, 0.0);
    double milk;
    double sugar;
    double caramelTopping;
    double chocolateTopping;
    double strawberryTopping;
    double ice;
    CoffeeMenu(double milk, double sugar, double caramelTopping, double chocolateTopping, double strawberryTopping, double ice){
        this.milk = milk;
        this.sugar = sugar;
        this.caramelTopping = caramelTopping;
        this.chocolateTopping = chocolateTopping;
        this.strawberryTopping = strawberryTopping;
        this.ice = ice;
    }

    public double getMilk() {
        return milk;
    }

    public double getSugar() {
        return sugar;
    }

    public double getCaramelTopping() {
        return caramelTopping;
    }

    public double getChocolateTopping() {
        return chocolateTopping;
    }

    public double getStrawberryTopping() {
        return strawberryTopping;
    }

    public double getIce() {
        return ice;
    }
}
