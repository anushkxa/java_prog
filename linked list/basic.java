//import java.util.*;
public class basic{
    
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data);
        display(head.next);

        /*while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }*/
    }

    
    public static void main(String args[]){
        //Linkedlist ll= new Linkedlist();
        Node a=new Node(9);
        Node b=new Node(7);
        Node c=new Node(5);
        Node d= new Node(3);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
    }
}