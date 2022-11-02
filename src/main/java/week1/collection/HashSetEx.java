package week1.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("jdbc");
        set.add("c++");
        set.add("java");
        set.add("python");

        int size = set.size();
        System.out.println("size:" + size);

        Iterator<String> iterator = set.iterator();  //전체 반복
        while(iterator.hasNext()){ //=while(true)
            String element = iterator.next();
            System.out.println(element);
        }

        set.remove("c++");
        set.remove("python");

        System.out.println("총 객체 수: "+ set.size()); //삭제 후 재추력
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        set.clear(); //삭제
        if(set.isEmpty()) //set이 비어있는지 확인
            System.out.println("비어있음");
    }
}
