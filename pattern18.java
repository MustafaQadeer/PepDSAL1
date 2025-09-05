// import java.util.*;
// public class pattern18 {
// public static void main(String[] args) {
//     Scanner scn= new Scanner(System.in);
//     int n=scn.nextInt();
//     int sp=0;
//     int st=n;
//     int isp=n/2;

//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=sp;j++){
//             System.out.print("\t");
//         }
//         if(i<=n/2 && i!=1){
//             System.out.print("*\t");
//             for(int k=1;k<=isp;k++){
//                 System.out.print("\t");
//             }
//             System.out.print("*\t");
//             isp-=2;

//         }
//         else{
//             for(int l=1;l<=st;l++){
//                 System.out.print("*\t");
//             }
//         }
//         if(i<=n/2){
//             sp++;
//             st-=2;
//         }
//         else{
//             sp--;
//             st+=2;
//         }
//         System.out.println();
//     }
// }
// }



import java.util.*;
public class pattern18 {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int sp=0;
    int st=n;


    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            System.out.print("\t");
        }
        for(int k=1;k<=st;k++){
            if(i>1 && i<=n/2 && k>1 && k<st){
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
       }
        if(i<=n/2){
            sp++;
            st-=2;
        }
        else{
            sp--;
            st+=2;
        }
        System.out.println();
    }
}
}

