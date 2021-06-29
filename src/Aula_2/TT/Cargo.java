package Aula_2.TT;

public class Cargo {
    private String nome;
    private double bonificaçao;
    private double salario;

    public Cargo(String nome, double bonificaçao, double salario) {
        this.nome = nome;
        this.bonificaçao = bonificaçao;
        this.salario = salario;
    }

    public double calculaSalario() {
        return this.salario + (this.bonificaçao * this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBonificaçao() {
        return bonificaçao;
    }

    public void setBonificaçao(double bonificaçao) {
        this.bonificaçao = bonificaçao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
