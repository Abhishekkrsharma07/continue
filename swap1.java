public class swap1{

    public static void main(String [] args){

        //swapping the values with the help of three varible

        int a,b,t;

        a=10;
        b=30;
        System.out.println("Value before swapping : "+a +","+b);

        t=a;
        a=b;
        b=t;

        System.out.println("After swapping :"+a+","+b);
    }
}