import Items.Accesories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Sum 41, All Killer No Filler", 11.5, 16,
                "Pop Punk");
    }

    @Test
    public void hasDescription() {
        assertEquals("Sum 41, All Killer No Filler", sheetMusic.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(11.5, sheetMusic.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(16, sheetMusic.getSellingPrice(), 0.1);
    }

    @Test
    public void getGenre() {
        assertEquals("Pop Punk", sheetMusic.getGenre());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.5, sheetMusic.calculateMarkup(), 0.01);
    }
}
