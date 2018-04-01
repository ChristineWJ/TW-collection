package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> rst = new ArrayList<>();

        List<List<String>> templst = new ArrayList<>();

        Collection<List<String>> values =  collection2.values();  //List  ？？？
        Iterator<List<String>> it2 = values.iterator();  //遍历   如何搜素
        while(it2.hasNext()) {
            templst.add(it2.next());
        }

        String s;
        List<String> x;
        for (int j = 0; j < templst.size(); j++) {
            x = templst.get(j);
            for (int i = 0; i < collection1.size(); i++) {
                s = collection1.get(i);
                if (x.contains(s) && !rst.contains(s)) {
                    rst.add(s);
                }
            }
        }
        return rst;
    }
}
