package Aula_3.TM;

import java.util.Arrays;

public class TestPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("wincenty", "12345");
        Pessoa p2 = new Pessoa("Hugo", "767678");
        Pessoa p3 = new Pessoa("Carlos", "453453");
        Pessoa p4 = new Pessoa("Renato", "788");
        Pessoa p5 = new Pessoa("Tatiane", "2313");
        Pessoa p6 = new Pessoa("Zuila", "43535");
        Pessoa p7 = new Pessoa("Abate", "8979");

        Pessoa[] pessoas = {p1, p2, p3, p4, p5, p6, p7};

        SortUtil.sort(pessoas);

        System.out.println(Arrays.toString(pessoas));
    }
}
