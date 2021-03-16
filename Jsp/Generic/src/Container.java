/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Live-
 */
public class Container<T> {

    private T obj ;

    public void add(T obj) {
        this.obj = obj;
    }

    public T get() {
        return this.obj;
    }
}
