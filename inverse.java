import java.util.*;
public class inverse {
public static void main(String[]arg){
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=scn.nextInt();
    int i=0;
    int temp=n;
    int j=0;

    while (temp!=0) {
        int dig=temp%10;
        i++;

        temp=temp/10; 
        int p=(int)Math.pow(10,dig-1);
        int inv=i*p;
        j=j+inv;
    }
    System.out.println("inverse of "+n+" is "+j);

    
    }

    
}

