package Aula_1.TM;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o n: ");
        int n = s.nextInt();
        System.out.println("Informe o m (qtd de digitos): ");
        int m = s.nextInt();
        System.out.println("Informe o d (digito procurado): ");
        int d = s.nextInt();

        int actualNumber = (int) Math.pow(10, (m - 1));
        int countN = 0;

        while (countN < n) {
            char[] digits = Integer.toString(actualNumber).toCharArray();
            int countDigit = 0;
            for (char digit : digits) {
                int digitNbr = Character.getNumericValue(digit);
                if (digitNbr == d)
                    countDigit++;
            }
            if (countDigit == m) {
                System.out.println(actualNumber);
                countN++;
            }
            actualNumber++;
        }
    }
}