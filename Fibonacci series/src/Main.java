import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        calculate(n);
    }


        public static void calculate(int input){
            long[] Numbers = new long[input];
            Numbers[0] = 0;
            Numbers[1] = 1;
            for(int i = 2; i < input; i++ ){
                Numbers[i] = Numbers[i-1] + Numbers[i-2];
                System.out.println(Numbers[input]);
            }

        }

}
