// import java.util.*;
// public class pattern2 {
// public static void main(String[]arg){
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter no.: ");
//     int n= scn.nextInt();

//     for(int i=1;i<=n;i++){
//         for(int j=n;j>=i;j--){
//             System.out.print("*\t");
//         }
//         System.out.println("");
//     }
// }
// }

//__________sir's way___________

import java.util.*;
public class pattern2 {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no.: ");
    int n=scn.nextInt();
    for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
        System.out.println("");
    }
}
}