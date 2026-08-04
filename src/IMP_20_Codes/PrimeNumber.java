package IMP_20_Codes;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 29;
        boolean prime= true;

        if(num<=1)
            prime= false;

        for (int i = 2;i<=Math.sqrt(num);i++){

            if(num%i==0){
                prime= false;
            break;
        }
    }
    if(prime)
        System.out.println("Prime Number");
    else
        System.out.println("Not Prime Number");



}}
