import java.util.ArrayList;
import java.util.List;

public interface Machine {
    List<Product> products = new ArrayList<Product>();
    public Product getProductByname(String name){
        for (Product product : products) {
            if (product.getName()==name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByPrice(double cost) {
        for (Product product : products) {
            if (product.getCost()==cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(String name, int cost) {
        Product Product = new Product(name, cost);
        products.add(Product);
    }
}