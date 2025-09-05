import java.util.*;

public class qfibonacci{
public static void main(String[]arg){
    Scanner scn=new Scanner(System.in);

    System.out.print("Enter no. of fibonacci: ");
    int n=scn.nextInt();

    int a=0;
    int b=1;

    for(int i=0; i<n; i++){
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
    }
}
}