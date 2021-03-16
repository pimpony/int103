package List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Live-
 */

import java.util.*;

public class TestArrayList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList < > ();
        arrayList.add("Apple");//1isautoboxedtonewInteger(1)
        arrayList.add("Banana");    
        arrayList.add("Cherry");       
        arrayList.add("Mango");        
        arrayList.add("orange");
        System.out.println(arrayList);
        System.out.println("Fruit index 3 : "+arrayList.get(3));
        arrayList.add(3, "avocado");
        System.out.println(arrayList);
        System.out.println("Fruit index 3 : "+arrayList.get(3));
        arrayList.add(2, "Blueberry");
        System.out.println(arrayList);
        System.out.println("Fruit index 2 : "+arrayList.get(2));
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println("remoev Fruit index 1 : "+arrayList.get(1));
        arrayList.remove("Mango");
        System.out.println(arrayList);
        System.out.println("Remove Mango : "+arrayList.remove("Mango"));
    }
}
