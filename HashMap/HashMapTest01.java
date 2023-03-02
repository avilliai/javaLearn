package learninging0910.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
/*
* 因为Integer类和String类重写了equals方法，所以这里不用重写
*
*
*
* */
        Map<Integer,String> map=new HashMap<>();
        map.put(1111,"abc");
        map.put(2222,"def");
        map.put(3333,"ghi");
        map.put(4444,"jkl");
        map.put(5555,"aadss");
        map.put(5555,"aads4");
        System.out.println(map.size());
        System.out.println(map.get(5555));//aads4，说明key重复时会自动覆盖

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> node :set){
            System.out.println("k:"+node.getKey()+"   v:"+node.getValue());
        }
    }
}
