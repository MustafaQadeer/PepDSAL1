import java.util.*;
public class InfixConversions {
public static int precedence(char optor){
    if (optor=='+' || optor=='-') {
        return 1;
    }
    else if (optor=='*' || optor=='/') {
        return 2;
    }
    else{
        return 0;
    }
}

public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter expression: ");
    String exp=scn.nextLine();

    Stack<String> pre= new Stack<>();
    Stack<Character> op= new Stack<>();
    Stack<String> post= new Stack<>();

    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if (ch=='(') {
            op.push(ch);
        }else if ((ch>='0' && ch<='9')||(ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
            pre.push(ch+"");
            post.push(ch+"");
        }else if (ch==')') {
            while (op.peek()!='(') {
                char optor=op.pop();

                String v2pre=pre.pop();
                String v1pre=pre.pop();
                String vpre=optor+v1pre+v2pre;
                pre.push(vpre);

                String v2post=post.pop();
                String v1post=post.pop();
                String vpost=v1post+v2post+optor;
                post.push(vpost);

                
            }
            op.pop();

        }else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
            while (op.size()>0 && op.peek()!='(' && precedence(ch)<=precedence(op.peek())) {
                char optor=op.pop();

                String v2pre=pre.pop();
                String v1pre=pre.pop();
                String vpre=optor+v1pre+v2pre;
                pre.push(vpre);

                String v2post=post.pop();
                String v1post=post.pop();
                String vpost=v1post+v2post+optor;
                post.push(vpost);
            }
            op.push(ch);
            
        }
    }
    while(op.size()>0){
        char optor=op.pop();

        String v2pre=pre.pop();
        String v1pre=pre.pop();
        String vpre=optor+v1pre+v2pre;
        pre.push(vpre);

        String v2post=post.pop();
        String v1post=post.pop();
        String vpost=v1post+v2post+optor;
        post.push(vpost);
    }

    System.out.println(pre.peek());
    System.out.println(post.peek());
}
}
