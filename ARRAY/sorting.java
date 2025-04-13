public class sorting{
    public static void insertion(int arr[]){
        int n = arr.length;
        for(int i=1;i<arr.length;i++){
            int j= i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


}