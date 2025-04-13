public class Insertion{
    public static class Stack{
        int[] arr=new int[100];
        int size=arr.length;
        int idx=0;
        void push(int x){
            if(idx>size){
                System.out.println("Stack is full");
            }
            else{
                arr[idx]=x;
                idx++;
            }
        }

        void pop(){
            if(idx==0){
                System.out.println("Stack is empty");
            }
            else{
                arr[idx-1]=0;
                idx--;
            }
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(8);
        st.push(7);
        st.push(44);
        st.push(12);
        st.display();
        System.err.println("");
        st.pop();
        st.pop();
        st.display();
    }
}