import java.util.*;
public class pattern5 {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter no." );
    int n = scn. nextInt();
    int sp=n/2;
    int st=1;
   
    for(int i=1;i<=n;i++){
        if(i<=(n/2)){
           // System.out.println(sp+","+st); just to understand

           for(int j=1;j<=sp;j++){
            System.out.print("\t");
           }
           for(int j=1;j<=st;j++){
            System.out.print("*\t");
            
           }
            sp--;
            st=st+2;
            
        }
        else if(i>(n/2)){
            //System.out.println(sp+","+st); just to understand
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
               for(int j=1;j<=st;j++){
                System.out.print("*\t");
                
            }
            sp++;
            st=st-2;
           
        }
        System.out.println("");

    }
    
    
}
}