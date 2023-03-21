//stack height n
public class xn{

    public static int calPow(int x,int n){
        if (n==0){ //base cas 1
            return 1;
        }
        if(x==0){//base case 2
            return 0;
        }

        int xpownm1 = calPow(x, n-1);//kaam
        int xpown= x*xpownm1;
        return xpown;
    }
    public static void main(String[] args){

        int x=2;
        int n=5;

        // int fin = x; recursion 

        // while((n-1)!=0){
        //     fin *= x;
        //     n--; 
        // }
        // System.out.println(fin);

        int ans=calPow(x,n);
        System.out.println(ans);
    }

    
}