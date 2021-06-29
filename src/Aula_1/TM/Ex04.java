package Aula_1.TM;

public class Ex04 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 0 || n == 1)
            return;
        for (int i = 2; i < n; i++) {
            boolean isPrimo = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo)
                System.out.println(i);
        }
    }
}