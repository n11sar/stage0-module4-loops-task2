package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;

        while (i <= printToInclusive){
            checkPrime(i);
            i++;
        }
    }

    static void checkPrime(int n){
        int i, m, flag = 0;
        m= n / 2;
        for(i = 2; i <= m; i++){
            if(n % i == 0){
                flag = 1;
                break;
                }
            }
        if(flag == 0)  {
            System.out.println(n);
        }
    }
}
