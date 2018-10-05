import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.stock = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int totalStock(){
        return stock.size();
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }
}
