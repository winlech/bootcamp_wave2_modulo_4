package Aula_1.TM;

public class Ex03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 0 || n == 1) {
            System.out.println("Não é primo");
            return;
        }
        for (int i = 2; i < n; i++) {
            if(n%i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("É primo");
    }
}