import java.text.Format;

public abstract class Product {
    protected String name;
    protected String productType;
    protected int cost;

    public String productType ()
    {
        return productType;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name %s, cost %d", name, cost);
    }

    Product(String name, int cost, String productType) {
        this.name = name;
        this.cost = cost;
        this.productType = productType;
    }


}

