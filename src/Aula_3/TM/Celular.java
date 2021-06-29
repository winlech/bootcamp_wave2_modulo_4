package Aula_3.TM;

public class Celular implements Precedente<Celular>{

    private String holder;
    private String number;

    public Celular(String holder, String number) {
        this.holder = holder;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.holder.compareToIgnoreCase(celular.holder);
    }
}
