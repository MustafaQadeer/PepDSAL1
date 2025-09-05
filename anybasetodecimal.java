import java.util.*;
public class anybasetodecimal {
public static int convert(int n, int b){
    int rv=0;
    int p=1;
    while (n>0) {
        int dig=n%10;
        n=n/10;
        rv+=dig*p;
        p=p*b;

    }

    return rv;
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no: ");
    int n=scn.nextInt();
    System.out.print("Enter base: ");
    int b=scn.nextInt();

    int ans=convert(n,b);
    System.out.println(ans);
}
}