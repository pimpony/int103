/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Live-
 */
public class TestMapIterator {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //Map<Integer, String> map = new LinkedHashMap<>();
        //TreeMap<Integer, String> map = new TreeMap<>();
        map.put(5, "Five");
        map.put(4, "Four");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(1, "One");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
