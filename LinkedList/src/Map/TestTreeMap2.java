package Map;


import java.util.HashMap;
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
public class TestTreeMap2 {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "Five");
        hashMap.put(4, "Four");
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");
        hashMap.put(1, "One");
        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
    }
}
