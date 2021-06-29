package Aula_2.TT;

public class Diretor extends Cargo{
    private double lucro;

    public Diretor(String nome, double bonificaçao, double salario, double lucro) {
        super(nome, bonificaçao, salario);
        this.lucro = lucro;
    }

    @Override
    public double calculaSalario() {
        double participaoLucros = this.getBonificaçao() * this.lucro;
        return participaoLucros + this.getSalario();
    }
}
