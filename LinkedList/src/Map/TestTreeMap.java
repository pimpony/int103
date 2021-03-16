package Map;


import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Live-
 */
public class TestTreeMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(5, "Five");
        map.put(4, "Four");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(1, "One");
        System.out.println(map);
    }
}
