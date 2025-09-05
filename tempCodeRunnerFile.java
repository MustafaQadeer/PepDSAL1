import java.util.*;
public class InfixConversions {
public static int precedence(char optor){
    if (optor=='+') {
        return 1;
        
    }else if (optor=='-') {
        return 1;
    }else if (optor=='*') {
        return 2;
    }else{
        return 2;
    }
}

public static String solvepre(String v1pre, String v2pre, char optor){
    return optor+v1pre+v2pre;
}
public static String solvepost(String v1post, String v2post, char optor){
    return v1post+v2post+optor;
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter expression: ");
    String exp=scn.nextLine();

    Stack<String> pre= new Stack<>();
    Stack<String> op= new Stack<>();
    Stack<Character> post= new Stack<>();

    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if (ch=='(') {
            op.push(ch);
        }else if (Character.isDigit(ch)) {
            pre.push(ch+"");
            post.push(ch+"");
        }else if (ch==')') {
            while (op.peek()!='(') {
                char optor=op.pop();
                String v2pre=pre.pop();
                String v1pre=pre.pop();
                String v2post=post.pop();
                String v1post=post.pop();

                String opvpre=solvepre(v1pre,v2pre,optor);
                String opvpost=solvepost(v1post,v2post,optor);
            }

        }else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
            while (op.size()>0 && op.peek()!='(' && precedence(ch)<=precedence(op.peek())) {
                char optor=op.pop();
                String v2pre=pre.pop();
                String v1pre=pre.pop();
                String v2post=post.pop();
                String v1post=post.pop();

                String opvpre=solvepre(v1pre,v2pre,optor);
                String opvpost=solvepost(v1post,v2post,optor);
            }
            op.push(ch);
            
        }
    }
    while(op.size()>0){
        char optor=op.pop();
        String v2pre=pre.pop();
        String v1pre=pre.pop();
        String v2post=post.pop();
        String v1post=post.pop();

        String opvpre=solvepre(v1pre,v2pre,optor);
        String opvpost=solvepost(v1post,v2post,optor);
    }

    System.out.println(pre.peek());
    System.out.println(pre.peek());
}
}
