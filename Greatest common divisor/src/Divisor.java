// For integers a and b, their greatest common divisor or GCD(a,b) is the largest integer d so that d divides both a and b.
public class Divisor {
    public int GCD(int a, int b){
//  aP is the remainder when a is divided by b.
//  so GCD(a, b) = GCD(aP, b) = GCD(b, aP)
//  if greatest common divisor divides a and b then it also divides aP and b.
        int aP = 0;
        if(b == 0){
            return a;
        }else{
            while(b != 0){ //here we are running loop recursively until we reach b=0.
// here we are finding remainder when a divided by b.
                aP = a % b;
// here we are replacing b's position with a. we kind of also keep this as it is. like b at it original position.
                a = b;
                b = aP;
                System.out.println(b);
            }
        }
        return b;
    }
}
