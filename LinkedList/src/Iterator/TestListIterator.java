/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Live-
 */
public class TestListIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    
        System.out.println(" ");
        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");
        ListIterator<String> iterator2 = list2.listIterator(list2.size());
        while (iterator2.hasPrevious()) {
            System.out.print(iterator2.previous() + " ");
        }
    }
}
