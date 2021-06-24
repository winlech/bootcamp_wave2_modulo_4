package parte2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int i = 0;
        double total = 0;
        Scanner s = new Scanner(System.in);
        Produto[] arrPrd = new Produto[3];

        while(i < 3) {
            arrPrd[i] = new Produto();

            arrPrd[i].setIndex(i);

            System.out.println("Informe nome do produto");
            arrPrd[i].setNome(s.nextLine());

            System.out.println("Informe quantidade do produto");
            arrPrd[i].setQtd(s.nextLine());

            System.out.println("Informe preço do produto");
            arrPrd[i].setPreco(s.nextLine());

            i++;
        }

        for(Produto prd : arrPrd) {
            System.out.printf("Produto %d\n%s\nR$%s\nQuantidade: %s\n\n", prd.getIndex(), prd.getNome(), prd.getPreco(), prd.getQtd());
            total += Double.parseDouble(prd.getPreco()) * Integer.parseInt(prd.getQtd());
        }

        System.out.println("Valor Total: R$ " + total);

    }
}
