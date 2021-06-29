package Aula_3.TM;

import java.util.Arrays;

public class TestCelular {
    public static void main(String[] args) {

        Celular p1 = new Celular("wincenty", "12345");
        Celular p2 = new Celular("Hugo", "767678");
        Celular p3 = new Celular("Carlos", "453453");
        Celular p4 = new Celular("Renato", "788");
        Celular p5 = new Celular("Tatiane", "2313");
        Celular p6 = new Celular("Zuila", "43535");
        Celular p7 = new Celular("Abate", "8979");

        Celular[] celulares = {p1, p2, p3, p4, p5, p6, p7};

        SortUtil.sort(celulares);

        System.out.println(Arrays.toString(celulares));
    }
}
