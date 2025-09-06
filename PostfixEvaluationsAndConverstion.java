import java.util.*;
public class PostfixEvaluationsAndConverstion {
public static int operation(int v1,int v2,char ch){
    if (ch=='+') {
        return v1+v2;
    }else if (ch=='-') {
        return v1-v2;
    }else if (ch=='*') {
        return v1*v2;
    }else{
        return v1/v2;
    }
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter expression: ");
    String exp=scn.nextLine();

    Stack<Integer> vs= new Stack<>();
    Stack<String> is= new Stack<>();
    Stack<String> ps= new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
        char ch=exp.charAt(i);
        if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
            // handling vs
            int vv2=vs.pop();
            int vv1=vs.pop();
            int vval=operation(vv1,vv2,ch);
            vs.push(vval);
            //handling is
            String iv2=is.pop();
            String iv1=is.pop();
            String ival="("+iv1+ch+iv2+")";
            is.push(ival);

            //handling ps
            String pv2=ps.pop();
            String pv1=ps.pop();
            String pval=ch+pv1+pv2;
            ps.push(pval);
        }else{
            vs.push(ch-'0');
            is.push(ch+"");
            ps.push(ch+"");
        }
    }
    System.out.println(vs.pop());
    System.out.println(is.pop());
    System.out.println(ps.pop());
}
}