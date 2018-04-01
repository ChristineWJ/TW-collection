package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        cn.school.thoughtworks.section2.PracticeB practice = new cn.school.thoughtworks.section2.PracticeB();
        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(practice.countSameElements(collectionA), object);

    }
}
