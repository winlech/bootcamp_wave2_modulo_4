package Aula_2.TM;

public class TesteData {
    public static void main(String[] args) {
        Data dh = new Data("22/01/2021");
        Data dh2 = new Data(1999, 1, 5);


        System.out.println(dh);
        dh.adicionarDias(5);
        System.out.println(dh);

        System.out.println(dh2);
        dh2.adicionarDias(5);
        System.out.println(dh2);
    }
}
