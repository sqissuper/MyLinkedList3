class Node{
    public Node next;
    public int val;
    //默认构造方法
    public Node(){

    }
    public Node(int val){
        this.val = val;
    }
}
    public class MyLinkedList {
    //打印链表
    public void disPlay(){
        Node ret = this.head;
        while(ret != null){

            System.out.print(ret.val + " ");
            ret = ret.next;
        }
    }

//反转链表
    public Node reversList(){
        Node ret = this.head;
        Node prev = null;
        Node newHead = null;
        while(ret != null){
            Node retNext = ret.next;
            if(retNext == null){
                newHead = ret;
            }
            ret.next = prev;
            prev = ret;
            ret = retNext;

        }
        return newHead;
    }

    //头插法反转链表
    public Node reverseList1(){
        Node ret = this.head;
        Node prev = new Node();
        //Node newHead = null;
        while(ret != null){
            Node retNext = ret.next;
            ret.next = prev.next;
            prev.next = ret;
            ret = retNext;
        }
        return prev.next;
    }

    //返回中间的值
    public Node midNode(){
        Node fir = this.head;//第一步先走
        Node sec = this.head;//第二步
        while(fir != null && fir.next != null){
            fir = fir.next.next;
            sec = sec.next;
        }
        return sec;
    }

    public Node head;//头节点
    //创建链表
    public void creatList(){
        this.head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        this.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }
     Node ret = myList.reversList();//反转链表
        //打印反转链表
        while(ret != null){
            System.out.print(ret.val + " ");
            ret = ret.next;
        }
        Node ret = myList.midNode();//返回中间值
        System.out.println(ret.val);
    }
}
