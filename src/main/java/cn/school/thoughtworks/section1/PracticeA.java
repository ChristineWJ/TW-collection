package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码
        List<String> rst = new ArrayList<>();
        String s;
        for (int i=0;i<collection1.size();i++) {
            s=collection1.get(i);
            if(collection2.contains(s)&&!rst.contains(s)){
                rst.add(s);
            }
        }
        return new ArrayList<>(rst);
    }

}
