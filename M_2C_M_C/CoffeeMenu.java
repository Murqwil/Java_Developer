package M_2C_M_C;

public enum CoffeeMenu {
    //Молоко,сахар,Карамельный Топинг,Шоколадный топинг,Клубничный топинг,лёд. Стоймость, время
    STANDARD_COFFEE(1.5, 2.0, 1.0, 0.0, 0.0, 0.0,2.5,10.00),
    CAPPUCCINO(1.0, 1.5, 0.5, 1.0, 0.0, 0.0,2.0,5.00),
    AMERICANO(0.0, 1.0, 0.0, 0.0, 0.0, 0.0,3.99,8.0),
    ICE_COFFEE(1.0, 2.0, 0.0, 0.0, 0.0, 1.5,2.99,12.00),
    LATTE(2.0, 2.5, 0.0, 0.0, 0.0, 0.0,1.99,15.00);
    double milk;
    double sugar;
    double caramelTopping;
    double chocolateTopping;
    double strawberryTopping;
    double ice;
    double price;
    double time;
    CoffeeMenu(double milk, double sugar, double caramelTopping, double chocolateTopping,
               double strawberryTopping, double ice,double price, double time){
        this.milk = milk;
        this.sugar = sugar;
        this.caramelTopping = caramelTopping;
        this.chocolateTopping = chocolateTopping;
        this.strawberryTopping = strawberryTopping;
        this.ice = ice;
        this.price = price;
        this.time = time;
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

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }
}
