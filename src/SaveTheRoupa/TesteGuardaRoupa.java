package SaveTheRoupa;

import java.util.ArrayList;
import java.util.List;

public class TesteGuardaRoupa {
    public static void main(String[] args) {
        Vestuario jaqueta = new Vestuario("nike", "turbo");
        Vestuario blazer = new Vestuario("oggi", "seila");

        List<Vestuario> lista = new ArrayList<>();
        lista.add(jaqueta);
        lista.add(blazer);

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarVestuarios(lista);
        guardaRoupa.guardarVestuarios(lista);

        guardaRoupa.mostrarVestuarios();

        System.out.println("--------Retirado senha 1");
        guardaRoupa.devolverVestuarios(1);
        guardaRoupa.mostrarVestuarios();


    }
}
