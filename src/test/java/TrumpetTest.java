import Items.Instruments.InstrumentType;
import Items.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet("Trumpet", 310.5, 349.99,"Yellow", InstrumentType.BRASS, "Brass", "Coppergate",
                "Professional",3);
    }

    @Test
    public void hasColour() {
        assertEquals("Yellow", trumpet.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasBrand() {
        assertEquals("Coppergate", trumpet.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Professional", trumpet.getModel());
    }

    @Test
    public void hasKeys() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("trumpet sound", trumpet.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(310.5, trumpet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(349.99, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39.49, trumpet.calculateMarkup(), 0.01);
    }
}
