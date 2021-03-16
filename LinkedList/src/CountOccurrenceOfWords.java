/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Live-
 */
public class CountOccurrenceOfWords {

    public static void main(String[] args) {
// Set text in a string
        String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";
// Split a string into an array of words
        String[] words = text.split("[ \n\t.!]");
// insert code here

        System.out.println(Arrays.asList(words));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
}
