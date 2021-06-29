package Aula_2.TT;

public class TestEx {
    public static void main(String[] args) {
        Cargo tecnico = new Cargo("tecnico", 0.05, 3200);
        Cargo analista = new Cargo("analista", 0.08, 4000);
        Cargo gerente = new Cargo("gerente", 0.125, 6000);
        Cargo diretor = new Diretor("diretor", 0.03, 15000.00, 20000.00);

        CLT tecnicoCLT = new CLT(tecnico);
        CLT analistaCLT = new CLT(analista);
        CLT gerenteCLT = new CLT(gerente);
        CLT diretorCLT = new CLT(diretor);

        tecnicoCLT.pagarSalario();
        analistaCLT.pagarSalario();
        gerenteCLT.pagarSalario();
        diretorCLT.pagarSalario();


        PJ pessoaJuridica = new PJ(200);
        pessoaJuridica.setHorasTrabalhadas(80);
        pessoaJuridica.pagarSalario();

    }
}
