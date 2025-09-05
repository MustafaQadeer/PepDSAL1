import java.util.*;
public class qdigcount {
public static void main(String[]arg){
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=scn.nextInt();

    int dig=0;
    while(n!=0){
        n=n/10;
        dig++;
    }
    System.out.println("number of digits is "+dig);
}
}