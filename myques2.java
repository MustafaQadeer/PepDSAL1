import java.util.*;
public class myques2{
public static void main(String[]arg){
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n= scn.nextInt();
    int temp=n;
    int arm=0;
    while(temp>0){
        int r=temp%10;
        int rcube=(int)Math.pow(r,3);
        arm=arm+rcube;
        temp=temp/10;
    }
    if (n==arm) {
        System.out.println(n+" is an armstrong number");
    }
    else{
        System.out.println(n+" is not an armstrong number");
    }
}
}
