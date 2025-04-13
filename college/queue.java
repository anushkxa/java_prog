public class queue {
    public static class Queue{
        int f=-1;
        int r=-1;
        int[] arr= new int[6];
        void push(int x){
            if(f==-1){
                arr[f+1]=x;
                f++;
                r++;
            }else{
                arr[r+1]=x;
                r++;
            }
        }
        void pop(){
            if(f==-1){
                System.out.println("List is empty");
            }else{
                int temp=arr[f];
                f++;
            }
        }
        void display(){
            for(int i=f;i<=r;i++){
                System.out.println(arr[i]);
            }
        }

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void push(int x){
            Node temp=new Node(x);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        void pop(){
            if(head==null){
                System.out.println("List is emplty");
            }else{
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                int x= temp.next.data;
                tail=temp;
                tail.next=null;
                System.out.println(x);
            }
        } 
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }


    public static void main(String[] args) {
        Linkedlist q= new Linkedlist();
        q.push(9);
        q.push(10);
        q.push(12);
        q.push(11);
        q.display();
        System.err.println("---------------------");
        q.pop();
        q.pop();
        System.err.println("---------------------");
        q.display();
    }
}
