//MY WAY 
// import java.util.Scanner;
// public class rotatenum {
// public static void main(String[]arg){
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter no.: ");
//     int n=scn.nextInt();
//     System.out.print("Enter no. of rotations: ");
//     int k=scn.nextInt();
//     //calculating no. of digits of n
//     int tempn=n;
//     int dign=0;
//     while(tempn!=0){
//         tempn=tempn/10;
//         dign++;
//     }
//     if(k>0){
//         int newk=0;
//         if(k>dign){
//             while(k>dign){
//                 k=k-dign;
//                 newk=k;
//             }
//         }
//         else if(k<dign){
//             newk=k;
            
//         }
//     int p1=(int)Math.pow(10,newk);
//     int q=n/p1;
//     int tempq=q;
//     int digq=0;
//     while(tempq!=0){
//         tempq=tempq/10;
//         digq++;
//     }
//     int r=n%p1;
//     int p2=(int)Math.pow(10,digq);
//     int ans1=q+r*p2;
//     System.out.println(ans1);
//     }
//     else if(k<0){
//         int pk=-1*k;
//         int opk=dign-pk;
//         int nopk=0;
//         if(opk>dign){
//             while(opk>0){
//                 opk=opk-dign;
//                 nopk=opk;
//             }
//         }
//         else if(opk<dign){
//             nopk=opk;
//         }
//     int p3=(int)Math.pow(10,nopk);
//     int nq=n/p3;
//     int nr=n%p3;
//     int dignq=0;
//     int tempnq=nq;
//     while(tempnq>0){
//         tempnq=tempnq/10;
//         dignq++;
//     }
//     int p4=(int)Math.pow(10,dignq);
//     int ans2=nq+nr*p4;
//     System.out.println(ans2);
//     }
        

// } 
// }

//TOUTORIAL WAY
 
import java.util.*;
public class rotatenum {
public static void main(String[] args) {

    Scanner scn= new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=scn.nextInt();
    System.out.print("Enter the no. of rotations: ");
    int k=scn.nextInt();

    int temp=n;
    int nod=0;
    while(temp>0){
        temp=temp/10;
        nod++;
    }

    k=k%nod;
    if(k<0){
        k=nod+k;
    }
    int div=1;
    int mul=1;
    for(int i=1;i<=nod;i++){
        if(i<=k){
            div=div*10;
        }
        else{
            mul=mul*10;
        }
    }
    int q=n/div;
    int r=n%div;

    int rot=r*mul+q;
    System.out.println(rot);
}
}
