package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    /*
      Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };
        return items;
     */

    @Test
    void foo() {
        Item[] items = TexttestFixture.getItems();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(app.items[0], "+5 Dexterity Vest", 9, 19 );
        testItem(app.items[1], "Aged Brie", 1, 1 );
        testItem(app.items[2], "Aged Brie", -2, 37 );
        testItem(app.items[3], "Aged Brie", -2, 50 );
        testItem(app.items[4], "Elixir of the Mongoose", 4, 6 );
        testItem(app.items[5], "Sulfuras, Hand of Ragnaros", 0, 80 );
        testItem(app.items[6], "Sulfuras, Hand of Ragnaros", -1, 80 );
        testItem(app.items[7], "Backstage passes to a TAFKAL80ETC concert", 14, 21 );
        testItem(app.items[8], "Backstage passes to a TAFKAL80ETC concert", 9, 50 );
        testItem(app.items[9], "Backstage passes to a TAFKAL80ETC concert", 4, 50 );
        testItem(app.items[10], "Backstage passes to a TAFKAL80ETC concert", 9, 37 );
        testItem(app.items[11], "Backstage passes to a TAFKAL80ETC concert", 4, 38 );
    }

    void testItem(Item item, String name, int  sellIn, int quality)
    {
        assertEquals(name, item.name);
        assertEquals(sellIn, item.sellIn);
        assertEquals(quality, item.quality);
    }

}
