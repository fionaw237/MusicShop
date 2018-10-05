package Items.Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String description, double buyingPrice, double sellingPrice, String colour,
                   InstrumentType type, String material, String brand, String model, int numberOfValves) {
        super(description, buyingPrice, sellingPrice, colour, type, material, brand, model);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "trumpet sound";
    }
}

