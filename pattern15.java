// import java.util.*;
// public class pattern15 {
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     int n=scn.nextInt();
//     int sp=n/2;
//     int st=1;
//     int val=1;
//     int min=2;
//     for(int i=1;i<=n;i++){
//         if(i<=(n/2)+1){
//             val=i;
//         }
//         else{
//             val=i-min;
//             min+=2;
//         }
//         for(int j=1;j<=sp;j++){
//             System.out.print("\t");
//         }
//         for(int k=1;k<=st;k++){
//             System.out.print(val+"\t");
//             if(k<=st/2){
//                 val++;
//             }
//             else{
//                 val--;
//             }
            
//         }

//         if(i<=n/2){
//             sp--;
//             st+=2;
//         }
//         else{
//             sp++;
//             st-=2;
//         }
//         System.out.println();
//     }
// }
// }

import java.util.*;
public class pattern15 {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int sp=n/2;
    int st=1;
    int val=1;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            System.out.print("\t");
        }
        int cval=val;
        for(int k=1;k<=st;k++){
            System.out.print(cval+"\t");
            if(k<=n/2){
                cval++;
            }
            else{
                cval--;
            }
        }
        if(i<=n/2){
            sp--;
            st+=2;
            val++;
        }
        else{
            sp++;
            st-=2;
            val--;
        }
        System.out.println();
    }
}
}