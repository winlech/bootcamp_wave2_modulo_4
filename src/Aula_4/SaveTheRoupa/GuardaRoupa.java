package Aula_4.SaveTheRoupa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> dict;
    int i;

    public GuardaRoupa() {
        this.dict = new HashMap<>();
        this.i = 1;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        int senha = this.i;
        this.i++;
        this.dict.put(senha, listaDeVestuario);
        return senha;
    }

    public void mostrarVestuarios() {
        for (Map.Entry<Integer, List<Vestuario>> entrada: this.dict.entrySet()
             ) {
            System.out.println("Senha: " + entrada.getKey());
            System.out.println("Roupas: " + entrada.getValue());
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> lista = this.dict.get(id);
        this.dict.remove(id);
        return lista;
    }
}
