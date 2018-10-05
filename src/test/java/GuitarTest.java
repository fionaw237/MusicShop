import Items.Instruments.Guitar;
import Items.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar", 640, 880, "Black", InstrumentType.STRING, "Alder", "Fender",
                "Stratocaster", 6);
    }

    @Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Alder", guitar.getMaterial());
    }

    @Test
    public void hasBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasSixStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("guitar sound", guitar.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(640, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(880, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(240, guitar.calculateMarkup(), 0.01);
    }
}
