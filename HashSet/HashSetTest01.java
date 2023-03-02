package learninging0910.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("111");
        hashset.add("222");
        hashset.add("333");
        hashset.add("333");//此行无效，hash集合中存储元素无序，不可重复
        for (String a :hashset){
            System.out.println(a);
        }
    }
}
