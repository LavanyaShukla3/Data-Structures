//stack height logn

public class xn2{

    public static int calPow(int x,int n){
        if (n==0){ //base cas 1
            return 1;
        }
        if(x==0){//base case 2
            return 0;
        }
        // n is even
        if(n%2==0){
            return calPow(x,n/2)*calPow(x,n/2);
        }
        else{
            //n is odd
            return calPow(x, n/2)*calPow(x, n/2)*x;
        }
    }
    public static void main(String[] args){

        int x=2;
        int n=5;

        int ans=calPow(x,n);
        System.out.println(ans);
    }

    
}
    
    
