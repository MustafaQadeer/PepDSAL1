//______________________MY WAY (VERY LESS EFFICIENT BUT WORKS)__________________________________
// import java.util.*;
// public class prime_factorization {
// public static void main(String[]arg){
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter number: ");
//     int n=scn.nextInt();

//     while(n>1){
        
//         for(int div=2;div<=n;div++){
//             int count=0; 
//             for(int divc=2;divc<=div;divc++){
//                 if(div%divc==0){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 while(n%div==0){
//                     System.out.println(div);
//                     n=n/div;
//                 }
                
//             }

//         }
//     }
// }
// }

//________________________________SIR WAY(EFFICIENT)_______________________________
import java.util.*;
public class prime_factorization {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=scn.nextInt();

    for(int div=2;div*div<=n;div++){
        while(n%div==0){
            n=n/div;
            System.out.println(div);

        }
    }
    if(n!=1){
        System.out.print(n);
    }
    }
    
    
}
