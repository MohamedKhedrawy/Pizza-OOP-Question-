import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("enter the type of pizza you want to order");
        Scanner sc = new Scanner(System.in);
        String pizzaType = sc.nextLine();
        System.out.println("enter the size of pizza you want to order");
        Size size = Size.valueOf(sc.nextLine().toUpperCase());
        Pizza pizza;
        if (pizzaType.equalsIgnoreCase("chicken")) {
            pizza = new ChickenPizza(size);
        } else if (pizzaType.equalsIgnoreCase("beef")) {
            pizza = new BeefPizza(size);
        }
        else {
            System.out.println("Invalid pizza type");
            return;
        }
        pizza.makePizza();
        pizza.makeDough();
        pizza.addTopping();
        pizza.bake();
        pizza.finishPizza();
        double price = pizza.calculatePrice(size, pizza.getDefaultPrice());
        System.out.println("Price of pizza is: " + price);
    }
}

abstract class Pizza {
    private Size size;
    private double pizzaPrice = 50.0;

    public Pizza(Size size) {
        this.size = size;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }

    public void bake() {
        System.out.println("Baking pizza");
    }

    public void makeDough() {
        System.out.println("Making dough");
    }

    abstract public void makePizza();
    abstract public void addTopping();
    abstract public void finishPizza();
    abstract public double getDefaultPrice();

    public double calculatePrice(Size size, double defaultPrice) {
        switch (size)
        {
        case SMALL:
            defaultPrice *= 1;
            break;
        case MEDIUM:
            defaultPrice *= 2;
            break;
        case EXTRA:
            defaultPrice *= 3;
        default:
            break;
        }
        return defaultPrice + getPizzaPrice();
    }

}

class ChickenPizza extends Pizza {
    private double defaultPrice = 20;

    public ChickenPizza(Size size) {
        super(size);
    }

    public double getDefaultPrice() {
        return defaultPrice;
    }
    public void setDefaultPrice(double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public void makePizza() {
        System.out.println("Making chicken pizza");
    }

    public void addTopping() {
        System.out.println("Adding topping for chicken pizza");
    }

    public void finishPizza() {
        System.out.println("Finishing chicken pizza");
    }

}

class BeefPizza extends Pizza {
    private double defaultPrice = 30;

    public BeefPizza(Size size) {
        super(size);
    }

    public double getDefaultPrice() {
        return defaultPrice;
    }
    public void setDefaultPrice(double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public void makePizza() {
        System.out.println("Making beef pizza");
    }

    public void addTopping() {
        System.out.println("Adding topping for beef pizza");
    }

    public void finishPizza() {
        System.out.println("Finishing beef pizza");
    }

}


enum Size {
    SMALL, MEDIUM, EXTRA
}