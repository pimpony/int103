/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 *
 * @author Live-
 */
public class TestEmployee {

    public static void main(String[] args) {

        Employee em1 = new Employee("053", "PINJANG", 21, 23000);
        Employee em2 = new Employee("054", "Ammy", 30, 18000);
        Employee em3 = new Employee("055", "Zary", 13, 10000);
        Employee em4 = new Employee("056", "Mamnny", 45, 25000);
        Employee em5 = new Employee("057", "Jeejee", 29, 60000);

        List<Employee> list = new ArrayList<>();
        list.add(em1);
        list.add(em2);
        list.add(em3);
        list.add(em4);
        list.add(em5);

        System.out.println(list);
        Collections.sort(list, new SortById());
        System.out.println(list);
        Collections.sort(list, new SortByName());
        System.out.println(list);
        Collections.sort(list, new SortByAge());
        System.out.println(list);
        Collections.sort(list, new SortBySalary());
        System.out.println(list);
    }
}
