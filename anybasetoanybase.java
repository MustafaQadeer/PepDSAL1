// import java.util.*;
// public class anybasetoanybase {
// public static int convert(int n, int b1, int b2){
//     int rv=0;
//     int dec=0;
//     int p=1;
//     int p2=1;
//     while (n>0) {
//         int dig=n%10;
//         n=n/10;
//         dec+=dig*p;
//         p=p*b1;

//     }
//     while (dec>0) {
//         int dig2=dec%b2;
//         dec=dec/b2;
//         rv+=dig2*p2;
//         p2=p2*10;
//     }

//     return rv;
// }
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     System.out.print("Enter no: ");
//     int n=scn.nextInt();
//     System.out.print("Enter current base:");
//     int b1=scn.nextInt();
//     System.out.print("Enter final base: ");
//     int b2=scn.nextInt();

//     int ans=convert(n,b1,b2);
//     System.out.println(ans);
    


// }
// }

import java.util.*;
public class anybasetoanybase {
public static int covertdeci(int n, int b1){
    int rv=0;
    int p=1;
    while (n>0) {
        int dig=n%10;
        n=n/10;
        rv+=dig*p;
        p=p*b1;
    }
    
    return rv;

}
public static int convertany(int dec, int b2){
    int rv=0;
    int p=1;
    while (dec>0) {
        int dig=dec%b2;
        dec=dec/b2;
        rv+=dig*p;
        p=p*10;
    }
    return rv;
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int b1=scn.nextInt();
    int b2=scn.nextInt();

    int dec=covertdeci(n,b1);
    int dn=convertany(dec,b2);
    System.out.println(dn);
}

}