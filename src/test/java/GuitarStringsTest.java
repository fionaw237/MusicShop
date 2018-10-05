import Items.Accesories.GuitarStrings;
import Items.Accesories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Guitar strings", 2, 4.5);
    }

    @Test
    public void hasDescription() {
        assertEquals("Guitar strings", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2, guitarStrings.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(4.5, guitarStrings.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.5, guitarStrings.calculateMarkup(), 0.01);
    }

}
