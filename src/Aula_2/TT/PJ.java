package Aula_2.TT;

public class PJ implements Funcionario{
    private double valorHora;
    private double horasTrabalhadas;

    public PJ(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void pagarSalario() {
        double salario = (double) (this.valorHora * this.horasTrabalhadas);
        System.out.println("(PJ)Salário pago: R$ " + salario);
    }
}
