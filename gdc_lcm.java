//_______________________MY WAY (BRUTE FORCE FOR GCD)_____________________________
// import java.util.*;
// public class gdc_lcm {
// public static void main(String[]arg){
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter bigger no.: ");
//     int n1=scn.nextInt();
//     System.out.print("Enter smaller no.: ");
//     int n2=scn.nextInt();

    
//     for(int div=n1;div>=2;div--){
//         if(n2%div==0 && n1%div==0){
//             System.out.println(div);
//             break;
//         }
//     }

    
    
// }
// }

import java.util.*;
public class gdc_lcm {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter bigger no.: ");
    int n1=scn.nextInt();
    System.out.print("Enter smaller no.: ");
    int n2=scn.nextInt();

    int on1=n1;
    int on2=n2;
    while(n1%n2!=0){
        int rem=n1%n2;
        n1=n2;
        n2=rem;
    }
    int gcd=n2;
    System.out.println(gcd);
    int lcm=(on1*on2)/gcd;
    System.out.println(lcm);
    
}
}