import java.util.*;
public class SmallestNumberFollowingPattern {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter expressoin: ");
    String exp=scn.nextLine();

    int num=1;
    Stack st=new Stack<>();

    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);

        if (ch=='d') {
            st.push(num);
            num++;
        }else{
            st.push(num);
            num++;

            while (st.size()>0) {
                System.out.print(st.pop());
            }
        }
    }

    st.push(num);
    while (st.size()>0) {
        System.out.print(st.pop());
    }
}
}