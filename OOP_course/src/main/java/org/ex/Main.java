package org.ex;
public class App {
    public static void main(String[] args) throws Exception {
        BouttleMachine m = new BouttleMachine();
        m.addProduct("Coca-cola", 100);
        // m.addProduct("Snikers", 50);
        m.addProduct("Water", 20);
        System.out.println(m.getProductByPrice(50).toString());
        System.out.println(m.getProductByname("Coca-cola").toString());
    }
}
// содержащий в себе методы getProductsByname и getProductsByPrice
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
