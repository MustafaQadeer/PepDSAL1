// import java.util.*;
// public class anybaseaddition {
// public static int add(int n1,int n2,int b){
//     int rv=0;
//     int p=0;
//     int carry=0;
//     while (n1!=0 || n2!=0) {
//         int rem1=n1%10;
//         int rem2=n2%10;
//         n1=n1/10;
//         n2=n2/10;
//         int sum=rem1+rem2+carry;
//         int dig=sum%b;
//         int q=sum/b;
//         carry=q;
//         rv=rv+dig*(int)Math.pow(10,p);
//         p++;
//     }    
//     rv=rv+carry*(int)Math.pow(10,p);
//     return rv;    
// }
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     int n1=scn.nextInt();
//     int n2=scn.nextInt();
//     int b=scn.nextInt();

//     int ans=add(n1,n2,b);
//     System.out.println(ans);
    
// }
// }

import java.util.*;
public class anybaseaddition {
public static int add(int n1,int n2,int b){
    int rv=0;
    int c=0;
    int p=1;
    while (n1>0||n2>0||c>0) {
        int d1=n1%10;
        int d2=n2%10;
        n1=n1/10;
        n2=n2/10;
        int d=d1+d2+c;
        c=d/b;
        d=d%b;
        rv+=d*p;
        p=p*10;

    }
    return rv;
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int b=scn.nextInt();

    int ans=add(n1,n2,b);
    System.out.println(ans);
}
}