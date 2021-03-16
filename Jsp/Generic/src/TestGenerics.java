/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Live-
 */
public class TestGenerics {

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        Container<String> strContainer = new Container<>();
        intContainer.add(7);
        strContainer.add("You are awesome");
        System.out.println("Integer Value : " + intContainer.get());
        System.out.println("String Value : " + strContainer.get());

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Oklahoma");
//        String state = list.get(0);
    }

}
