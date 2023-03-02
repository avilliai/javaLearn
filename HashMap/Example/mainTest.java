package learninging0910.HashMap.Example;

import java.util.HashSet;
import java.util.Set;

public class mainTest {
    public static void main(String[] args) {
        Student s1 = new Student("mika");
        Student s2 = new Student("mika");

        System.out.println(s1.equals(s2));//false，未重写equals方法。重写equals后为true
        System.out.println("s1的hashCode: "+s1.hashCode());//通过hash算法转换为下标
        System.out.println("s2的hashCode: "+s2.hashCode());//重写hashcode方法后s1,s2的hashcode相同

        /*已知hashSet集合特点：无序不可重复
        * */
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("set集合的大小为："+students.size());//推测为1，结果为2，重复。重写hashcode方法后，为1
        /*向map集合中存取元素时，都是默认先调用key的hashCode方法，然后调用equals方法，equals方法不一定被调用
        *用put(k,v)举例
        *这里就出现了重复现象，所以hashCode方法必须重写
        *
        *
        * */
    }
}
