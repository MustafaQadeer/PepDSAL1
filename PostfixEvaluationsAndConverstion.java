import java.util.*;

import javax.print.DocFlavor.STRING;
public class PostfixEvaluationsAndConverstion {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter expression: ");
    String exp=scn.nextLine();

    Stack<Integer> vs=new Stack<>();
    Stack<String> is= new Stack<>();
    Stack<String> ps= new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
        char ch=exp.charAt(i);

        if ((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A' && ch<='Z')) {
            vs.push(ch+'0');
            is.push(ch+"");
            ps.push(ch+"");
        }
        else if (ch=='+') {
            //vs handiling
            int v2vs=vs.pop();
            int v1vs=vs.pop();
            int vsval=v1vs+v2vs;
            vs.push(vsval);

            //is handling
            String v2is=is.pop();
            String v1is=is.pop();
            String isval="("+v1is+"+"+v2is+")";
            is.push(isval);

            //ps handling
            String v2ps=ps.pop();
            String v1ps=ps.pop();
            String psval="+"+v1ps+v2ps+;
            ps.push(psval);
        }else if (ch=='-') {
            //vs handiling
            int v2vs=vs.pop();
            int v1vs=vs.pop();
            int vsval=v1vs-v2vs;
            vs.push(vsval);

            //is handling
            String v2is=is.pop();
            String v1is=is.pop();
            String isval="("+v1is+"-"+v2is+")";
            is.push(isval);

            //ps handling
            String v2ps=ps.pop();
            String v1ps=ps.pop();
            String psval="-"+v1ps+v2ps+;
            ps.push(psval);
            
        }else if (ch=='*') {
            //vs handiling
            int v2vs=vs.pop();
            int v1vs=vs.pop();
            int vsval=v1vs*v2vs;
            vs.push(vsval);

            //is handling
            String v2is=is.pop();
            String v1is=is.pop();
            String isval="("+v1is+"*"+v2is+")";
            is.push(isval);

            //ps handling
            String v2ps=ps.pop();
            String v1ps=ps.pop();
            String psval=v1ps+v2ps+'*';
            ps.push(psval);
            
        }else if (ch=='/') {
            //vs handiling
            int v2vs=vs.pop();
            int v1vs=vs.pop();
            int vsval=v1vs/v2vs;
            vs.push(vsval);

            //is handling
            String v2is=is.pop();
            String v1is=is.pop();
            String isval="("+v1is+"/"+v2is+")";
            is.push(isval);

            //ps handling
            String v2ps=ps.pop();
            String v1ps=ps.pop();
            String psval=v1ps+v2ps+"/";
            ps.push(psval);
            
        }
    }
    System.out.println(vs.peek());
    System.out.println(is.peek());
    System.out.println(ps.peek());


    

}
}
