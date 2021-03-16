/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/**
 *
 * @author Live-
 */
public class CountOccurrenceOfWords {

    public static void main(String[] args) {
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";
        String[] words = text.split("[ \n\t.!]");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                if (map.containsKey(key)) {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                } else {
                    map.put(key, 1);
                }
            }
        }
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println( entry.getKey() + " " + entry.getValue());
        }
        System.out.println(); 
    }
}
