//my way kind of
//import java.util.*;
// public class pattern3 {
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     System.out.print("Enter no.: ");
//     int n= scn.nextInt();

//     for(int i=1;i<=n;i++){
//         for(int j=n-1;j>=i;j--){
//             System.out.print("\t");
//         }
//         for(int k=1;k<=i;k++){
//             System.out.print("*\t");
//         }
//         System.out.println();

//     }
// }
// }
//sir' way
import java.util.*;
public class pattern3 {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no.: ");
    int n= scn.nextInt();

    int sp=n-1;
    int st=1;

    for(int i=1;i<=n;i++){
        //System.out.println(sp+","+st); just to explain
        for(int j=1;j<=sp;j++){
            System.out.print("\t");
        }
        for(int j=1;j<=st;j++){
            System.out.print("*\t");
        }
        System.out.println("");
        sp--;
        st++;
    }
}
}