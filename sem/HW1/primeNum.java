package sem.HW1;
//Вывести все простые числа от 1 до 1000

public class primeNum {
    public static void main(String[]args) {
        for (int i=2;i<1000;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {   
        if (n <= 1)
        return false;
        
        if (n == 2 || n == 3)
            return true;
            
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
