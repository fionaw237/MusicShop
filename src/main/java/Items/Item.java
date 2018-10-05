package Items;

import interfaces.ISell;

public abstract class Item implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return sellingPrice - buyingPrice;
    }

}
