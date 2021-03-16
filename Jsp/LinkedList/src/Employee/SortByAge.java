/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Comparator;

/**
 *
 * @author Live-
 */
public class SortByAge  implements Comparator<Employee>{

    @Override
    public int compare(Employee a, Employee b) {
          return a.getAge()-b.getAge();
    }
    
}
