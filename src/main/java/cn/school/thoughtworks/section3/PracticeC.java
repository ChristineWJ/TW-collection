package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collection3 = new HashMap<>();

        Iterator<String> iter = collectionA.iterator();
        String h="";
        while(iter.hasNext()){
            h = iter.next();
            if(collection3.get(h)==null){
                collection3.put(h,1);
            }else{
                int oldValaue=collection3.get(h);
                collection3.put(h,oldValaue+1);
            }
        }
        PracticeB practiceB=new PracticeB();
        return practiceB.createUpdatedCollection(collection3,object);


    }
}
