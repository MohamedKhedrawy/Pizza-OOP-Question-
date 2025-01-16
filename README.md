# Pizza-OOP-Question-

## Requirements
Utilize OOP to create Pizza class which
1. Make dough
2. Adding Toppings
3. Bake
4. Calculate the price

price is calculated bu summing
1. `pizzaPrice` same for all
2.  `defaultPrice` for the a specific pizza type
    - if small remain
    - if meduim multiply by 2
    - if extra multiply by 3
> Consider Using OOP Properties (`Encapsulation`, `Abstraction`, `Inheritance`, `Ploymorphism`)
```cpp
enum pizzaSize
{
    SMALL,
    MEDUIM,
    EXTRA
};

void MakeDough()
{
    cout << "Making Dough" << endl;
}

void Bake()
{
    cout << "Baking Pizza" << endl;
}

double CalcPizzaPrice(pizzaSize size, int defaultPrice)
{
    double pizzaPrice = 50;
    switch (size)
    {
    case SMALL:
        defaultPrice *= 1;
        break;
    case MEDUIM:
        defaultPrice *= 2;
        break;
    case EXTRA:
        defaultPrice *= 3;
    default:
        break;
    }
    return defaultPrice + pizzaPrice;
}

void MakeChickenPizza(pizzaSize size)
{
    double defaultPrice = 20;
    
    cout << "Making Chicken Pizza" << endl;
    MakeDough();
    cout << "Adding toppings for Chicken Pizza" << endl;
    Bake();
    cout << "Chicken Pizza finished" << endl;
    cout << "Price " << CalcPizzaPrice(size, defaultPrice) << endl;
}

void MakeBeefPizza(pizzaSize size)
{
    double defaultPrice = 30;

    cout << "Making Beef Pizza" << endl;
    MakeDough();
    cout << "Adding toppings for Beef Pizza" << endl;
    Bake();
    cout << "Beef Pizza finished" << endl;
    cout << "Price " << CalcPizzaPrice(size, defaultPrice) << endl;
}
```
###### Output
```plaintext
Making Chicken Pizza
Making Dough
Adding toppings for Chicken Pizza
Baking Pizza
Chicken Pizza finished
Price 90
```
