import java.util.*;

public class Q3 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of rows :: ");

        int rows = scanner.nextInt();

        for(int i=1; i<=rows; i++ ){

            for(int s=1; s<=rows-i; s++){
                System.out.print(" ");
            }

            for(int a=1; a<=i; a++){
                System.out.print("* ");
            }

            System.out.println();
        }
    scanner.close();
    }
}
