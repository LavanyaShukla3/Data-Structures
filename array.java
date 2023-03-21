import java.util.Arrays;
public class array{
    public static void frequency(int[] a, int k, int n){
        int p = n/k;
        Arrays.sort(a);
        int count=0;
        for(int i=1; i<n; i++){
            if(a[i]==a[i-1]){
                count++;
                if(count>p){
                    System.out.println(a[i]);
                }
            }
        }
        
    }
    public static void main(String[] args){
        int[] arr= {3, 1, 2, 2, 1, 2, 3, 3};
        int k= 4;
        int n= arr.length;
        frequency(arr,k,n);
    }
}