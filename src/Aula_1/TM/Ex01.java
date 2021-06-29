package Aula_1.TM;

public class Ex01 {
    public static void main(String[] args) {
        int nbr = Integer.parseInt(args[0]);
        for (int i = 0; i < nbr; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}