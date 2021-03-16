/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Live-
 */
public class TestIterator {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
