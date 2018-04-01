package cn.school.thoughtworks.section3;

import java.util.*;
import java.lang.String;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Iterator iterator = collectionA.keySet().iterator();
        String k;

        List<List<String>> templst = new ArrayList<>();
        Collection<List<String>> values = object.values();
        Iterator<List<String>> iter = values.iterator();
        while (iter.hasNext()) {
            templst.add(iter.next());
        }

        ArrayList<String> collection2 = new ArrayList<>();
        for (int i = 0; i < templst.size(); i++) {
            for (int j = 0; j < templst.get(i).size(); j++) {
                collection2.add(templst.get(i).get(j));
            }
        }


        while (iterator.hasNext()) {
            k = (String) iterator.next();
            if (collection2.contains(k)) {
                collectionA.put(k, collectionA.get(k) - 1);
            }
        }

        return collectionA;
    }
}
