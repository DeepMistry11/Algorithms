import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int[] values = new int[100];

        for(int i = 0; i < values.length; i++){
            values[i] = random.nextInt(1000);
        }
        System.out.println("Unsorted: ");
        unsorted(values);

        System.out.println("Sorted: ");
        sorted(values);
        unsorted(values);
    }

    public static void unsorted(int[] number){
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }

    public static void sorted(int[] number){
        for(int i = 1; i <number.length ;i++){
            int current = number[i];

            int j = i - 1;
            while(j >= 0 && number[j] > current){
                number[j+1] = number[j];
                j--;
            }
            number[j+1] = current;
        }
    }
}
