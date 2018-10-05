import Items.Accesories.GuitarStrings;
import Items.Accesories.SheetMusic;
import Items.Instruments.Guitar;
import Items.Instruments.InstrumentType;
import Items.Instruments.Piano;
import Items.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    GuitarStrings guitarStrings;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    Trumpet trumpet2;
    SheetMusic sheetMusic1;
    SheetMusic sheetMusic2;
    SheetMusic sheetMusic3;


    @Before
    public void setUp(){
        shop = new Shop("McGilloway's Music Market");
        guitarStrings = new GuitarStrings("Guitar strings", 2, 4.5);
        guitar = new Guitar("Guitar", 640, 880, "Black", InstrumentType.STRING, "Alder", "Fender",
                "Stratocaster", 6);
        piano = new Piano("Piano", 3200, 3799,"Black",
                InstrumentType.STRING, "Spruce", "Bentley","121 Traditional",88);
        trumpet = new Trumpet("Trumpet", 310.5, 349.99,"Yellow", InstrumentType.BRASS, "Brass", "Coppergate",
                "Professional",3);
        trumpet2 = new Trumpet("Trumpet", 310.5, 349.99,"Yellow", InstrumentType.BRASS, "Brass", "Coppergate",
                "Professional",3);
        sheetMusic1 = new SheetMusic("Sum 41, All Killer No Filler", 11.5, 16,
                "Pop Punk");
        sheetMusic2 = new SheetMusic("Sum 41, All Killer No Filler", 11.5, 16,
                "Pop Punk");
        sheetMusic3 = new SheetMusic("Sum 41, All Killer No Filler", 11.5, 16,
                "Pop Punk");
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

    @Test
    public void canCalculatePotentialProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitarStrings);
        assertEquals(242.5, shop.calculatePotentialProfit(), 0.01);
    }

    @Test
    public void canGetNumberOfInstrumentsInStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(trumpet2);
        shop.addItemToStock(guitarStrings);
        assertEquals(2, shop.totalInstrumentsInStock());
    }


//    The way I've found items of certain types isn't great - i pass an object of that type in.
//    Is there a way to pass a class name into a function? i.e. could I have a function such as
//    numberOfItemsInStockByType(Guitar) to get no. of instruments of type Guitar?
    @Test
    public void canGetNumberOfTrumpetsInStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(trumpet2);
        shop.addItemToStock(trumpet);
        assertEquals(2, shop.numberOfItemsInStockByType(trumpet));
    }
    @Test
    public void canGetNumberOfSheetMusicBooksInStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(trumpet2);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(sheetMusic1);
        shop.addItemToStock(sheetMusic2);
        shop.addItemToStock(sheetMusic3);

        assertEquals(3, shop.numberOfItemsInStockByType(sheetMusic1));
    }

    @Test
    public void canGetNumberOfPianosInStockIfZero() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(trumpet2);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(sheetMusic1);
        shop.addItemToStock(sheetMusic2);
        shop.addItemToStock(sheetMusic3);
        Piano piano2 = new Piano("Piano", 3200, 3799,"Black",
                InstrumentType.STRING, "Spruce", "Bentley",
                "121 Traditional",88);
        assertEquals(0, shop.numberOfItemsInStockByType(piano2));
    }
}
