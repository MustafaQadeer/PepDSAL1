import java.util.*;
public class myquest3 {
public static void main(String[]arg){
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=scn.nextInt();

    int sum=0;
    int temp=n;
    for(int div=2;div<=temp;div++){
        if(temp%div==0){
            int q=temp/div;
            sum=sum+q;
        }
    }
    if(sum==n){
        System.out.println(n+" is perfect number");
    }
    else{
        System.out.println(n+" is not perfect number");
    }
}
}
