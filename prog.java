import java.util.Scanner;

/**
 * Created by hp on 4/18/2018.
 */
public class prog {
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int s=a+b;
        System.out.print("Sum of "+a+" and "+b+" is "+s);
        int m=a-b;
        System.out.print("Subtraction of "+a+" and "+b+" is "+s);

    }
}
