import java.util.*;
public class funcpractmy {
public static int lastdigit(int x){
    int ld=x%10;
    return ld;
}
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();

    int ans=lastdigit(n);
    System.out.println(ans);
}
}