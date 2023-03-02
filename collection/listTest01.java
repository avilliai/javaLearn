package learninging0910.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
* 测试List接口中常用方法
* List集合特点
*   有序：list集合中的元素有下标，从0开始
*   可重复：存储一个元素，可重复
*List集合特有方法
*   void add(int index，Object element);
*   Object get(int index);
*   int indexOf(Object o);
*   int lastIndexOf(Object o);
*   Object remove(int index);
*   Object set(int index,Object element);
* */
public class listTest01 {
    public static void main(String[] args) {
        List as = new ArrayList<>();
        as.add("a");
        as.add("b");
        as.add("c");
        as.add("d");
        Iterator iterator = as.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
       /* System.out.println("----------------------->");
        as.add(1,11);
        Iterator iterator1 = as.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println(as.get(1));

        */
        //测试list集合特有的遍历方式
        System.out.println("----------------------->");//这是一条分割线
        for (int i = 0; i < as.size(); i++) {
            System.out.println(as.get(i));
        }
    }
}
