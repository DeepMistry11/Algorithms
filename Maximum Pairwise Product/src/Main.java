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
        System.out.println("Enter the " + length + " numbers now.");

        for (int i = 0 ; i < numbers.length; i++ ) {
            numbers[i] = ip.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0 ; i < numbers.length; i++ ) {
            System.out.println("Sorted array: " + numbers[i]);
        }

        int maxProduct;

        if(length > 1){
            maxProduct = numbers[length-1] * numbers[length-2];
            System.out.println("Max Product is: " + maxProduct);
        }else{
            System.out.println("You need atleast 2 numbers to find max product ");
        }

    }
}
