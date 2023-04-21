package sem.sem2;
//Дано четное число N (>0) и символы c1 и c2. 
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("num ");
        int num = iScanner.nextInt();

        System.out.printf("c1 ");
        String c1 = iScanner.next();

        System.out.printf("c2 ");
        String c2 = iScanner.next();
        iScanner.close();

        System.out.println(returnString(num, c1.charAt(0), c2.charAt(0))); 

    }

    private static String returnString(int num, char c1, char c2 ) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < num/2; i++) {
            finalString.append(c1);
            finalString.append(c2);
        }
        return finalString.toString();
    }
}
