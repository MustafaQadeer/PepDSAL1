 //MY WAY MY WAY MY WAY MY WAY

// import java.util.*;
// public class q3 {
// public static void main(String[]arg){

//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter lower number: ");
//     int low=scn.nextInt();
//     System.out.print("Enter higher number: ");
//     int high=scn.nextInt();

//     for(int i=low; i<=high; i++){
//         int count=0;
//         for(int div=1; div<=i; div++){
//             if(i%div==0){
//                 count++;
//             }

//         }

//         if(count==2){
//             System.out.println(i);
//         }

//     }




// }
// }

//MODIFIED CODE FOR TIME COMPLEXITY

import java.util.*;
public class q3 {
public static void main(String[]arg){

    Scanner scn= new Scanner(System.in);
    System.out.print("Enter lower number: ");
    int low=scn.nextInt();
    System.out.print("Enter higher number: ");
    int high=scn.nextInt();

    for(int i=low; i<=high; i++){
        int count=0;
        for(int div=2; div*div<=i; div++){
            if(i%div==0){
                count++;
                break;
            }

        }

        if(count==0){
            System.out.println(i);
        }
        
    }




}
}