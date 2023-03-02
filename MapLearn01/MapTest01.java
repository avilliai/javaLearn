package learninging0910.MapLearn01;
/*
*Map和Collection没有继承关系
*Map集合以key和value的方式存储数据，键值对
*  key和value都是引用数据类型
*  key和value都是存储对象的内存地址
*  key为主导
*
*
* */

import java.awt.*;
import java.awt.List;
import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String>  map=new HashMap<>();

        //向map集合中
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        Set<Integer> keys=map.keySet();//获取所有的key，返回一个set集合
        //使用迭代器进行遍历
        Iterator<Integer> integer1= keys.iterator();
        while (integer1.hasNext()){
            System.out.println("迭代器取出"+integer1.next());
        }
        //增强for循环进行遍历
        for (Integer a:keys){
            System.out.println(a+"="+map.get(a));//map.get(a)  取出key为a的value
        }
        //Set<Map.Entry<K,V>> set= map.entrySet()
        //把map集合全部转换成set集合
        Set<Map.Entry<Integer,String>> set1= map.entrySet();
        //此时遍历这个set集合即可
        Iterator<Map.Entry<Integer,String>> iterator2 = set1.iterator();
        while (iterator2.hasNext()){
            System.out.println("集合转换遍历结果"+iterator2.next());
        }
        //大数据量时使用此方法
        for (Map.Entry<Integer,String> node:set1){
            System.out.println("转换后的增强for循环,k:"+node.getKey()+"     v:"+node.getValue());
        }
    }
}
