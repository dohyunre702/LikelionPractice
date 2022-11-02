package week1.collection;

import java.util.ArrayList;
import java.util.List;

public class ArryListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("c++");
        list.add("node.js");

        int size = list.size();
        System.out.println("총 객체 수:" + size);

        String skill = list.get(2);
        System.out.println("2: " + skill);

        for (String obj: list) {
            System.out.println(obj);
        }
        list.remove(2);

        for (String obj: list) {
            System.out.println(obj);
        }
    }
}
