public class queue {
    public static class Queue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];
        void enqueue(int x){
            if(r==arr.length-1){
                System.out.print("queue is full");
            }
            if(f==-1){
                f=r=0;
                arr[f]=x;
            } 
            else{
                arr[r+1]=x;
            
            }
            r++;
            size++;
        }

        void dequeue(){
            if(r==-1){
                System.out.print("queue is empty");
            }
            else{
                f++;
                System.out.print(arr[f]);
            }
        }
        void display(){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(8);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(99);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println();
        q.display();
    }
}
