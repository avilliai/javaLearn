package learninging0910.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/*
* 关于集合遍历/迭代
*
*
* */
public class collection01 {
    /*
    * 以下使用的遍历/迭代方式是collection通用方式
    * 在map集合中不可用
    * */
    public static void main(String[] args) {
        Collection co = new ArrayList();
        co.add("ada");
        co.add("des");
        co.add(100);
        co.add(new Object());
        //对集合co进行迭代
        //1.获取集合的迭代器对象Iterator
        //集合只要发生改变，迭代器就需要重新获取
       Iterator iterator= co.iterator();//这就是迭代器
        //迭代器对象里有三个方法hasNext() next() remove()
        //2.通过获取的迭代器对象开始迭代/遍历
        /*
        *boolean hasNext() 如果仍然有元素可以迭代，返回true
        *Object next() 返回迭代的下一个元素
        *void remove() 从迭代器指向的collection 中移除迭代器返回的最后一个元素（可选操作）
        * */
        boolean s = iterator.hasNext();
        System.out.println("当前集合中的元素数量"+co.size());
        System.out.println("当前是否有元素可以迭代:"+iterator.hasNext());
        /*
        * if (s) {
            Object obj = iterator.next();//迭代器向前一位并返回指向的元素
            System.out.println("取到了元素" + obj.toString());
            }
        * 判断是否有元素如果有就取出
        *
        *
        * */
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("当前集合迭代完成");

    }


}
