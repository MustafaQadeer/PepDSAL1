import java.util.*;
public class anybasemultiplication {
public static void multiply(int n1, int n2, int b){
    int c=0;
    int rv=0;
    int p=1;
    while (n1>0) {
        int d1=n1%10;
        n1=n1/10;
        while (n2>0) {
            int d2=n2%10;
            n2=n2/10;
            int m=d1*d2+c;
            c=m/b;
            int d=m%b;
            rv+=d*p;
            p*=10;
        }
        System.out.println(rv);
    }

}
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int b=scn.nextInt();

    multiply(n1,n2,b);
}
}