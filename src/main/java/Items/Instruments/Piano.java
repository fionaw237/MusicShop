package Items.Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String description, double buyingPrice, double sellingPrice, String colour,
                 InstrumentType type, String material, String brand, String model, int numberOfKeys) {
        super(description, buyingPrice, sellingPrice, colour, type, material, brand, model);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String play(){
        return "piano sound";
    }
}
