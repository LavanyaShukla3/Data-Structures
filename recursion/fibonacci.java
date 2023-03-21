public class fibonacci{

    public static void fib(int a, int b, int p){
            
        while(p==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fib(b,c,p-1);
    }
    public static void main(String[] args){
        int a =0;
        int b= 1;
        int n= 5;
        int p= n-2;
        System.out.println(a);
        System.out.println(b);
        fib(0,1, 3);
    }

    
}