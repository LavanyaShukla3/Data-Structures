import java.util.*;
public class Que{
    public static void main(String[] args){
        Queue<Integer> que= new LinkedList<>();
        que.add(13);
        que.add(4);
        System.out.println(que.peek());
        System.out.println(que.remove());
        System.out.println(que.remove());

    }
}