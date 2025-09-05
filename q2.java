// basic code

// import java.util.*;
// public class q2{
// public static void main(String[]arg){

//     Scanner scn=new Scanner(System.in);
//     System.out. print("Enter no. of numbers: ");
//     int t=scn.nextInt();

    
//     for(int i=1; i<=t; i++){
//         System.out.print("Enter your number: ");
//         int n=scn.nextInt();

//         int count=0;
//         for(int div=1; div<=n; div++){
            
//             if(n%div==0){
//                 count++;
//             }
//         }

//         if(count==2){
//             System.out.println(n+ " is prime");
//         }
//         else{
//             System.out.println(n+" is not prime");
//         }
        
        
        
        
//         }



//     }


// }




// is basic code ne time bohot le liya matlab hamain time complexity
// manage karnin hogi

//@@@@@@@@@@@

//MODIFIED CODE 1 

// import java.util.*;
// public class q2 {
// public static void main(String[]arg){

//     Scanner scn= new Scanner(System.in);

//     System.out.print("Enter no. of numbers: ");
//     int t=scn.nextInt();

//     for(int i=0; i<=t; i++){
//         System.out.print("Enter the number: ");
//         int n=scn.nextInt();
//         int count=0;
//         for(int div=2; div*div<=n; div++){
//             if(n%div==0){
//                 count++;
                
//             }
//         }
//         if(count==0){
//             System.out.println(n+" is prime");
//         }
//         else{
//             System.out.println(n+" is not prime");
//         }


//         }
    



// }
// }


// MODIFIED CODE 2 (BEST CODE)

import java.util.*;
public class q2{
public static void main(String[]arg){

    Scanner scn= new Scanner(System.in);
    System.out.print("Enter no. of numbers: ");
    int t=scn.nextInt();

    for(int i=0; i<=t; i++){
        System.out.print("Enter number: ");
        int n= scn.nextInt();
        
        int count=0;
        for(int div=2; div*div<=n; div++){
            if(n%div==0){
                count++;
                break;
            }


        }

        if(count==0){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
    }


}

    
}

