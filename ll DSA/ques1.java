
public class ques1 {
    public  static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
        
    }
    public static Node nthnode(Node head, int idx){
        int size=0;
        Node temp=head;
        while(temp!= null){
            size++;
            temp=temp.next;          
        }
        int m = size-idx+1; //5-2+1==4
        //mth node froom start
        temp=head;
        for(int i=1;i<m;i++){//
            temp=temp.next;
        }
        return temp;

    }
    public static Node lastsenode(Node head, int n){
        Node fast=head;
        Node slow=head;
        for(int i=1; i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        /*Node r= slow;
        r.val = r.next.val;
        r.next = r.next.next;
        return r;*/
        //another method
        slow.next=slow.next.next;
  
        return head;


    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    
    public static void main (String[] args) {
        Node a = new Node(1);
        Node b= new Node(5);
        Node c = new Node(3);
        Node d = new Node(17);
        Node e = new Node(55);
        a.next = b;
        b.next = c;
        c.next=d;
        d.next=e;
        
        Node p= lastsenode(a, 5);
        System.out.println(p.val);
        display(a);
    }
}
