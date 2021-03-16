/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.util.Comparator;

/**
 *
 * @author Live-
 */
public class SortById implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getId() - b.getId();
    }

}
