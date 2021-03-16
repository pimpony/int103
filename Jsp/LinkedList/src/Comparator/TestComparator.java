/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Live-
 */
public class TestComparator {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(64222, "John");
        Student student2 = new Student(64111, "Harry");
        Student student3 = new Student(64333, "Aarron");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        Collections.sort(list, new SortById());
        System.out.println(list);
        Collections.sort(list, new SortByName());
        System.out.println(list);
    }
}
