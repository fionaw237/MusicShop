package Items.Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String description, double buyingPrice, double sellingPrice, String colour,
                  InstrumentType type, String material, String brand, String model, int numberOfStrings) {
        super(description, buyingPrice, sellingPrice, colour, type, material, brand, model);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play(){
        return "guitar sound";
    }
}
