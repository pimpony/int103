
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Live-
 */
public class TestWildcard {

    public static void main(String[] args) {
       // List<?> list;
       // List<? extends A> list;
        List<? super B> list;
     // list = new ArrayList<Integer>();
     
        list = new ArrayList<A>();
        //ด้านล่างไม่ได้ เพราะ B เป็นลูกของ A แต่ C D เป็นลูกของ B
//        list = new ArrayList<C>();
//        list = new ArrayList<D>();
    }
}

class A {};

class B extends A {};

class C extends B {};

class D extends B {};
