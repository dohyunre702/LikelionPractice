package week1.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("손흥민"); //주어진 객체를 저장한다.
        str.add("김민재");
        str.add("황희찬");
        str.add("황인범");
        str.add("이강인");

        Iterator<String> iterator = str.iterator(); //저장된 객체를 한 번씩 가져오는 반복자 리턴
        while(iterator.hasNext()){ //가져올 객체가 있을 때
            String tmp = iterator.next(); //컬렉션에서 하나의 객체를 가져온다.
            System.out.println(tmp);
        }
        System.out.print(str.contains("손흥민")); //주어진 객체가 저장되어 있는지 확인

    }
}
