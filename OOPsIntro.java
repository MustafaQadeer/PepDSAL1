import java.util.*;
public class OOPsIntro {
    public static class Person {
        int age;//data member
        String name;//data member
        void saysHi(){
            System.out.println(name+"["+age+"] says hi");
        }
        
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=10;
        p1.name="A";
        //p1.saysHi();

        Person p2=new Person();
        p2.age=20;
        p2.name="B";
        //p2.saysHi();

        //EXPERIMENT
        // Person p3=p1;
        // p3.age=30;
        // p3.saysHi();
        // p1.saysHi();

        //for swap games
        p1.saysHi();
        p2.saysHi();
        swap3(p1, p2);
        p1.saysHi();
        p2.saysHi();
        //they won't swap in swap game 1
    }

    //SWAP GAME 1

    // public static void swap1(Person psn1, Person psn2){
    //     Person temp=psn1;
    //     psn1=psn2;
    //     psn2=temp;
           
          //isme heap me changes nahi ho rahe isliye swap nahi ho raha
    // }

    //SWAP GAME 2
    // public static void swap2(Person psn1, Person psn2){
    //     int age=psn1.age;
    //     psn1.age=psn2.age;
    //     psn2.age=age;

    //     String name=psn1.name;
    //     psn1.name=psn2.name;
    //     psn2.name=name;

    //     //isme heap me changes ho rahe hain isliye swap ho raha hai
    // }

    public static void swap3(Person psn1, Person psn2){
        psn1=new Person();//new memory provided to psn1

        int age=psn1.age;
        psn1.age=psn2.age;
        psn2.age=age;

        psn2=new Person(); // now new memory is provided to psn2

        String name=psn1.name;
        psn1.name=psn2.name;
        psn2.name=name;
    }
}