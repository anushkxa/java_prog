public class friendpair{

    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=pair(n-1);
        int fnm2= pair(n-2);
        int pairways=(n-1)*fnm2;
        int ways= fnm1+pairways;
        
        return ways;

    }
    public static void main(String[] args) {
        System.out.print(pair(3));

    }
}