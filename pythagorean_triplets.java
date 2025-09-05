//____________________MY WAY____________________________-
// import java.util.*;
// public class pythagorean_triplets {
// public static void main(String[] args) {
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter first side: ");
//     int n1=scn.nextInt();
//     System.out.print("Enter second side: ");
//     int n2=scn.nextInt();
//     System.out.print("Enter third side: ");
//     int n3=scn.nextInt();
//     int ns1=n1*n1;
//     int ns2=n2*n2;    
//     int ns3=n3*n3;
//     if(n1>=n2&&n1>=n3){
//         if(ns1==ns2+ns3){
//             System.out.println("Right angled triangle");
//         }
//         else{
//             System.out.println("Not a right angled triangle");
//         }
//     }
//     else if(n2>=n1&&n2>=n3){
//         if(ns2==ns1+ns3){
//             System.out.println("Right angled triangle");
//         }
//         else{
//             System.out.println("Not a right angled triangle");
//         }
//     }
//     else if(n3>=n1&&n3>=n2){
//         if(ns3==ns2+ns1){
//             System.out.println("Right angled triangle");
//         }
//         else{
//             System.out.println("Not a right angled triangle");
//         }
//     }
    
    
// }
// }

//________________________SIR'S WAY______________________________
import java.util.*;
public class pythagorean_triplets {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a=scn.nextInt();
    System.out.print("Enter second number: ");
    int b=scn.nextInt();    
    System.out.print("Enter third number: ");
    int c=scn.nextInt();

    int max=a;
    if(b>=max){
        max=b;
    }
    if(c>=max){
        max=c;
    }
    if(max==a){
        boolean flag= (b*b+c*c==a*a);
        System.out.println(flag);
    }
    else if(max==b){
        boolean flag= (a*a+c*c==b*b);
        System.out.println(flag);

    }
    else{
        boolean flag= (b*b+a*a==c*c);
        System.out.println(flag);

    }

}
}