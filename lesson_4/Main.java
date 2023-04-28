package lesson_4;

// Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться от классов
//     под каждый тип продукта, заменив единым классом - торговым автоматом

public class Main {
    public static void main(String[] args) {

        DrinkMachine<Drink> drink = new DrinkMachine<>();
        DrinkMachine<HotDrink> hotDrink = new DrinkMachine<>();
        drink.setProduct(new Drink("лимонад", 200));
        drink.setProduct(new Drink("тархун", 200));
        hotDrink.setProduct(new HotDrink("чай", 300, 65));
        hotDrink.setProduct(new HotDrink("кофе", 200, 80));

        drink.finishProduct();
        hotDrink.finishProduct();

    }
}