//import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class Deques{
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(3);
        deque.add(1);
        System.out.println(deque.remove());
    }
}