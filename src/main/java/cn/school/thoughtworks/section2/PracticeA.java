package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> rst = new HashMap<>();

        Iterator<String> iter = collection1.iterator();
        String h="";
        while(iter.hasNext()){
            h = iter.next();
            if(rst.get(h)==null){
                rst.put(h,1);
            }else{
                int oldValaue=rst.get(h);
                rst.put(h,oldValaue+1);
            }
        }
        return rst;
    }

}
