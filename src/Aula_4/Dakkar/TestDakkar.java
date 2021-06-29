package Aula_4.Dakkar;

public class TestDakkar {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(200.0, 1000, "X1", 4);

        corrida.registrarCarro(14, 5, 49, "MVD8754");
        corrida.registrarCarro(20, 5, 49, "MYQ7718");
        corrida.registrarMoto(11, 8, 47, "NEX1510");
        corrida.registrarMoto(12, 3, 48, "MZK7098");

        corrida.registrarCarro(10, 5, 49, "MVD8754");

        corrida.socorrerMoto("MZK7098");
        corrida.socorrerCarro("NEX1510");

        corrida.removerVeiculoPorPlaca("MZK7098");

        Veiculo veiculo = corrida.getVencedor();
        System.out.println("Vencedor: " + veiculo);
    }
}
