package learninging0910.GenericTest01;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringJoiner;

public class GenergicTest01 {
    public static void main(String[] args) {
        //"不使用泛型"
        /*ArrayList<Object> list = new ArrayList<Object>();
        Animal cat = new cat();
        Animal bird = new bird();
        list.add(bird);
        list.add("sfuahf");
        list.add(cat);
        list.add(new cat());
        list.add("fajfaj");
        list.add("1212");
        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof cat){
                ((cat) obj).catchMouse();     //需要进行强转
            }else if (obj instanceof bird){
                ((bird) obj).fly();
            }else {
                System.out.println("-------------------");
                System.out.println("没有合适的目标");

                System.out.println("当前内容为"+obj.toString());
                System.out.println("-------------------");
            }
            System.out.println("----------------本次循环结束-------------------");
        }

         */
        //进行泛型的使用
        cat cat1 = new cat();
        bird bird1 = new bird();
        Collection<Animal> list = new ArrayList<Animal>();
        list.add(new bird());
        list.add(cat1);
        list.add(bird1);
        //list.add("sefjai");
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()){
            Animal a= iterator.next();
            System.out.println("成功迭代至------>"+a.toString());
            if (a instanceof cat){
                System.out.print(a.toString());
                ((cat) a).catchMouse();
            }
            if (a instanceof bird){
                System.out.print(a.toString());
                ((bird) a).fly();
            }




        }

    }
}
class Animal{
    public void move(){
        System.out.println("进行了一次移动");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
                .toString();
    }
}
class cat extends Animal{
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", cat.class.getSimpleName() + "[", "]")
                .toString();
    }
}
class bird extends Animal{
    public void fly(){
        System.out.println("鸟起飞了");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", bird.class.getSimpleName() + "[", "]")
                .toString();
    }
}
