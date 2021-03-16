package Set;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Live-
 */
public class TestTreeSet {

    public static void main(String[] args) {// Create a tree set

        /* Tree Set */
//        Set<String> set = new TreeSet<>();
//        set.add("One");
//        set.add("Two");
//        set.add("Three");
//        set.add("Four");
//        set.add("Five");
//        System.out.println(set);

        /* HashSet */
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("One");
//        hashSet.add("Two");
//        hashSet.add("Three");
//        hashSet.add("Four");
//        hashSet.add("Five");
//        Set<String> treeSet = new TreeSet<>(hashSet);
//        System.out.println(treeSet);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
