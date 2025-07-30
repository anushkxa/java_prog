public class bitman {
    public static int binToDec(int n){
        int ans=0;
        int pw=1;
        while(n>0){
            int rem=n%10;
            ans+=rem*pw;
            n/=10;
            pw*=2;
        }
        return ans;

    }
    public static int decToBin(int n){
        int ans=0;
        int mul=1;
    
        while(n>0){
            int parity=n%2;
            ans+=parity*mul;
            n=n/2;
            mul*=10;
        }
        return ans;


    }

    public static int /*logn complex*/ fastExponential(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print(fastExponential(3, 5));
    }
}
