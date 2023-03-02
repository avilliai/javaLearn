package learninging0910.collection;

public class Link01 {
    Node header = null;

    //向链表中添加数据
    public void add(Object obj){
        //创建一个新的节点对象
        if (header==null) {
            header = new Node("data", null);
        }else {
            //执行到此处说明已有头节点
            //找出末尾节点，让当前末尾节点的next指向新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node("data",null);
        }
    }
    //查找最后一个节点
    private Node findLast(Node node) {
        if (node.next==null){
            return node;
        }
        //执行到此处说明当前节点不是末尾节点
        return findLast(node.next);
        //非常巧妙地使用了递归，调用findLast方法，并将下一个节点作为参数传进去
    }



    //从链表中移除数据
    public void remove(Object obj){

    }
    //修改链表中某个数据
    public void modify(Object obj){

    }
    //查找链表中某个数据
    public int find(Object obj){
        return 1;
    }
}
