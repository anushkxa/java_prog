import java.util.*;
public class rev{
    public static int diagonalSum(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static int zeroSum(int[][] arr){
        int count=0;
        int m=arr[0].length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }


    public static void  transpose(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] newarr=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newarr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.err.print(newarr[i][j]);
            }
            System.err.println("");
        }
        reverse(newarr);
    }


    public static void reverse(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] newnewArr=new int[n][m];
        for(int i=0;i<n;i++){
            int p=m;
            for(int j=0;j<m;j++){
                newnewArr[i][j]=arr[i][p-1];
                p--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.err.print(newnewArr[i][j]);
            }
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        transpose(arr);
        // reverse(arr);
    }
}