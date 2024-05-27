package com.demo1.object;

public class ItemTest {
    public static void main(String[] args) {
        Item [] items = new Item[3];
        Item item1 = new Item();
        items[0] = item1;
        items[1] = new Item("shangpin1","tt", 50, 10);
        items[2] = new Item();
        String info = items[1].toString();
        System.out.println(info);
    }
}
