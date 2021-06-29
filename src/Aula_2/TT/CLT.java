package Aula_2.TT;

public class CLT implements Funcionario {

    private Cargo cargo;

    public CLT(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void pagarSalario() {
        double pagar = this.cargo.calculaSalario();
        System.out.println("(CLT)Salário+bonificação pago ao " + this.cargo.getNome() + " : R$ " + pagar);
    }
}
