package day05;
import java.util.LinkedList;

/**
 * @ClassName LastNode
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/2 8:47]
 * @Version 1.0
 **/

public class LastNode {
    public Object testLastNode(LinkedList head,int location){
        int address=head.size()-location;
        LinkedList temp=head;
        return head.get(address);//下标从0号位置开始
    }
    public Node myLastNode(Node head,int location){
        Node temp=head;
        int address=this.length(head)-location+1;
        while(address!=1){
           temp=temp.next;
           address--;
        }
        return temp;
    }
    public int length(Node head){
        Node temp=head;
        int num=0;
        while(temp!=null){
            temp=temp.next;
            num++;
        }
        return num;
    }
    public static void main(String[] args) {
     LastNode node =new LastNode();
     LinkedList<Integer> head=new LinkedList<>();
     head.addLast(1);
     head.addLast(2);
     head.addLast(3);
     head.addLast(4);
     head.addLast(5);
        //System.out.println(node.testLastNode(head,4));
        //System.out.println(node.testLastNode(head,3));
     Node n=new Node(1);
     n.next=new Node(2);
     n.next.next=new Node(3);
     n.next.next.next=new Node(4);
     n.next.next.next.next=new Node(5);
        System.out.println(node.myLastNode(n,4));
        System.out.println(node.myLastNode(n,3));






    }

}
class Node {
    int data;
    Node next=null;

    public Node(int data) {
        this.data = data;
    }
     public Node() {
    }
    public String toString(){
        return String.format("%d",data);
    }
}