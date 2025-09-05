// import java.util.*;
// public class pattern16 {
// public static void main(String[] args) {
//     Scanner scn= new Scanner(System.in);
//     int n=scn.nextInt();

//     int sp=2*n-3;
//     int st=1;
//     int val=1;

//     for(int i=1;i<=n;i++){
//         int cval=val;
//         for(int j=1;j<=st;j++){
//             System.out.print(cval+"\t");
//             cval++;
            
//         }

//         for(int k=1;k<=sp;k++){
//             System.out.print("\t");
//         }

//         if(sp==-1){
//             cval--;
//         }
//         for(int l=1;l<=st;l++){
//             cval--;
//             if(cval==0){
//                 break;
//             }
//             System.out.print(cval+"\t");  
                  
            
//         }

//         sp-=2;
//         st+=1;


//         System.out.println();
//     }
// }
// }

import java.util.*;
public class pattern16 {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();

    int sp=2*n-3;
    int st=1;
    for(int i=1;i<=n;i++){
        int val=1;
        for(int j=1;j<=st;j++){
            System.out.print(val+"\t");
            val++;
        }
        for(int k=1;k<=sp;k++){
            System.out.print("\t");
        }
        if(i==n){
            st--;
            val--;
        }
        for(int l=1;l<=st;l++){
            val--;
            System.out.print(val+"\t");
        }
        System.out.println();
        sp-=2;
        st++;
    }

    
}
}