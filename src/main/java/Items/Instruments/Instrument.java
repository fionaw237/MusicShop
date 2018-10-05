package Items.Instruments;

import Items.Item;
import interfaces.IPlay;

public abstract class Instrument extends Item implements IPlay{

    private String colour;
    private InstrumentType type;
    private String material;
    private String brand;
    private String model;

    public Instrument(String description, double buyingPrice, double sellingPrice, String colour,
                      InstrumentType type, String material, String brand, String model) {
        super(description, buyingPrice, sellingPrice);
        this.colour = colour;
        this.type = type;
        this.material = material;
        this.brand = brand;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
