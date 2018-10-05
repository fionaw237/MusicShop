import Items.Instruments.Instrument;
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

    public double calculatePotentialProfit() {
        double total = 0;
        for (ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }

    public int totalInstrumentsInStock() {
        int total = 0;
        for (ISell item : stock){
            if (item instanceof Instrument){
                total += 1;
            }
        }
        return total;
    }

    public int numberOfItemsInStockByType(ISell itemOfRequiredType){
        int total = 0;
        for (ISell item : stock){
            if (item.getClass() == itemOfRequiredType.getClass()){
                total += 1;
            }
        }
        return total;
    }
}
