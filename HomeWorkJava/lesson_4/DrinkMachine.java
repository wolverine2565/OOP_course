package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class DrinkMachine<T> implements VendMachine {
    private T drinkMachine;
    private List<T> finishProduct = new ArrayList<>();

    public T getDrinkMachine() {
        return drinkMachine;
    }

    public void setDrinkMachine(T drinkMachine) {
        this.drinkMachine = drinkMachine;
    }

    public void finishProduct() {
        System.out.println(finishProduct);
    }

    public void setProduct(T drinkMachine) {
        finishProduct.add(drinkMachine);
    }
}