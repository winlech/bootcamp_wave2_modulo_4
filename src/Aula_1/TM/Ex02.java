package Aula_1.TM;

public class Ex02 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            if(i%m == 0)
                System.out.println(i);
        }
    }
}