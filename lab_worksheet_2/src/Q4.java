import java.util.*;

public class Q4 {

    //----------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers Do you want to store :: ");
        int input = scanner.nextInt();

        int[] store = new int [input];

        for(int i=1; i<=input; i++){
            System.out.print("Number " + i + " : " );
            store[i-1] = scanner.nextInt();
        }


       for(int b=0; b<input-1; b++){
           for(int k = 0; k<input-1; k++){
               if(store[k+1] < store[k] ){
                   int temp = store[k];
                   store[k] = store[k+1];
                   store[k+1] = temp;
               }
           }
       }

       //Additionally print the ascending array.
        System.out.println("The numbers in ascending order :: ----------------------------- ");

        for (int a=0; a<input; a++){
            System.out.print(store[a] + ", ");
        }


        for(int b=0; b<input-1; b++){
            for(int k = 0; k<input-1; k++){
                if(store[k+1] > store[k] ){
                    int temp = store[k];
                    store[k] = store[k+1];
                    store[k+1] = temp;
                }
            }
        }

        System.out.println();
        //Additionally print the descending array.
        System.out.println("The numbers in descending order :: ----------------------------- ");

        for (int x=0; x<input; ++x){
            System.out.print(store[x] + ", ");
        }

        System.out.println();
        System.out.println("The Second Largest Element in the Array is :: " + store[1]);

    }
}
