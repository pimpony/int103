package Set;


import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Live-
 */
public class TestHashSet {

    public static void main(String[] args) {// Create a hash 
       Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);

        Set<String> set2 = new HashSet<>();
        set.add("Two");
        set.add("Four");
        set.addAll(set2);
        
        
        set.retainAll(set2);
        
        set.removeAll(set2);
        
        set.remove("Two");
        System.out.println(set);

        set.clear();
        System.out.println(set);
        
        
        
    }
}
