import java.util.*;
public class myques1 {
public static void main(String[]arg){
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n=scn.nextInt();
   
    int ori=n;
    int rev=0;
    while(n>0){
        int r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    if(ori==rev){
        System.out.println("pallindrome");
    }
    else{
        System.out.println("not a pallindrome");
    }


        
    }

}
