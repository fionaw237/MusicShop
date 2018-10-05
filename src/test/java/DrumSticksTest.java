import Items.Accesories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumsticks;

    @Before
    public void setUp(){
        drumsticks = new DrumSticks("drumsticks", 5.99, 9.99);
    }

    @Test
    public void hasDescription() {
        assertEquals("drumsticks", drumsticks.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5.99, drumsticks.getBuyingPrice(), 0.02);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(9.99, drumsticks.getSellingPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4, drumsticks.calculateMarkup(), 0.01);
    }
}
