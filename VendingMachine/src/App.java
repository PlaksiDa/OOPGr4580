import java.util.ArrayList;
import java.util.List;

import Domen.*;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float) 1.5);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        HotDrink hotDrink1 = new HotDrink(80, 4, "Tea", 200, 70);
        HotDrink hotDrink2 = new HotDrink(90, 5, "Coffee", 201, 65);
        assort.add(hotDrink1);
        assort.add(hotDrink2);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for (Product prod : venMachine.getProducts()) {
            System.out.println(prod);
        }

        VendingMachineFrame vendingMachineFrame = new VendingMachineFrame(venMachine.getProducts());
    }
}