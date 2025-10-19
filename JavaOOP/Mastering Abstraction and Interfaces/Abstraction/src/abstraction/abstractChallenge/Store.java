package abstraction.abstractChallenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    
    public static void main(String[] args) {
        
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sclupture", 2000, "Bronze eork by JKF, produced in 1950"));

        storeProducts.add(new Furniture("Desk", 500, "Mahogny Desk"));

        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));

        listProducts();

        System.out.println("\nOrder 1");
        var oredr1 = new ArrayList<OrderItem>();
        addItemToOrder(oredr1, 1, 2);
        addItemToOrder(oredr1, 0, 1);
        printOrder(oredr1);

        System.out.println("\nOrder 2");
        var oredr2 = new ArrayList<OrderItem>();
        addItemToOrder(oredr2, 3, 5);
        addItemToOrder(oredr2, 0, 1);
        addItemToOrder(oredr2, 2, 1);
        printOrder(oredr2);

    }
    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {

        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = £%6.2f %n", salesTotal);
    }
}
