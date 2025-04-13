public class impl{
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void push(int x){
            Node temp= new Node(x);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                head.next=temp;
                head=temp;
            }
        }

        void insertbeg(int x){
            Node temp = new Node(x);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        int size(){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }

        void deleteatend(){
            if(head==null){
                System.out.print("List is empty");
                return;
            }
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            int x= secondLast.next.data;
        // Delete the last node
            secondLast.next = null;
            System.out.print(x);
            
        }

        void deleteatbeg(){
            if(head==null){
                System.out.print("List is empty");
            }
            else{
                head=head.next;
            }
        }
        
        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.push(9);
        ll.push(10);
        ll.push(100);
        ll.push(6);
        ll.push(12);
        ll.push(5);
        ll.display();
        System.out.println();
        ll.deleteatbeg();
        ll.deleteatbeg();
        ll.display();
        //System.out.print(ll.size());
        
    }
}