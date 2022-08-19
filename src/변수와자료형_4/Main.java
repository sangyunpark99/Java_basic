package 변수와자료형_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // List

        ArrayList l1 = new ArrayList();

        //add
        l1.add(1);
        l1.add("Hello");
        l1.add(2);

        System.out.println(l1);

        l1.add(0,1);
        System.out.println(l1);

        //get
        System.out.println(l1.get(0));

        //size
        System.out.println(l1.size());

        //remove
        System.out.println(l1.remove(0));
        System.out.println(l1);

        // list에 존재하는 2라는 값 삭제
        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println(l1);

        // clear
        l1.clear();
        System.out.println(l1);

        // sort

        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);

        System.out.println(l2);

        // 오름차순 정렬
        l2.sort(Comparator.naturalOrder());
        System.out.println(l2);

        // 내림차순 정렬
        l2.sort(Comparator.reverseOrder());
        System.out.println(l2);

        // contains
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

        // Maps - key,value 형식
        HashMap map = new HashMap();

        // put
        map.put("짬뽕",1000);
        map.put("탕수육",20000);
        System.out.println(map);


        // get
        System.out.println(map.get("짬뽕"));
        System.out.println(map.get("탕수육"));

        // size
        System.out.println(map.size());

        // remove
        System.out.println(map.remove("짬뽕"));
        System.out.println(map);


        // contains key
        System.out.println(map.containsKey("탕수육"));
        System.out.println(map.containsKey("짬뽕"));



        // Generics

        // 사용하지 않은 경우
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("what is");

        ArrayList<String> l4 = new ArrayList<String>();
        l4.add("Hello");
        l4.add("Good Bye");
        System.out.println(l4);


        HashMap<String, Integer> map2 = new HashMap<String,Integer>();

        map2.put("Hello",2000);
        map2.put("Goodbye",4000);

        System.out.println(map2);
    }
}
