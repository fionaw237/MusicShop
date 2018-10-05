package Items.Accesories;

import Items.Item;

public class SheetMusic extends Item {
    
    private String genre;

    public SheetMusic(String description, double buyingPrice, double sellingPrice,
                      String genre) {
        super(description, buyingPrice, sellingPrice);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
