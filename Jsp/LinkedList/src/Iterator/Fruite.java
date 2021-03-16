/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Live-
 */
public class Fruite {
     public static void main(String[] args) {
        //ArrayList หน้าไปหลัง
        List<String> Fr1 = new ArrayList<>();
        Fr1.add("Apple");
        Fr1.add("Banana");
        Fr1.add("Cherry");
        Fr1.add("Mango");
        Fr1.add("Orange");
        ListIterator<String> iterator = Fr1.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //LinkedLis หน้าไปหลัง
         List<String> Fr4 = new LinkedList<>();
        Fr4.add("Apple");
        Fr4.add("Banana");
        Fr4.add("Cherry");
        Fr4.add("Mango");
        Fr4.add("Orange");
        ListIterator<String> iterator4 = Fr4.listIterator();
        while (iterator4.hasNext()) {
            System.out.print(iterator4.next() + " ");
        }
        System.out.println();
        //ArrayList หลังไปหน้า
        
        List<String> Fr2 = new ArrayList<>();
        Fr2.add("Apple");
        Fr2.add("Banana");
        Fr2.add("Cherry");
        Fr2.add("Mango");
        Fr2.add("Orange");
        ListIterator<String> iterator2 = Fr2.listIterator(Fr2.size());
        while (iterator2.hasPrevious()) {
            System.out.print(iterator2.previous() + " ");
        }
        System.out.println();
        //LinkedLis หลังไปหน้า
        
        List<String> Fr5 = new LinkedList<>();
        Fr5.add("Apple");
        Fr5.add("Banana");
        Fr5.add("Cherry");
        Fr5.add("Mango");
        Fr5.add("Orange");
        ListIterator<String> iterator5 = Fr5.listIterator(Fr2.size());
        while (iterator5.hasPrevious()) {
            System.out.print(iterator5.previous() + " ");
        }
        System.out.println();
        //SET 
        
        Set<String> Fr3 = new HashSet<>();
        Fr3.add("Apple");
        Fr3.add("Banana");
        Fr3.add("Cherry");
        Fr3.add("Mango");
        Fr3.add("Orange");
        Iterator<String> iterator3 = Fr3.iterator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }
        System.out.println();
        
       
        Set<String> Fr6 = new LinkedHashSet<>();
        Fr6.add("Apple");
        Fr6.add("Banana");
        Fr6.add("Cherry");
        Fr6.add("Mango");
        Fr6.add("Orange");
        Iterator<String> iterator6 = Fr6.iterator();
        while (iterator6.hasNext()) {
            System.out.print(iterator6.next() + " ");
        }
        System.out.println();
        
        
        Set<String> Fr7 = new TreeSet<>();
        Fr7.add("Apple");
        Fr7.add("Banana");
        Fr7.add("Cherry");
        Fr7.add("Mango");
        Fr7.add("Orange");
        Iterator<String> iterator7 = Fr7.iterator();
        while (iterator7.hasNext()) {
            System.out.print(iterator7.next() + " ");
        }
        System.out.println();
     }
}
