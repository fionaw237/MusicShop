import Items.Accesories.GuitarStrings;
import Items.Instruments.Guitar;
import Items.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    GuitarStrings guitarStrings;
    Guitar guitar;

    @Before
    public void setUp(){
        shop = new Shop("McGilloway's Music Market");
        guitarStrings = new GuitarStrings("Guitar strings", 2, 4.5);
        guitar = new Guitar("Guitar", 640, 880, "Black", InstrumentType.STRING, "Alder", "Fender",
                "Stratocaster", 6);
    }

    @Test
    public void hasName() {
        assertEquals("McGilloway's Music Market", shop.getName());
    }

    @Test
    public void initiallyHasNoStock() {
        assertEquals(0, shop.totalStock());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitarStrings);
        assertEquals(2, shop.totalStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitarStrings);
        shop.removeItemFromStock(guitar);
        assertEquals(1, shop.totalStock());
    }
}
