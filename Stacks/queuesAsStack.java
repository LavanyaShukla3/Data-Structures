import java.util.Stack;
class queuesAsStacks{
    public static void main(String[] args){
        Stack st1= new Stack();
        Stack st2= new Stack();
        int[] nos= {1,2,5};
        for(int i=0; i<nos.length;i++){
            st1.push(nos[i]);
        }
        System.out.println(st2.push(st1.pop));

    }
}