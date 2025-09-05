import java.util.*;
public class takeinput{
public static void main(String[]arg){

    // Scanner scn=new Scanner(System.in);
    // int n=scn.nextInt();

    // for(int i=1; i<=n; i++){
    //     System.out.println(i);
    // }

    // Scanner scn= new Scanner(System.in);
    // String name=scn.nextLine();
    // System.out.println("Your name is name: "+name);

    Scanner scn= new Scanner(System.in);

    int n=Integer.parseInt(scn.nextLine());
    String name=scn.nextLine();

    System.out.println("dear "+name+". here is the counting.");


    for(int i=1; i<=n; i++){
        
        System.out.println(i);


    }

}
}