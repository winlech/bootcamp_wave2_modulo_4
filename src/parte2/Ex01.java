package parte2;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] arr = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        Arrays.sort(arr);
        System.out.printf("Ordenação crescente: %s ", Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("\nOrdenação decrescente: %s ", Arrays.toString(arr));
    }
}
