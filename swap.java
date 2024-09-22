
import java.util.Scanner;

public class swap {
public static void main(String[] args){

    int a,b;
    System.out.println("Enter the nubers: ");

    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Before swapping"+ a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping"+a+" "+b);
    sc.close();
}


}
