/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author Live-
 */
public class SortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {
         return (int) (a.getSalary()-b.getSalary());
    }

    
    
    
}
