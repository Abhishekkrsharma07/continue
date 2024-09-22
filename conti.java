public class conti{
    public static void main(String []args){
        int i,j;

        for(i=0;i<=3;i++){

            for(j=0;j<=3;i++){

                if(i==2&&j==2){

                    continue;

                }
                System.out.println(i + " " + j);
            }
        }
    }
}

//TAKING INPUT FROM THE USER USING SCANNER CLASS
/*
 * import java.util.Scanner;

public class abhi{

    public static void main(String []args){
        int i, j ,n, m;

        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the value of n and m : ");
        
        n=sc.nextInt();
        m=sc.nextInt();
        
        for(i=0;i<=n;i++){

            for(j=1;j<=m;j++){

                if(i==2&&j==2){

                    continue;

                }
                System.out.println(i + " " + j);
            }
        }
    }
}
 */
