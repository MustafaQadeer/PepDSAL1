// ______________BRUTE FORCE__________________
// import java.util.*;
// public class benjamin_bulbs {
// public static void main(String[] args) {
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter no. of bulbs: ");
//     int n=scn.nextInt();

//     for(int b=1;b<=n;b++){
//         int count=0;
//         for(int f=1;f<=n;f++){
//             if(b%f==0){
//                 count++;
//             }
//         }
//         if(count%2!=0){
//             System.out.println(b);
//         }

        
//     }

// }
// }
// ________________OPTIMIZED(SIR'S WAY)_______________
import java.util.*;
public class benjamin_bulbs {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter no. of bulbs: ");
    int n=scn.nextInt();

    for(int i=1;i*i<=n;i++){
        System.out.println(i*i);

    }

}
}