package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码
        List<String> rst = new ArrayList<>();
        String s;
        List<String> x;
        for (int j = 0; j < collection2.size(); j++) {
            x = collection2.get(j);
            for (int i = 0; i < collection1.size(); i++) {
                s = collection1.get(i);
                if (x.contains(s) && !rst.contains(s)) {
                    rst.add(s);
                }
            }
        }
        return new ArrayList<>(rst);
    }
}
