package learninging0910.collection;

import org.xml.sax.helpers.ParserAdapter;

import java.util.ArrayList;
import java.util.Collection;

/*
*collection接口中的常用方法
*1、collection中能存储什么元素？
*   使用泛型之前可以存储obj所有子类
*   使用后只能存储指定类型
*   集合中不能存储基本数据类型，实际上存储的是java对象
* 2、collection中的常用方法
*   boolean add(Object e) 向集合中添加元素
*   int size() 获取集合中元素个数
*   void clear() 清空集合
*   boolean contains(Object o) 判断集合中是否包含元素o
* */
public class collection {
    public static void main(String[] args) {
    //创建一个集合对象。不能创建，因为接口是抽象的，不能实例化
        // Collection c = new Collection();
        Collection c = new ArrayList();//父类型引用指向子类型对象Collection-->list-->Arraylist
        //测试常用方法
        c.add(12121);//自动装箱了，实际上放进去一个对象地址。Integer X =new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new adfafd());
        c.add(true);
        System.out.println("集合中元素个数为"+c.size());//5
        c.clear();//对集合进行清空
        System.out.println("集合中元素个数为"+c.size());//0
        c.add("hello");
        c.add("world");
        c.add("梓宝可爱捏");
        System.out.println("是否包含："+c.contains("梓宝可爱捏"));//true
        System.out.println("集合中元素个数为"+c.size());//3
        c.remove("hello");//删除一个集合中的元素
        System.out.println("集合中元素个数为"+c.size());//2

    }

}
class adfafd {

}
