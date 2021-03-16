package Employee;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Live-
 */
public class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {
          return a.getName().compareTo(b.getName());
    }
    
}
