import java.util.ArrayList;
import java.util.List;

public class BouttleMachine implements Machine

{
    @Override
    public void addProduct(String name, int cost) {
        BoutlleWater Product = new BoutlleWater(name, cost);
        products.add(Product);
    }
}