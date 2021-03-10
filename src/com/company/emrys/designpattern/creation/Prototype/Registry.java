package com.company.emrys.designpattern.creation.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {

        loadItems();
    }

    public Item createItem(String type){
    Item item= null;
        try {
           item =  items.get("Movie").clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }


cd
    private void loadItems() {

        Movie movie = new Movie();
        movie.setRuntime("2 hours");
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put("Book",book);
    }
}
