package services;

import model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("hello", "xin chao"));
        dictionaries.put(2, new Dictionary("book", "quyen vo"));
        dictionaries.put(3, new Dictionary("pen", "but"));

    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaries.values());
    }
}
