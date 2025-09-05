// import java.util.*;
// public class decimaltoanybase {
// public static int convert(int x, int y){
//     int rv=0;
//     int count=0;
//     while (x>0) {
//         int rem=x%y;
//         x=x/y;
//         rv=rv+rem*(int)Math.pow(10, count);
//         count++;
//     }
//     return rv;
// }
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     System.out.print("Enter no.:" );
//     int n=scn.nextInt();
//     System.out.print("Enter base:");
//     int b=scn.nextInt(); 

//     int ans=convert(n,b);
//     System.out.println(ans);
// }
// }

import java.util.*;
public class decimaltoanybase {
public static int convert(int x, int y){
    int rv=0;
    int p=1;
    while (x>0) {
        int rem=x%y;
        x=x/y;
        rv+=rem*p;
        p=p*10;
    }
    return rv;
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no.:" );
    int n=scn.nextInt();
    System.out.print("Enter base:");
    int b=scn.nextInt(); 

    int ans=convert(n,b);
    System.out.println(ans);
}
}