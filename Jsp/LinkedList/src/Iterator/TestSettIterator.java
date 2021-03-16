/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Live-
 */
public class TestSettIterator {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //Set<String> set = new LinkedHashSet<>();
        //Set<String> set = new TreeSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
