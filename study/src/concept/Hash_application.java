package concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Hash_application {

	public static void main(String[] args) {
		//���θ޼ҵ忡�� ����
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",3);
        map.put("b",12);
        map.put("c",54);
        map.put("d",51);
        map.put("e",8);
         
        System.out.println("------------sort �� -------------");
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            String temp = (String) iterator.next();
            System.out.println(temp + " = " + map.get(temp));
        }
         
        Iterator it = sortByValue(map).iterator();
         
        System.out.println("------------sort �� -------------");
        while(it.hasNext()) {
            String temp = (String) it.next();
            System.out.println(temp + " = " + map.get(temp));

        }
	}

//������ ����ƽ �Լ��� ����
public static List sortByValue(final Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());
         
        Collections.sort(list,new Comparator() {
             
            public int compare(Object o1,Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                 
                return ((Comparable) v2).compareTo(v1);
            }
             
        });
        Collections.reverse(list); // �ּ��� ��������
        return list;

    
	}
}
	
