
//HOW I WROTE IT---
// import java.util.*;
// public class qrevdigprint {
// public static void main(String[]arg){

//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter number: ");
//     int n=scn.nextInt();


//     while(n!=0){
//         System.out.println(n%10);
//         n=n/10;
//     }



// }
// }

//HOW SIR WROTE IT--

import java.util.*;
public class qrevdigprint {
public static void main(String[]arg){
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=scn.nextInt();

    while (n>0) {
        int dig=n%10;
        n=n/10;
        System.out.println(dig);
        
    }
}
}