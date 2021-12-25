import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int length;
        Scanner ip = new Scanner(System.in);
        length = ip.nextInt();

        int[] numbers = new int[length];

        for (int i = 0 ; i < numbers.length; i++ ) {
            numbers[i] = ip.nextInt();
        }

        Arrays.sort(numbers);

        long maxProduct;
        long last = numbers[length-1];
        long secondLast = numbers[length-2];

        if(length > 1){
            maxProduct = last * secondLast;
            System.out.println(maxProduct);
        }else{
            System.out.println("You need atleast 2 numbers to find max product ");
        }

    }
}
