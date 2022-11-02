package week1.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//키:값 한 쌍 (키와 값 모두 객체. 원시타입 아님)
public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("김민재",4); //값 추가
        map.put("이강인",26);
        map.put("손흥민",7);
        map.put("정우영",25);
        System.out.println("총 Entry 수:"+map.size());

        System.out.println("손흥민의 등번호: " + map.get("손흥민")); //key의 value 가져오기
        System.out.println();

        //객체 하나씩 출력
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator(); //반복자
        while(keyIterator.hasNext()) { //값이 있을 때
            String key = keyIterator.next(); //값 가져오기
            Integer value = map.get(key); //key의 value 가져오기
            System.out.println(key +"의 등번호: "+value); //key, value 출력
        }
        System.out.println();

        map.remove("황희찬"); //삭제
        System.out.println("총 Entry의 수: " + map.size()); //map의 사이즈

        //객체를 하나씩 처리
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer>entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);
        }

}
}