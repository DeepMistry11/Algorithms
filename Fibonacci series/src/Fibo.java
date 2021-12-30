public class Fibo {

    public long[] calculate(int input){
        long[] Numbers = new long[input];
        Numbers[0] = 0;
        Numbers[1] = 1;

        if(input <= 1){
            System.out.println("cant form series with these many numbers");
        }else{
            System.out.println(Numbers[0]);
            System.out.println(Numbers[1]);
            for(int i = 2; i < input; i++ ){
                Numbers[i] = Numbers[i-1] + Numbers[i-2];
                System.out.println(Numbers[i]);
            }
        }
        return Numbers;
    }
}
