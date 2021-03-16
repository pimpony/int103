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
public class TestSet {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
    

        Set<String> set2 = new HashSet<>();
        set2.add("2");
        set2.add("4");
        set2.add("6");
        set2.add("8");
        
         /* 1  union */
//        set1.addAll(set2);        
//        System.out.println(set1);
//         
        
         /* 2  intersection */
//        set1.retainAll(set2);
//        System.out.println(set1);
           
         /* 3 difference */
//        set1.removeAll(set2);
//        System.out.println(set1);
    }
}
