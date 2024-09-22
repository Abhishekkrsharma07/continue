
// Getting the value from the user and do the operation using CONTINUE function.......................
import java.util.Scanner;

public class getcont {
    public static void main(String[] rags) {

        int x, y;

        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        int i, j;

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 4; j++) {

                if (i == 2 && j == 4) {
                    continue;
                }

                System.out.println(i + " " + j);
            }

        }
    }
}
