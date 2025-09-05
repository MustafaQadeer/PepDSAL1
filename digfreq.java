import java.util.*;
public class digfreq {
public static int freq(int x, int y){
    int count=0;
    while(x>0){
        int r=x%10;
        if(r==y){
            count++;
        }
        x=x/10;
    }
    return count;
}

public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no.: ");
    int n=scn.nextInt();
    System.out.print("Enter no. to find: ");
    int no=scn.nextInt();

    int ans=freq(n,no);
    System.out.println(ans);


}
}

