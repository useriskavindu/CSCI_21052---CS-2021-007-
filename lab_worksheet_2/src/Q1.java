public class Q1 {
    public static void main(String[] args) {

        int i;
        int count = 0;



        for(i=10; i<50; i++){
            System.out.print(i + " ");
            count++;

            if(count >= 10) {
                System.out.println("");
                count = 0;
            }
        }

    }
}
