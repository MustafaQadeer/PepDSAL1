import java.util.*;
public class StackIntro {
public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();

    st.push(10);
    System.out.println(st);
    st.push(20);
    st.push(30);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st.size());
}
}