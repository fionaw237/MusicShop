import Items.Instruments.InstrumentType;
import Items.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Piano", 3200, 3799,"Black",
                InstrumentType.STRING, "Spruce", "Bentley","121 Traditional",88);
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Spruce", piano.getMaterial());
    }

    @Test
    public void hasBrand() {
        assertEquals("Bentley", piano.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("121 Traditional", piano.getModel());
    }

    @Test
    public void hasKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("piano sound", piano.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(3200, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3799, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(599, piano.calculateMarkup(), 0.01);
    }
}
